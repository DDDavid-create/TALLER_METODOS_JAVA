package Ejercicio_6;

import javax.swing.*;

public class Metodos {
    double p1 = 4000, p2 = 5000, p3 = 7000, p4 = 11000;
    public Metodos(){
        iniciar();
    }

    public void iniciar(){
        int numEjes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ejes del vehículo"));

        calcularPagoPeaje(numEjes);
    }

    public void calcularPagoPeaje(int nEjes){
        if (nEjes == 2){
            JOptionPane.showMessageDialog(null, "El peaje te costará: " + p1);
        } else if (nEjes == 3) {
            JOptionPane.showMessageDialog(null, "El peaje te costará: " + p2);
        } else if (nEjes == 4) {
            JOptionPane.showMessageDialog(null, "El peaje te costará: " + p3);
        } else if (nEjes == 5) {
            JOptionPane.showMessageDialog(null, "El peaje te costará: " + p4);
        }else {
            JOptionPane.showMessageDialog(null, "Dato no válido");
        }
    }
}
