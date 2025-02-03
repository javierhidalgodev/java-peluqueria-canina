package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Javi
 */
public class Controladora {

    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public void crearCuidador(Cuidador cuidador) {
        controladoraPersistencia.crearCuidador(cuidador);
    }

    public void editarCuidador(Cuidador cuidador) {
        controladoraPersistencia.editarCuidador(cuidador);
    }

    public void eliminarCuidador(int id) {
        controladoraPersistencia.eliminarCuidador(id);
    }

    public Cuidador encontrarCuidador(int id) {
        return controladoraPersistencia.encontrarCuidador(id);
    }

    public List<Cuidador> encontrarCuidadores() {
        return controladoraPersistencia.encontrarCuidadores();
    }

    // MASCOTAS
    public void crearMascota(Mascota mascota) {
        controladoraPersistencia.crearMascota(mascota);
    }

    public void editarMascota(Mascota mascota) {
        controladoraPersistencia.editarMascota(mascota);
    }

    public void eliminarMascota(int id) {
        controladoraPersistencia.eliminarMascota(id);
    }

    public Mascota encontrarMascota(int id) {
        return controladoraPersistencia.encontarMascota(id);
    }

    public List<Mascota> encontrarMascotas() {
        return controladoraPersistencia.encontrarMascotas();
    }

    public void guardarMascota(int idCliente, String color, String nombre, int dni_duenio, String observaciones, String raza, String alergico, String atencionEspecial, Cuidador cuidadorExistente) {

        boolean alergico_es = (alergico.equals("Sí"));
        boolean atencion_es = (atencionEspecial.equals("Sí"));
        Mascota mascotaNueva = new Mascota(idCliente, nombre, raza, color, alergico_es, atencion_es, observaciones, cuidadorExistente);

        cuidadorExistente.getMascotas().add(mascotaNueva);
        
        controladoraPersistencia.guardarMascota(mascotaNueva, cuidadorExistente);
    }
}
