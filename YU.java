/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yu;

/**
 *
 * @author cetecom
 */
import java.util.Scanner;
public class YU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
//        int suma = 0;
//        int edad;
//        for (int i = 0; i<5; i++){
//            System.out.println("Ingresa tu edad: ");
//            edad = scanner.nextInt();
//            suma = suma+edad;
//        }
//        System.out.print("Sumaste 5 edades pete: ");
//        System.out.println(suma);



        int opcion;
        int contPollo = 0, contCarne = 0, contCazuela = 0, contFideos = 0;
        
        do{
            System.out.println("----------Menu----------");
            System.out.println("------------------------");
            System.out.println("1. Pollo con Arroz");
            System.out.println("2. Carne Mechada con Puré");
            System.out.println("3. Cazuela de Ave");
            System.out.println("4. Fideos con Salsa");
            System.out.println("5. Salir"); 
            
            System.out.println("Que opcion deseas?");
            opcion = scanner.nextInt();
            
        switch(opcion){
            case 1: 
                contPollo++;
                System.out.println("---------------------------------------");
                System.out.println("Añadiste " + contPollo + " cantidad de Pollo con Arroz");
                System.out.println("---------------------------------------");
                break;
                
            case 2: 
                contCarne++;
                System.out.println("---------------------------------------");
                System.out.println("Añadiste " + contCarne + " cantidad de Carne Mechada con Puré");
                System.out.println("---------------------------------------");
                break;
            case 3: 
                contCazuela++;
                System.out.println("---------------------------------------");
                System.out.println("Añadiste " + contCazuela + " cantidad de Cazuela de Ave");
                System.out.println("---------------------------------------");
                break;
            case 4: 
                contFideos++;
                System.out.println("---------------------------------------");
                System.out.println("Añadiste " + contFideos + " cantidad de Fideos con Salsa");
                System.out.println("---------------------------------------");
                break;
            case 5: 
                System.out.println("Tu menu final es: ");
                
                if(contPollo > 0){
                System.out.println(contPollo + ". Pollo con Arroz");
                }
                if(contCarne > 0){
                System.out.println(contCarne + ". Carne Mechada con Puré");
                }
                if(contCazuela > 0){
                System.out.println(contCazuela + ". Cazuela de Ave");
                }
                if(contFideos > 0){
                System.out.println(contFideos + ". Fideos con Salsa");
                }
                }
        }while (opcion!=5);    
        }
        
}
