package recursos;

import java.util.Scanner;


public class Recursos {

   
    public static void main(String[] args) {
        RAID Pro = new RAID();
        
        Scanner teclado = new Scanner(System.in);
        int opcion = 1;
        //Carga el arreglo
        Pro.X();
        //Pide al usuario digitar la informacion para el arreglo
        Pro.Informacion();
        
        while (opcion != 0) {
            System.out.println("1. Guardar formato Raid 0");
            System.out.println("2. Guardar formato Raid 1");
            System.out.println("3. Guardat formato Raid 5"); 
            System.out.println("4. Mostrar Datos");
            System.out.println("5. Reload");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            
            switch (opcion){
                case 1:     
                Pro.RAID_0();
                break;
                
                case 2:
                Pro.RAID_1();
                break;
                
                case 3:
                Pro.RAID_5();
                break;
                
                case 4:
                Pro.Show();
                break;
                
                case 5:
                Pro.SAVE_RAID_0();
                break;
            }
            
        }
    
    }
    
}
