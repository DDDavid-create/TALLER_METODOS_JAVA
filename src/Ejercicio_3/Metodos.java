package Ejercicio_3;

import javax.swing.*;

public class Metodos {

    public Metodos(){
        int num = generarNumAle();
        String msj = "Generador de numeros aleatorios entre 1-100 \n\n";
        msj+= "Tu numero generado es: " + num;

        JOptionPane.showMessageDialog(null, msj);
    }

    public int generarNumAle(){
        // Math.random() genera un número decimal aleatorio entre 0.0 y 1.0 (excluyendo 1.0)
        // Multiplicamos por 100 para obtener un rango entre 0 y 100
        // Sumamos 1 para que el rango sea de 1 a 100 en lugar de 0 a 99
        return (int) (Math.random()*100) + 1;
    }
}
