
package dowhile;

import java.util.Scanner;


public class DoWhile {

   
    public static void main(String[] args) {
        
       /* int cc = 0;
        do {
            cc++;
            System.out.println("Cabamlhota: "+cc);

        } while (cc<4); */
        
       int n, p = 0,c = 0, i = 0, c_i = 0;
       int s = 0;
       String resp = null;
       Scanner sc = new Scanner(System.in);
       
       do {
           System.out.print("Informe o numero: ");
           n = sc.nextInt();
           s += n;
           if (n%2==0){
               c++;
               p+= n;
           } else {
               c_i++;
               i+= n;
           }

           System.out.print("Quer continuar somando?: "); 
           resp = sc.next();
       } while (resp.equals("s"));
       
        System.out.println("a soma dos numeros eh de: "+ s);
        System.out.println("\n");
        System.out.println("Foi digitado: "+c+" numeros pares");
        System.out.println("A soma dos numeros pares eh de : "+p);
        System.out.println("\n");
        System.out.println("Foi digitado : "+c_i+" numeros impares");
        System.out.println("A soma dos numeros impares e de: "+i);
    }
    
}
