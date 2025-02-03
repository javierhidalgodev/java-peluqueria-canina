package com.mycompany.peluqueriacanina;

import com.mycompany.peluqueriacanina.igu.Home;
import com.mycompany.peluqueriacanina.igu.CargaMascota;
import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Cuidador;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Javi
 */
public class PeluqueriaCanina {

    public static void main(String[] args) {
        
        Home cargaDatos = new Home();
        cargaDatos.setVisible(true);
        
        // 1. Creo un lista de mascotas vacía para el cuidador
//        List<Mascota> mascotas_cuidador_1 = new ArrayList<>();
//        List<Mascota> mascotas_cuidador_2 = new ArrayList<>();
        
        // 2. Creo cuidador, con lista de mascotas vacía
//        Cuidador cuidador_1 = new Cuidador(123, "Mario", "Vaquerizo", "C/Amapolas", mascotas_cuidador_1);
//        Cuidador cuidador_2 = new Cuidador(234, "Virginia", "Morales", "C/Margaritas", mascotas_cuidador_2);
//        
//        controladora.crearCuidador(cuidador_1);
//        controladora.crearCuidador(cuidador_2);
        
        // 3. Creo las mascotas, las inserto en la base de datos, y edito el cuidador con sus mascotas
//        Mascota mascota_1 = new Mascota(987, "Perry", "Omnitorrinco", "Turquesa", true, true, "Nada de nada", cuidador_1);
//        Mascota mascota_2 = new Mascota(654, "Lasy", "Perro", "Blanco y canela", false, true, "Mu' bonico", cuidador_2);
//        Mascota mascota_3 = new Mascota(321, "Topota", "Topo", "Marrón", true, false, "... madre", cuidador_1);
//        Mascota mascota_4 = new Mascota(852, "My Little Pony", "Unicornio", "Blanco", false, false, "Tiene un cuerno", cuidador_2);
//        
//        mascotas_cuidador_1.add(mascota_1);
//        mascotas_cuidador_1.add(mascota_3);
//        mascotas_cuidador_2.add(mascota_2);
//        mascotas_cuidador_2.add(mascota_4);
//        
//        controladora.crearMascota(mascota_1);
//        controladora.crearMascota(mascota_2);
//        controladora.crearMascota(mascota_3);
//        controladora.crearMascota(mascota_4);
//        
//        cuidador_1.setMascotas(mascotas_cuidador_1);
//        cuidador_2.setMascotas(mascotas_cuidador_2);
//        
//        controladora.editarCuidador(cuidador_1);
//        controladora.editarCuidador(cuidador_2);
        
        // 4. Obtengo y muestro la data
//        List<Cuidador> cuidadores = controladora.encontrarCuidadores();
//        
//        for(Cuidador c : cuidadores) {
//            System.out.println(c.toString());
//        }
//        
//        List<Mascota> mascotas = controladora.encontrarMascotas();
//        
//        for(Mascota m : mascotas) {
//            System.out.println(m.toString());
//        }
    }
}
