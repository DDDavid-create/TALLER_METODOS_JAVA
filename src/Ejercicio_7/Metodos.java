package Ejercicio_7;

import javax.swing.*;

public class Metodos {
    double bon1 = 0.15, bon2 = 0.10, bon3 = 0.08, bon4 = 0;
    double des1 = 0.02, des2 = 0.015, des3 = 0.01, des4 = 0;
    public Metodos(){
        solicitarDatos();
    }

    public void solicitarDatos(){
        int cat;
        double sueldoB;

        JOptionPane.showMessageDialog(null, "BIENVENID@");
        cat = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su categoría (1-4)"));
        sueldoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo a calcular"));

        calSalarioTot(cat, sueldoB);
    }

    public void calSalarioTot(int cat, double sueldo){
        double pago;
        String msj = "Su salario es: $" + sueldo + "\n\n";
        switch (cat){
            case 1:
                pago = (sueldo + sueldo * bon1) - (sueldo * des1);
                msj += "Bonificacion: " + bon1*100 + "%\n";
                msj += "Descuento: " + des1*100 + "%\n";
                msj += "Salario final: $" + pago;
                break;
            case 2:
                pago = (sueldo + sueldo * bon2) - (sueldo * des2);
                msj += "Bonificacion: " + bon2*100 + "%\n";
                msj += "Descuento: " + des2*100 + "%\n";
                msj += "Salario final: $" + pago;
                break;
            case 3:
                pago = (sueldo + sueldo * bon3) - (sueldo * des3);
                msj += "Bonificacion: " + bon3*100 + "%\n";
                msj += "Descuento: " + des3*100 + "%\n";
                msj += "Salario final: $" + pago;
                break;
            case 4:
                pago = (sueldo + sueldo * bon4) - (sueldo * des4);
                msj += "Bonificacion: " + bon4*100 + "%\n";
                msj += "Descuento: " + des4*100 + "%\n";
                msj += "Salario final: $" + pago;
                break;
            default:
                JOptionPane.showMessageDialog(null, "CATEGORIA NO VÁLIDA"); break;
        }
                JOptionPane.showMessageDialog(null, msj);
    }
}
