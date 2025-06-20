
package triangulo;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Primeiro lado: ");
        int a = t.nextInt();
        System.out.print("Segundo lado: ");
        int b = t.nextInt();
        System.out.print("Terceiro lado: ");
        int c = t.nextInt();
        
        /*if ((a==b)&&(b==c)){
            System.out.println("Equilatero");
        } else if ((a==b)||(c==b)||(c==a)){
            System.out.println("isosceles");
        } else if ((a!=b)&&(b!=c)&&(c!=a)){
            System.out.println("Escaleno");
        } else if ((a==0)||(b==0)||(c==0)) {
            System.out.println("Nao forma um triangulo");
        }*/
        
        if ((a==0)||(b==0)||(c==0)){
            System.out.println("Nao forma um triangulo");
        } else if ((a==b)||(c==b)||(c==a)){
            System.out.println("isosceles");
        } else if ((a!=b)&&(b!=c)&&(c!=a)){
            System.out.println("Escaleno");
        } else if ((a==b)&&(b==c)) {
            System.out.println("Equilatero");
        }
        
        
        
    }
    
}
