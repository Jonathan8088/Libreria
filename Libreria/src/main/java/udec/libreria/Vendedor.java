/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udec.libreria;
/**
 *Esa clase contiene los atributos y metodos propios del vendedor
 * @author Jonathan
 */
public class Vendedor {
    /**
     * atributo que contiene el codigo interno del vendedor
     */
    private int codigo;
    /**
     * atributo que contiene el nombre dle vendedor
     */
    private String nombre;
    /**
     * atributo que contiene el salario del vendedor
     */
    private float salario;
    /**
     * constructor de la clase que inicializa las variables
     * @param codigo
     * @param nombre
     * @param salario 
     */
    public Vendedor(int codigo, String nombre, float salario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.salario = salario;
    }//constructor
    
     /**
     * metodo en el cual se podra realizar la venta de libros
     */
    public void venderLibro(){
        
    }//venderLibro
    
     /**
     * metodo en el cual se podran ingresar libros al sistema
     */
    public void igresarLibro(){
        
    }//ingresarLibro
    /**
     * retorna el codigo del vendedro
     * @return codigo
     */
    public int getCodigo() {
        return codigo;
    }//getCodigo
    /**
     * modifica el codigo del vendedor
     * @param codigo 
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }//setCodigo
    /**
     * retorna el nombre del vendedor
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }//getNombre
    /**
     * modifica el nombre del vendedor
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//setNombre
    /**
     * retorna el salario del vendedor
     * @return salario
     */
    public float getSalario() {
        return salario;
    }//getSalario
    /**
     * modifica el salario del vendedor
     * @param salario 
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }//setSalario
       
}//Vendedor
