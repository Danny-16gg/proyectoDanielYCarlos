/*vamos a crear un un projecto de cajero  */
package proyectodanielycarlos;

import javax.swing.JOptionPane;


public class ProyectoDanielyCarlos {

    
    public static void main(String[] args) {
        //vamos a realizar el ingreso a la app
        //Ingreso:Clave
        final int usuario=2212;
        int i=1,j=1,ventaT=0;
        String [] opciones={"Registrar venta","Ventas del día", "Salir"};
        
        while(i==1){
            int clave = Integer.parseInt(JOptionPane.showInputDialog("Ingrese contraseña: "));
            
            //panel de opciones:
                
            if (clave==usuario){
                
                while (i==1){
                    int opcion=JOptionPane.showOptionDialog(null, "Escoge una opción: ", "Menu de opciones: ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
                    
                    switch (opcion){
                        case 0:
                        {
                            while (i==1){
                                int venta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor: "));
                                    ventaT=ventaT+venta;
                                    if (venta == 0){
                                        break;
                                    }                                  
                                }                 
                                JOptionPane.showMessageDialog(null, "El total de la venta es: "+ ventaT);                            
                                break;
                        }
                        case 1:
                        {
                            JOptionPane.showMessageDialog(null, "La venta fue de: "+ ventaT);
                            break;
                        }
                        case 2:
                            i=0;                      
                        
                    }                    
                }
            }
            //Reinicio del código:
            int resp=JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
            
            if (resp==JOptionPane.YES_OPTION){
                i=1;
            }
            else {
                break;
            }
        }     
    }    
}
