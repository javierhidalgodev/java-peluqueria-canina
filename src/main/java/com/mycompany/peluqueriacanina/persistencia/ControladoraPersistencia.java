package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Cuidador;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javi
 */
public class ControladoraPersistencia {

    CuidadorJpaController cuidadorJPA = new CuidadorJpaController();
    MascotaJpaController mascotaJPA = new MascotaJpaController();

    public void crearCuidador(Cuidador cuidador) {
        cuidadorJPA.create(cuidador);
    }

    public void editarCuidador(Cuidador cuidador) {
        try {
            cuidadorJPA.edit(cuidador);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarCuidador(int id) {
        try {
            cuidadorJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cuidador encontrarCuidador(int id) {
        return cuidadorJPA.findCuidador(id);
    }

    public List<Cuidador> encontrarCuidadores() {
        return cuidadorJPA.findCuidadorEntities();
    }

    // MASCOTAS
    public void crearMascota(Mascota mascota) {
        mascotaJPA.create(mascota);
    }

    public void editarMascota(Mascota mascota) {
        try {
            mascotaJPA.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarMascota(int id) {
        try {
            mascotaJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota encontarMascota(int id) {
        return mascotaJPA.findMascota(id);
    }

    public List<Mascota> encontrarMascotas() {
        return mascotaJPA.findMascotaEntities();
    }

    public void guardarMascota(Mascota mascotaNueva, Cuidador cuidadorExistente) {
        try {
            mascotaJPA.create(mascotaNueva);
            
            cuidadorJPA.edit(cuidadorExistente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
