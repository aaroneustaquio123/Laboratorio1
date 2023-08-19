/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author PROPIETARIO
 */
public class Persona {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the Dni
     */
    public String getDni() {
        return Dni;
    }

    /**
     * @param Dni the Dni to set
     */
    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, String Dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Dni = Dni;
    }
    private String nombre;
    private String apellido;
    private String Dni;
    private int edad;
    
    
    public void Contenido(){
        System.out.println("\n El nombre es: " + nombre 
                          +"\n El apellido es: " + apellido 
                          + "\n El DNI es: " + Dni 
                          + "\n La edad es: " + edad);
        
    }
    
}