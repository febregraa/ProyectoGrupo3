package Productos;
import javax.swing.JOptionPane;
public class Inventario {
    // Felipe
    private String nombreProducto;
    private String IDproducto;
    private String nombreProveedor;
    private String IDproveedor;
    private String entradaPrecioUnitarioBruto;
    private int precioUnitarioBruto;
    private String entradaIVA;
    private int IVA;
    private float precioUnitarioNeto;
    private String fechaCaducidad;

    public Inventario (){

    }
    public Inventario(String _nombreProducto,String _IDproducto, String _nombreProveedor, String _IDproveedor, String _entradaPrecioUnitarioBruto, String _entradaIVA,Double _precioUnitarioNeto, String _fechaCaducidad){
        nombreProducto = _nombreProducto;
        IDproducto = _IDproducto;
        nombreProveedor = _nombreProveedor;
        IDproveedor = _IDproveedor;
        precioUnitarioBruto = Integer.parseInt(_entradaPrecioUnitarioBruto);
        IVA = Integer.parseInt(_entradaIVA);
        precioUnitarioNeto = (precioUnitarioBruto + (IVA /100 * precioUnitarioBruto));
        fechaCaducidad = _fechaCaducidad;
    }
    public void ingresoDatos(){
        // La forma de solicitar datos es momentaneo hasta que se decida el tipo de arreglos a utilizar
        nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto");
        IDproducto = JOptionPane.showInputDialog("Ingrese el ID del producto");
        nombreProveedor = JOptionPane.showInputDialog("Ingrese el nombre del proveedor");
        IDproveedor = JOptionPane.showInputDialog("Ingrese el ID del proveedor");
        entradaPrecioUnitarioBruto = JOptionPane.showInputDialog("Ingrese el precio unitario en bruto");
        precioUnitarioBruto = Integer.parseInt(entradaPrecioUnitarioBruto);
        entradaIVA = JOptionPane.showInputDialog("Ingrese el porcentaje del IVA");
        IVA = Integer.parseInt(entradaIVA);
        //precioUnitarioNeto = precioUnitarioBruto + ((IVA/100)*precioUnitarioBruto);
        fechaCaducidad = JOptionPane.showInputDialog("Ingrese la fecha de caducidad del producto");
    }
    public void mostrarDatosInventario(){
        precioUnitarioNeto = (precioUnitarioBruto + ((IVA/100)*precioUnitarioBruto)); // no da el resultado, hay que corregirlo
        JOptionPane.showMessageDialog(null,
                "Nombre Producto: "+nombreProducto
                +" ID del producto: "+IDproducto
                +" Nombre del proveedor: "+nombreProveedor
                +" ID del proveedor: "+IDproveedor
                +" Precio unitario en bruto: "+precioUnitarioBruto
                +" IVA: "+IVA
                +" Precio unitario neto: "+precioUnitarioNeto
                +" Fecha de caducidad: "+fechaCaducidad
                );
    }
    public void mostrarUnRegistro(){
        // aun se planea este metodo hasta que se decida el tipo de arreglo a utilizar
    }
    public void actualizacionDatos(){
        // aun se planea este metodo hasta que se decida el tippo de arreglo a utilizar
    }
    public void eliminarUnRegistro(){
        // aun se planea este metodo hasta que se decida el tipo de arreglo a utilizar
    }
    // setters and getters
    public void setNombreProducto(String _nombreProducto){
        nombreProducto = _nombreProducto;
    }
    public String getNombreProducto(){
        return nombreProducto;
    }
    public void setIDproducto(String _IDproducto){
        IDproducto = _IDproducto;
    }
    public String getIDproducto(){
        return IDproducto;
    }
    public void setNombreProveedor(String _nombreProveedor){
        nombreProveedor = _nombreProveedor;
    }
    public String getNombreProveedor(){
        return nombreProveedor;
    }
    public void setIDproveedor(String _IDproveedor){
        IDproveedor = _IDproveedor;
    }
    public String getIDproveedor(){
        return IDproveedor;
    }
    public void setPrecioUnitarioBruto(int _precioUnitarioBruto){
        precioUnitarioBruto = _precioUnitarioBruto;
    }
    public int getPrecioUnitarioBruto(){
        return precioUnitarioBruto;
    }
    public void setEntradaIVA(String _entradaIVA){
        entradaIVA = _entradaIVA;
    }
    public String getEntradaIVA(){
        return entradaIVA;
    }
    public void setFechaCaducidad(String _fechaCaducidad){
        fechaCaducidad = _fechaCaducidad;
    }
    public String getFechaCaducidad(){
        return fechaCaducidad;
    }
}



