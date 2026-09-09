/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miProyecto;

/**
 *
 * @author Juan Sebastian Bohorquez
 */
public class Sala {
    
    //Atributos
    
    public int id_sala;
    public int id_responsable;
    public String nombre;
    public int capacidad;
    public boolean estado;
    
    //Constructor

    public Sala() {
    }

    public Sala(int id_sala, String nombre, boolean estado) {
        this.id_sala = id_sala;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Sala(int id_sala, int id_responsable, String nombre, int capacidad, boolean estado) {
        this.id_sala = id_sala;
        this.id_responsable = id_responsable;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estado = estado;
    }
    
    // Metodos

    public int getId_sala() {
        return id_sala;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }

    public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    public void imprimir(){
        System.out.println("{" + "id_sala: " + id_sala + ", id_responsable: " + id_responsable + ", nombre: " + nombre + ", capacidad: " + capacidad + ", estado: " + estado + "}");
    }
    
    public static void main(String[] args){
        
        Sala s1 = new Sala(1, 1, "silvia", 1, true);
        Sala s2 = new Sala(2, 3, "juan", 5, true);
        Sala s3 = new Sala(3, 2, "sebastian", 6, false);
        
        s1.imprimir();
        s2.imprimir();
        s3.imprimir();
        
    }
}