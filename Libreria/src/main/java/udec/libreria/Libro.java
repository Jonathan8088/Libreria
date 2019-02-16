/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udec.libreria;

/**
 *
 * @author Jonathan
 */
public class Libro {
    
    /**
     * atrinuto que contiene el titulo del libro
     */
    private String titulo;
    /**
     * atrinuto que contiene el autor del libro
     */
    private String autor;
    /**
     * atributo que contiene la version del libro
     */
    private byte version;
    /**
     * atributo que contiene la editorial del libro
     */
    private String editorial;
    /**
     * atributo que contiene el precio del libro
     */
    private float precio;

    /**
     * constructor que inicializa las variables
     * @param titulo
     * @param autor
     * @param version
     * @param editorial
     * @param precio 
     */
    public Libro(String titulo, String autor, byte version, String editorial, float precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.version = version;
        this.editorial = editorial;
        this.precio = precio;
    }//constructor
    
    /**
     * retorna el titulo
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }//geTitulo
    /**
     * modifica el titulo
     * @param titulo 
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }//setTitulo
    /**
     * retorna el autor
     * @return autor
     */
    public String getAutor() {
        return autor;
    }//getAutor
    /**
     * modifica el autor
     * @param autor 
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }//setAutor
    /**
     * retorna la version
     * @return version
     */
    public byte getVersion() {
        return version;
    }//getVersion
    /**
     * modifica la version
     * @param version 
     */
    public void setVersion(byte version) {
        this.version = version;
    }//setVersion
    /**
     * retorna la editorial
     * @return editorial
     */
    public String getEditorial() {
        return editorial;
    }//getEditorial
    /**
     * modifica la editorial
     * @param editorial 
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }//seEditorial
    /**
     * retorna el precio
     * @return precio
     */
    public float getPrecio() {
        return precio;
    }//getPrecio
    /**
     * modifica el precio
     * @param precio 
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }//setPrecio
    
}//Libro
