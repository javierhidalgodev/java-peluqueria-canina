package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.logica.Mascota;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Javi
 */
@Entity
public class Cuidador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_cuidador;
    @Basic
    private String nombre;
    private String telefono;
    private String direccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cuidador")
    private List<Mascota> mascotas;

    public Cuidador() {
    }

    public Cuidador(int id_cuidador, String nombre, String telefono, String direccion, List<Mascota> mascotas) {
        this.id_cuidador = id_cuidador;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.mascotas = mascotas;
    }

    public int getId_cuidador() {
        return id_cuidador;
    }

    public void setId_cuidador(int id_cuidador) {
        this.id_cuidador = id_cuidador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Cuidador{" + "id_cuidador=" + id_cuidador + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", mascotas=" + mascotas + '}';
    }
}
