/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udec.libreria;

/**
 *clase que contiene los atributos de la factua
 * @author Jonathan
 */
public class Factura {
    /**
     * atrinuto que contiene el codigo interno de la factura
     */
    private int codigoFactura;
    /**
     * atributo que cotiene el valor total de la factura
     */
    private float valorTotal;
    
    private int cedulaCliente;
    
    private int idLibro;
    
    /**
     * constructor que inicializa las variables
     * @param codigoFactura
     * @param valorTotal 
     * @param cedulaCliente
     * @param idLibro
     */
    public Factura(int codigoFactura, float valorTotal, int cedulaCliente, int idLibro) {
        this.codigoFactura = codigoFactura;
        this.valorTotal = valorTotal;
        this.cedulaCliente = cedulaCliente;
        this.idLibro = idLibro;
    }//Factura
    
    /**
     * metodo por el cual el vendedor podra generar la factura correspondiente a cada venta
     */
    public void generarFactura(){
        
    }//generarFactura
    /**
     * retorna el codigo de la factura
     * @return codigoFactura
     */
    public int getCodigoFactura() {
        return codigoFactura;
    }//getCodigoFactura
    /**
     * retorna el cdigo de la factura
     * @param codigoFactura 
     */
    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }//setCodigoFactura
    /**
     * retorna el varlo total de la factura
     * @return valorTotal
     */
    public float getValorTotal() {
        return valorTotal;
    }//getValorTotal
    /**
     * modifica el valor total de la factura
     * @param valorTotal 
     */
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }//setValorToral
    /**
     * retorna la cedula del cliente
     * @return cedulaCliente
     */
    public int getCedulaCliente() {
        return cedulaCliente;
    }//getCedulaCliente
    /**
     * modifica la cedula del cliente
     * @param cedulaCliente 
     */
    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }//setCedulaCliente
    /**
     * retorna el id del libro
     * @return idLibro
     */
    public int getIdLibro() {
        return idLibro;
    }//getIdLibro
    /**
     * modifica el id del libro
     * @param idLibro 
     */
    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }//setIdLibro
    
}//Factura
