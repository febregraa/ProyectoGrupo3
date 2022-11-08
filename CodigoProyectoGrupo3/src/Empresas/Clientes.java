package Empresas;
import javax.swing.JOptionPane;
public class Clientes {
    // Felipe
    private String nombreCliente; // Principalmente empresas
    private String IDcliente;
    private String telefonoCliente;
    private String emailCliente;

    // Metodo constructor
    public Clientes (String _nombreCliente, String _IDcliente, String _telefonoCliente, String _emailCliente){
        nombreCliente = _nombreCliente;
        IDcliente = _IDcliente;
        telefonoCliente = _telefonoCliente;
        emailCliente = _emailCliente;
    }
    // Solcitud de datos
    public void ingresoDatosCliente (){
        // Esta forma de obtencion de datos es momentanea mientras se decide cual estructura de almacenamiento de datos se utiliza
        nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        IDcliente = JOptionPane.showInputDialog("Ingrese el ID del cliente");
        telefonoCliente = JOptionPane.showInputDialog("Ingrese el numero telefonico del cliente");
        emailCliente = JOptionPane.showInputDialog("Ingrese el email del cliente");
    }
    public void mostrarDatosCliente(){
        JOptionPane.showMessageDialog(null,
                "Nombre del cliente: "+nombreCliente
                        +"ID del cliente: "+IDcliente
                        +"Telefono del cliente: "+telefonoCliente
                        +"Email del cliente: "+emailCliente
        );
    }
    public void eliminarDatos(){
        // falta revisar lo de arreglos de objetos para ver cual de los tipos de arreglos se implementa
    }
    // setters and getters
    public void setNombreCliente(String _nombreCliente){
        nombreCliente = _nombreCliente;
    }
    public String getNombreCliente(){
        return nombreCliente;
    }
    public void setIDcliente(String _IDcliente){
        IDcliente = _IDcliente;
    }
    public String getIDcliente(){
        return IDcliente;
    }
    public void setTelefonoCliente(String _telefonoCliente){
        telefonoCliente = _telefonoCliente;
    }
    public String getTelefonoCliente(){
        return telefonoCliente;
    }
    public void setEmailCliente(String _emailCliente){
        emailCliente = _emailCliente;
    }
    public String getEmailCliente(){
        return emailCliente;
    }

}
