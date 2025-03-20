package Ejercicio_1;

import javax.swing.*;

public class Metodos {
    int cedula, edad;
    String nombre;

    public Metodos(){
        iniciar();
    }

    public void iniciar(){
        JOptionPane.showMessageDialog(null, "BIENVENID@");
        solicitarDatos();
    }

    public void solicitarDatos(){
        cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu numero de cedula"));
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

        String msj = "Bienvenid@ " + nombre + "\n\n";
        msj += "Tus datos ingresados: \n";
        msj += "Cedula: "+ cedula +"\n";
        msj += "Edad: "+ edad +"\n";
        msj += "Nombre: "+ nombre +"\n";

        JOptionPane.showMessageDialog(null, msj);
    }
}
