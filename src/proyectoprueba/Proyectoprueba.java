
package proyectoprueba;

import java.util.Scanner;
public class Proyectoprueba {

    
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in); 
       int menu = 0;
       do {
           System.out.println("Bienvenidos al horario"
                   + "Digite el numero segun la materia"
                   + "1. Matematicas"
                   + "2. Sociales"
                   + "3. Ingles"
                   + "4. Salir");
       switch (menu){
           case 1:
               System.out.println("el horario es de 7-8");
           break;
           case 2:
               System.out.println("el horario es de 7-8");
           break;
           case 3:
               System.out.println("el horario es de 7-8");
           break;
       
       }
    }while(menu>0 && menu <=3);
   } 
}
