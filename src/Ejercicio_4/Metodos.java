package Ejercicio_4;

import javax.swing.*;

public class Metodos {
    //Modifique el algoritmo anterior (EJERCICIO 3) pero ahora cree otro métod que reciba como parámetro el numero generado y que valide si el numero es par o impar.
    public Metodos(){
        int numAle = generarNumAle();
        validarParImpar(numAle);
    }

    public int generarNumAle(){
        return (int) (Math.random()*100) + 1;
    }

    public void validarParImpar(int num){
        String msj = "Tu numero generado es: " + num;
        JOptionPane.showMessageDialog(null, msj);

        if (num%2 == 0){
            JOptionPane.showMessageDialog(null, "Tu numero generado es par");
        }else {
            JOptionPane.showMessageDialog(null, "Tu numero generado es impar");
        }
    }
}
