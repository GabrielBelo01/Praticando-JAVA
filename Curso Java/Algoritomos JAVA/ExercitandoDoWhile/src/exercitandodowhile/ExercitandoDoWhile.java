
package exercitandodowhile;

import java.util.Scanner;


public class ExercitandoDoWhile {

   
    public static void main(String[] args) {
       
        /*int nota = 0; 
        
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Insira um nota");
            nota = sc.nextInt();
                
        } while (nota < 0 || nota > 10); */
    
        
     /*   int n = (int) (Math.random()*100+1);
        Scanner sc = new Scanner(System.in);
        int resp, c = 0;
        
        do {
            System.out.println("Adivinhe que numero estou pensando (entre 1 e 100)");
            resp = sc.nextInt();
            c++;
            if (resp > n){
                System.out.println("Mais baixo, tente novamente");
            } else {
                System.out.println("Mais alto, tente novamente");
            }
        
        } while (n!=resp);
        
            System.out.println("Parabens voce acertou!! ");
            System.out.println("em "+c+ " tentativas"); */
        
     
    /* Scanner sc =  new Scanner(System.in);
     int resposta;
     double saldo = 1000;
     
     do {
         System.out.println("Menu de opcoes");
         System.out.println("[1] Depositar");
         System.out.println("[2] Sacar");
         System.out.println("[3] ver saldo");
         System.out.println("[0] sair");
         resposta = sc.nextInt();
         
         if (resposta<0 || resposta >3){
             System.out.println("Opcao invalida, tente novamente");
             continue;
         }
         
         switch(resposta){
             case 1:
                 double valordeposito = 0;
                 System.out.println("Qual o valor do deposito?");
                 valordeposito = sc.nextDouble();
                 if (valordeposito <= 0){
                     System.out.println("Valor do deposito incorreto!");
                 } else {
                     System.out.println("Deposito realizado com sucesso");
                     saldo += valordeposito;
                 }
                 break;
                 
             case 2:
                 double valorsaque = 0;
                    System.out.println("Qual o valor do saque?");
                    valorsaque= sc.nextDouble();
                    if (valorsaque > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else if (valorsaque <= 0) {
                        System.out.println("Valor incorreto!!");
                    } else {
                        saldo += - valorsaque;
                        System.out.println("Saque realizado com sucesso");
                        System.out.println("Voce realizou um saque de :"+valorsaque+" Reais");
                    }      
                    break;
             case 3:
                 System.out.println("==============");
                 System.out.println("Saldo: "+saldo);
                 System.out.println("==============");
                 break;
            
         }
         
     } while (resposta!=0);
     
        System.out.println("Secao finalizada, obrigado por usar o BeloBank");
        sc.close(); */
     
     
 /*   double somaidade = 0, contador = 0, media;
    int idade;
    
    Scanner sc = new Scanner(System.in);
    
    do {
        
        System.out.println("Digite uma idade(0 para sair)"); 
        idade = sc.nextInt();
        
        if (idade <=0) {
           continue;
        } else {
        somaidade += idade;
        contador++;
        }
        
        
        
    } while(idade>0);  
    
        if (contador ==0 ){
            System.out.println("Obrigado por usar o programa!!");
        } else {
            media = somaidade / contador;
            System.out.println("Foram inseridas "+contador+" idade");
            System.out.printf("A media de idade do grupo e: %.2f ",media);
        }        
        sc.close(); */
 
 
 
 
      /*  String senha = "java123";
        String tentativa;
        
        Scanner sc = new Scanner(System.in);
      
        do {
            
            System.out.println("Digite a senha: ");
            tentativa = sc.nextLine();
            
            if (!tentativa.equals(senha)){
                System.out.println("Acesso negado. Tente novamente.");
            }
            
 
        } while(!tentativa.equals(senha));
        
        System.out.println("Acesso liberado!!");
        sc.close(); */
     
        
       /* int count =3;
        
        do{
            System.out.printf("Valor: %d\n",count);
            count--;
            
            if (count<0){
                count =3;
            }
        
        }while(count<=2); */
     
       int contador = 1;
       
       for(int linha = 1;linha < 3; linha++){
           for(int coluna = 1; coluna <3; coluna++){
               if(linha==coluna){
                   System.out.printf("(*)");
               } else {
                   System.out.printf("%d",contador);
               }
               contador++;
           
           }
           System.out.println();
       
       }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    
    }
   }