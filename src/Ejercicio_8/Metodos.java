package Ejercicio_8;

import javax.swing.*;

public class Metodos {
    double casado1 = 15000, separado1 = 30000, viudo1 = 20000, soltero1 = 25000;
    double casado2 = 25000, separado2 = 40000, viudo2 = 30000, soltero2 = 35000;
    double casado3 = 50000, separado3 = 80000, viudo3 = 65000, soltero3 = 70000;

    public Metodos(){
        solicitarDatos();
    }

    public void solicitarDatos(){
        int estrato, estadoCivil, nMaterias;

        JOptionPane.showMessageDialog(null, "BIENVENID@!!!!!!");
        estrato     = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su estrato social (1, 2, 3 o más)"));
        estadoCivil = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su estado civil \n\n1. Casado \n2. Separado \n3. Viudo \n4. Soltero \n\nElija una opcion por favor"));
        nMaterias   = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de materias matriculadas"));

        double total = calcularVlrMateria(estrato, estadoCivil, nMaterias);
        imprimirMensaje(total);
    }

    public double calcularVlrMateria(int estrato, int eCivil, int nMaterias){
        double pago = 0;
        switch (estrato){
            case 1:
                switch (eCivil){
                    case 1: pago = casado1 + nMaterias * 10000; break;
                    case 2: pago = separado1 + nMaterias * 15000; break;
                    case 3: pago = viudo1 + nMaterias * 12000; break;
                    case 4: pago = soltero1 + nMaterias * 12000; break;
                    default:
                        JOptionPane.showMessageDialog(null, "ESTADO CIVIL NO VALIDO");
                        break;
                }
                break;
            case 2:
                switch (eCivil){
                    case 1: pago = casado2 + nMaterias * 15000; break;
                    case 2: pago = separado2 + nMaterias * 20000; break;
                    case 3: pago = viudo2 + nMaterias * 18000; break;
                    case 4: pago = soltero2 + nMaterias * 18000; break;
                    default:
                        JOptionPane.showMessageDialog(null, "ESTADO CIVIL NO VALIDO");
                        break;
                }
                break;
            default:
                switch (eCivil){
                    case 1: pago = casado3 + nMaterias * 30000; break;
                    case 2: pago = separado3 + nMaterias * 40000; break;
                    case 3: pago = viudo3 + nMaterias * 35000; break;
                    case 4: pago = soltero3 + nMaterias * 35000; break;
                    default:
                        JOptionPane.showMessageDialog(null, "ESTADO CIVIL NO VALIDO");
                        break;
                }
                break;
        }
        return pago;
    }

    public void imprimirMensaje(double total){
        String msj = "El total a pagar es: " + total;
        JOptionPane.showMessageDialog(null, msj);
    }
}
