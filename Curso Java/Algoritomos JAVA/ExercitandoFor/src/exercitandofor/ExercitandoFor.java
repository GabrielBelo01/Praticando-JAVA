/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercitandofor;

import java.util.Scanner;

public class ExercitandoFor {

    public static void main(String[] args) {
      
     /* for (int cc = 1; cc <= 3; cc++){
          System.out.println("Cambalhota: "+cc);
      
      } */
     
     /*for (int cc = 15; cc >= 5; cc-= 2){
        System.out.println(""+cc);

    }*/
     
    /* for (int  cc = 100; cc >=10; cc-=10){
         System.out.println(""+cc);
        } */

   /* for (int i = 1; i <=5; i++){
        for(int j = 1; j <=3; j++){
            System.out.println(+i+" "+j); 
        }
        System.out.println("");
    } */
        
   
 /*  Scanner sc = new Scanner(System.in);
   
        System.out.println("Digite um numero inteiro: ");
        int numero =  sc.nextInt();
        
        while (numero <=0){
            System.out.println("Numero incorreto. Tente novamente");
            numero = sc.nextInt();
        }
       
        System.out.println("Numeros pares ate: "+numero);
        
        for (int c=1; c<=numero; c++){
            
            if (c %2 == 0){
                System.out.println(""+c);
            }
          
        } */
        
       /* Scanner sc = new Scanner(System.in);
        
            System.out.println("Digite o numero: ");
            int numero = sc.nextInt();
            
            long fatorial = 1;
            
            if (numero == 0){
            
            } else {
                for (int c = 1; c <= numero; c++){
               fatorial *=c;     
                }
            }

            System.out.println("o fatorial de "+numero);
            System.out.println("e de: "+fatorial); */
        
       
            Scanner sc =  new Scanner(System.in);
            System.out.println("Qual a altura do Triangulo");
            int altura = sc.nextInt();
            
            // Laço externo para controlar as LINHAS
      /*    for (int linha = 1; linha <= altura; linha++) {

          // Laço interno (ANINHADO) para imprimir os asteriscos de cada linha
          for (int coluna = 1; coluna <= linha; coluna++) {
              // O laço de coluna repete um número de vezes igual à linha atual
              System.out.print("*"); 
          }

          // Ao final de cada linha, pula para a próxima
          System.out.println(); 
           } */
        
        
        
        // Laço externo para controlar as LINHAS
    for (int linha = 1; linha <= altura; linha++) {
    
        // Laço interno (ANINHADO) para imprimir os asteriscos de cada linha
        for (int coluna = 1; coluna <= linha; coluna++) {
            // O laço de coluna repete um número de vezes igual à linha atual
            System.out.print("*"); 
        }

        // Ao final de cada linha, pula para a próxima
        System.out.println(); 
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
