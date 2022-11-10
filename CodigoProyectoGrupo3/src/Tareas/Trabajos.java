package Tareas;

import javax.swing.JOptionPane;

public class Trabajos {

    //josue
    private String AsignarTrabajador, TipoDeTrabajo, Prioridad, Trabajo = "";

    public void MostrarTrabajo() {
        JOptionPane.showMessageDialog(null, Trabajo, "Lista de trabajos por finalizar", 3);
    }

    public void agregarTrabajoPendiente() {
        setAsignarTrabajador(JOptionPane.showInputDialog(null, "Indique el nombre del trabajador el cual desea asginar este trabajo: ", "Registro de Trabajos", 3));
        setTipoDeTrabajo(JOptionPane.showInputDialog(null, "Tipo de trabajo: ", "Registro de Trabajos", 3));
        setPrioridad(JOptionPane.showInputDialog(null, "Este trabajo necesita Prioridad(Indique SI O NO): ", "Registro de Trabajos", 3));
        Trabajo += ("Colaborador Asignado: " + AsignarTrabajador + "\nTipo de trabajo a realizar: " + TipoDeTrabajo + "\nPrioridad: " + Prioridad + "\n" + "\n");

    }

    public String getAsignarTrabajador() {
        return AsignarTrabajador;
    }

    public void setAsignarTrabajador(String AsignarTrabajador) {
        this.AsignarTrabajador = AsignarTrabajador;
    }

    public String getTipoDeTrabajo() {
        return TipoDeTrabajo;
    }

    public void setTipoDeTrabajo(String TipoDeTrabajo) {
        this.TipoDeTrabajo = TipoDeTrabajo;
    }

    public String getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(String Prioridad) {
        this.Prioridad = Prioridad;
    }

    public String getTrabajo() {
        return Trabajo;
    }

    public void setTrabajo(String Trabajo) {
        this.Trabajo = Trabajo;
    }
}
