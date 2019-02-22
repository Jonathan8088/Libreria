/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udec.libreria;

/**
 *clase por la cual se administra el inventario de los libros
 * @author Jonathan
 */
public class Inventario {
    /**
     * array en el cual se recorren los libros para sus operaciones
     */
    private String libros[];
    /**
     * constructor que inicializa las variables
     * @param libros 
     */
    public Inventario(String[] libros) {
        this.libros = libros;
    }//construrctor
    
    /**
     * metodo que se llama tras cada accion en la libreria para verificar la cantidad 
     * existente de algun libro en particular, al detectar una existencia menor a 
     * 10 libros generara una alerta para dar aviso de esto
     */
    private void alerta(int cantidad){
        
    }//Alerta
    /**
     * metodo que retorna el nombre de cual es el libro mas vendido y cual el menos vendido
     */
    private String top(){
        String masVendido, menosVendido;
        return null;
    }//Top
    /**
     * metodos que retorna el nombre de  cual es el libro de mayor precio y cual es el
     * de menor precio
     */
    private String precio(){
        String mayorPrecio,menosPrecio;
        return null;
    }//Precio
    /**
     * retorna el array de libros
     * @return libros
     */
    public String[] getLibros() {
        return libros;
    }//getLibros
    /**
     * modifica el array de libros
     * @param libros 
     */
    public void setLibros(String[] libros) {
        this.libros = libros;
    }//setLibros
    
}//Inventario
