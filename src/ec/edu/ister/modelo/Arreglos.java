package ec.edu.ister.modelo;

import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 * @Instituto Rumiñahui
 * @author SSolis
 */
public class Arreglos {

    private int arrayTemperaturas[];

    public void dimensionar() {
        int dim = Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantas temperaturas"));
        arrayTemperaturas = new int[dim];
    }

    public int tamaño() {
        return arrayTemperaturas.length;
    }

    public void llenarArreglo(){
        for (int i = 0; i < tamaño(); i++) {
            arrayTemperaturas[i]=(int)(Math.random()*10);
            
        }
    }
    
    public void imprimir(){
       String acu="";
        for (int i = 0; i < arrayTemperaturas.length; i++) {
           acu += " "+arrayTemperaturas[i];
        }
         JOptionPane.showMessageDialog(null,acu);
    }
    
    public void imprimirFacil(){
        
        JOptionPane.showMessageDialog(null,Arrays.toString(arrayTemperaturas));
        
    }
    public void ordenar(){
        Arrays.sort(arrayTemperaturas);
    }
   
     public void menu(){
       int op;
        do {   
            
            op=Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1.- Dimensionar\n"
                    + "2.- Imprimir\n"
                    + "3.- Imprimir Facil\n"
                    + "4.- Salir\n"
                    + "Ingrese opcion"));
            switch(op){
                case 1:
                    dimensionar();
                    break;
                case 2:
                    imprimir();
                    break;
                case 3:
                    imprimirFacil();
                    break;
            }
        } while (op!=4);
    }
}
    
    
    
    
    
    
    
    
    

