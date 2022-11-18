package Menus;
import javax.swing.JOptionPane;
public class MenusProyecto {
    public void menuPrincipal(){
        JOptionPane.showMessageDialog(null,
                        "Menu Principal"+ // Este es el menu principal, aqui se muestran las opciones principales.

                        "1- Inventario"+ // opcion para gestionar el inventario
                        "2- Personal"+ // opcion para gestionar el personal
                        "3- Clientes"+ // opcion para gestionar los clientes
                        "4- Proveedores"+ // opcion para gestionar los proveedores
                        "5- Pedidos"+ // opcion para gestionar los pedidos pendientes
                        "6- Trabajos"+ // opcion para gestionar los deberes pendientes
                        "7- Salir"
                );
    }
    public void menuInventario(){
        JOptionPane.showInputDialog(null,
                "Usted se encuentra dentro de la opcion Inventario"+// Este es el submenu de la opcion Inventario

                        "1- Ingresar Productos"+ // opcion para ingresar nuevos productos
                        "2- Mostrar Registro Completo"+ // opcion para mostrar el registro de todos los productos ingresados
                        "3- Buscar Producto"+ // opcion para buscar un producto por ID
                        "4- Actualizar Datos"+ // opcion para actualizar cualqueier dato del menu
                        "5- Eliminar datos"+ // opcion para eliminar productos del registro
                        "6- Salir de la opcion" // opcion para salir de la opcion
        );
    }
    public void menuPersonal(){
        JOptionPane.showMessageDialog(null,
                "Usted se encuentra en la opcion Personal"+ // este es el submenu de la opcicon Persona

                        "1- Ingresar Personal Administrativo"+ // opcion para ingresar datos del personal administrativo
                        "2- Mostrar Resgistro Completo"+ //opcion para mostrar el registro de todos los datos del personal
                        "3- Buscar Personal Administrativo"+ // opcion para buscar algun registro por ID
                        "4- Salir de la opcion"
        );
    }
    public void menuClientes(){
        JOptionPane.showMessageDialog(null,
                "Usted se encuentra en la opcion Clientes"+ // Este es el submenu de la opcion Clientes

                        "1- Ingresar Cliente"+ // opcion para ingresar datos de clientes
                        "2- Mostrar Resgistro Completo"+ // opcion para mostrar registro completo de clientes
                        "3- Buscar Cliente"+ // opcion para buscar un cliente por ID
                        "4- Salir de la opcion" // opcion para salir de la opcion
        );
    }
    public void menuProveedores(){
        JOptionPane.showMessageDialog(null,
                "Usted se encuetra en la opcion Proveedores"+ // Este es el submenu de la opcion Proveedores

                        "1- Ingresar Proveedor"+ // Opcion para ingresar nuevos proveedores
                        "2- Mostrar Registro Completo"+ // opcion para mostrar el registro completo de proveedores
                        "3- Buscar un Proveedor"+ // opcion para buscar un proveedor por ID
                        "4- Salir" // opcion para salir
        );
    }
    public void menuPedidos (){
        JOptionPane.showInputDialog(null,
                "Usted se encuentra en la opcion Pedidos"+// Este es el submenu de la opcion Pedidos

                        "1- Ingresar Pedido"+ // opcion para ingresar pedidos
                        "2- Mostrar Registro Completo"+ // opcion para mostrar el registro completo de pedidos
                        "3- Buscar un Pedido"+ // opcion para buscar un pedido por ID
                        "4- Salir de la opcion" // opcion para salir
        );
    }
    public void menuTrabajos(){
        JOptionPane.showInputDialog(null,
                "Usted se encuentra en la opcion Trabajos"+ // Submenu de la opcion Trabajos

                        "1- Ingresar Tarea Pendiente"+ // opcion para ingresar tareas pendientes
                        "2- Mostrar Registro Completo"+ // opcion para mostrar el registro completo
                        "3- Salir de la opcion" // opcion para salir
        );
    }
}
