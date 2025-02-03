/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Cuidador;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Javi
 */
public class CuidadorJpaController implements Serializable {

    public CuidadorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public CuidadorJpaController() {
        emf = Persistence.createEntityManagerFactory("peluqueriaCaninaJPU");
    }

    public void create(Cuidador cuidador) {
        if (cuidador.getMascotas() == null) {
            cuidador.setMascotas(new ArrayList<Mascota>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Mascota> attachedMascotas = new ArrayList<Mascota>();
            for (Mascota mascotasMascotaToAttach : cuidador.getMascotas()) {
                mascotasMascotaToAttach = em.getReference(mascotasMascotaToAttach.getClass(), mascotasMascotaToAttach.getNum_cliente());
                attachedMascotas.add(mascotasMascotaToAttach);
            }
            cuidador.setMascotas(attachedMascotas);
            em.persist(cuidador);
            for (Mascota mascotasMascota : cuidador.getMascotas()) {
                Cuidador oldCuidadorOfMascotasMascota = mascotasMascota.getCuidador();
                mascotasMascota.setCuidador(cuidador);
                mascotasMascota = em.merge(mascotasMascota);
                if (oldCuidadorOfMascotasMascota != null) {
                    oldCuidadorOfMascotasMascota.getMascotas().remove(mascotasMascota);
                    oldCuidadorOfMascotasMascota = em.merge(oldCuidadorOfMascotasMascota);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cuidador cuidador) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cuidador persistentCuidador = em.find(Cuidador.class, cuidador.getId_cuidador());
            List<Mascota> mascotasOld = persistentCuidador.getMascotas();
            List<Mascota> mascotasNew = cuidador.getMascotas();
            List<Mascota> attachedMascotasNew = new ArrayList<Mascota>();
            for (Mascota mascotasNewMascotaToAttach : mascotasNew) {
                mascotasNewMascotaToAttach = em.getReference(mascotasNewMascotaToAttach.getClass(), mascotasNewMascotaToAttach.getNum_cliente());
                attachedMascotasNew.add(mascotasNewMascotaToAttach);
            }
            mascotasNew = attachedMascotasNew;
            cuidador.setMascotas(mascotasNew);
            cuidador = em.merge(cuidador);
            for (Mascota mascotasOldMascota : mascotasOld) {
                if (!mascotasNew.contains(mascotasOldMascota)) {
                    mascotasOldMascota.setCuidador(null);
                    mascotasOldMascota = em.merge(mascotasOldMascota);
                }
            }
            for (Mascota mascotasNewMascota : mascotasNew) {
                if (!mascotasOld.contains(mascotasNewMascota)) {
                    Cuidador oldCuidadorOfMascotasNewMascota = mascotasNewMascota.getCuidador();
                    mascotasNewMascota.setCuidador(cuidador);
                    mascotasNewMascota = em.merge(mascotasNewMascota);
                    if (oldCuidadorOfMascotasNewMascota != null && !oldCuidadorOfMascotasNewMascota.equals(cuidador)) {
                        oldCuidadorOfMascotasNewMascota.getMascotas().remove(mascotasNewMascota);
                        oldCuidadorOfMascotasNewMascota = em.merge(oldCuidadorOfMascotasNewMascota);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cuidador.getId_cuidador();
                if (findCuidador(id) == null) {
                    throw new NonexistentEntityException("The cuidador with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cuidador cuidador;
            try {
                cuidador = em.getReference(Cuidador.class, id);
                cuidador.getId_cuidador();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cuidador with id " + id + " no longer exists.", enfe);
            }
            List<Mascota> mascotas = cuidador.getMascotas();
            for (Mascota mascotasMascota : mascotas) {
                mascotasMascota.setCuidador(null);
                mascotasMascota = em.merge(mascotasMascota);
            }
            em.remove(cuidador);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cuidador> findCuidadorEntities() {
        return findCuidadorEntities(true, -1, -1);
    }

    public List<Cuidador> findCuidadorEntities(int maxResults, int firstResult) {
        return findCuidadorEntities(false, maxResults, firstResult);
    }

    private List<Cuidador> findCuidadorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cuidador.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Cuidador findCuidador(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cuidador.class, id);
        } finally {
            em.close();
        }
    }

    public int getCuidadorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cuidador> rt = cq.from(Cuidador.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
