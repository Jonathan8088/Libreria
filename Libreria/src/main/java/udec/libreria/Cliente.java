/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udec.libreria;

/**
 *Clase que especifica los atributos de los cientes 
 * @author Jonathan
 * @version 1.0
 */
public class Cliente {

    /**
     * atributo que contiene la cedula del cliente
     */
    private int cedula;
    /**
     * atributo que contiene el nombre del cliente
     */
    private String nombre;

    /**
     * atributo que contiene la edad del cliente
     */
    private byte edad;
    
    /**
     * construtor que inicializa las variables
     * @param cedula
     * @param nombre
     * @param edad 
     */
    public Cliente(int cedula, String nombre, byte edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }//constructor
    
    /**
     * retorna el valor de la cedula
     * @return cedula
     */
    public int getCedula() {
        return cedula;
    }//getCedula
    /**
     * modifica la cedula
     * @param cedula 
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }//setCedula
    /**
     * retorna el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }//getNombre
    /**
     * modifica el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//setNombre
    /**
     * retorna la edad
     * @return edad
     */
    public byte getEdad() {
        return edad;
    }//getEdad
    /**
     * modifica la edad
     * @param edad 
     */
     public void setEdad(byte edad) {
        this.edad = edad;
    }//setEdad

}//Cliente
