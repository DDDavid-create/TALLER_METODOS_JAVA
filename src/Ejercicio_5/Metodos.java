package Ejercicio_5;

import javax.swing.*;

public class Metodos {
    public Metodos(){
        iniciar();
    }

    public void iniciar(){
        int rango;
        JOptionPane.showMessageDialog(null, "BIENVENID@");
        rango = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango de números a pedir"));

        for (int i = 1; i<=rango; i++) {
            int numero;
            do {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero " + i + " (debe estar entre 1-10)"));
            } while (!validarNumRango(numero));
        }

    }

    public boolean validarNumRango(int num){
        if (num>=0 && num<=10){
            JOptionPane.showMessageDialog(null, "Es válido el numero");
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Es inválido el numero");
            return false;
        }
    }
}
