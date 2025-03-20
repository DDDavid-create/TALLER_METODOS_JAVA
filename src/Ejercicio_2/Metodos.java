package Ejercicio_2;

import javax.swing.*;

public class Metodos {
    public Metodos(){
        solicitarNum();
    }

    public void solicitarNum(){
        int num;
        JOptionPane.showMessageDialog(null, "BIENVENID@");
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero mayor a 10"));

        verificacion(num);
    }

    public void verificacion(int numero){

        if (numero>10){
            String msj = "Tu numero es mayor a 10 \n\n";
            msj += "Tu numero es: " + numero;
            JOptionPane.showMessageDialog(null, msj);
        }else {
            JOptionPane.showMessageDialog(null, "Tu numero no es mayor que 10");
        }
    }
}
