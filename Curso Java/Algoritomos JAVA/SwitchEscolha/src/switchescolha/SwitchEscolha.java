
package switchescolha;

import java.util.Scanner;


public class SwitchEscolha {

   
    public static void main(String[] args) {
       
        Scanner t = new Scanner(System.in);
        System.out.print("Quntas pernas?:  ");
        int pernas = t.nextInt();      
        String tipo = null;
        System.out.print("Isso eh um(a) ");
        switch(pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipide";
                break;
            case 4: 
                tipo = "Quadrupede";
                break;
            case 6,8:    
                tipo = "Aranha";
                break; 
            default:
                tipo = "ET";
        }
        
        System.out.println(tipo);
        
    }
    
}
