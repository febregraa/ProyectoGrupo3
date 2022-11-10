package Productos;

import javax.swing.JOptionPane;

public class Pedidos {

    //Josue
    private String NombreCliente, ID, Trabajo, Contacto, LugarDeEnvio, TiempoDeEntrega, NumeroDeOrden, Pedido = ""; //Datos del cliente y orden
    private int CostoDetrabajo, CostoDeEnvio; //Costos

    public void mostrarPedido() {
        JOptionPane.showMessageDialog(null, Pedido, "Datos de la Orden", 3);
    }

    public void agregarPedidos() {
        setNombreCliente(JOptionPane.showInputDialog(null, "Nombre del cliente: ", "Datos de la orden", 3));
        setID(JOptionPane.showInputDialog(null, "Número de Identidad ", "Datos de la orden", 3));
        setTrabajo(JOptionPane.showInputDialog(null, "Tipo de trabajo: ", "Datos de la orden", 3));
        setContacto(JOptionPane.showInputDialog(null, "Número al cual contactar ", "Datos de la orden", 3));
        setLugarDeEnvio(JOptionPane.showInputDialog(null, "Direccion de entrega: ", "Datos de la orden", 3));
        setTiempoDeEntrega(JOptionPane.showInputDialog(null, "Tiempo estimado para finalizar el trabajo: ", "Datos de la orden", 3));
        setNumeroDeOrden(JOptionPane.showInputDialog(null, "Ingrese el número de gestíon: ", "Datos de la orden", 3));
        setCostoDetrabajo(Integer.parseInt(JOptionPane.showInputDialog(null, "Costo del trabajo: ", "Datos de la orden", 3)));
        Pedido += ("Nombre del cliente: " + NombreCliente  +"\nID: " + ID + "\nTipo de trabajo: " + Trabajo + "\nNúmero al cual contactar: " + Contacto + "\nDireccion de entrega: " + LugarDeEnvio + "\nTiempo de : " + TiempoDeEntrega + "\nCosto del trabajo: " + CostoDetrabajo + "\nCosto del envio" + CostoDeEnvio + "\n" + "\n");

    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTrabajo() {
        return Trabajo;
    }

    public void setTrabajo(String Trabajo) {
        this.Trabajo = Trabajo;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public String getLugarDeEnvio() {
        return LugarDeEnvio;
    }

    public void setLugarDeEnvio(String LugarDeEnvio) {
        this.LugarDeEnvio = LugarDeEnvio;
    }

    public String getTiempoDeEntrega() {
        return TiempoDeEntrega;
    }

    public void setTiempoDeEntrega(String TiempoDeEntrega) {
        this.TiempoDeEntrega = TiempoDeEntrega;
    }

    public String getNumeroDeOrden() {
        return NumeroDeOrden;
    }

    public void setNumeroDeOrden(String NumeroDeOrden) {
        this.NumeroDeOrden = NumeroDeOrden;
    }

    public String getPedido() {
        return Pedido;
    }

    public void setPedido(String Pedido) {
        this.Pedido = Pedido;
    }

    public int getCostoDetrabajo() {
        return CostoDetrabajo;
    }

    public void setCostoDetrabajo(int CostoDetrabajo) {
        this.CostoDetrabajo = CostoDetrabajo;
    }

    public int getCostoDeEnvio() {
        return CostoDeEnvio;
    }

    public void setCostoDeEnvio(int CostoDeEnvio) {
        this.CostoDeEnvio = CostoDeEnvio;
    }
}
