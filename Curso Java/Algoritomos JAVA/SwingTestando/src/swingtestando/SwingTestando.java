
package swingtestando;

import java.util.Scanner;


public class SwingTestando {

  
    public static void main(String[] args) {
  //===========================================================//       
  //========SOMA DOS NUMEROS INTEIROS p/ NO NEGAVATIVO=========//      
  //===========================================================//   
       /*Scanner t = new Scanner(System.in);
        *
        *int c = 0;
        *int soma = 0;
        *while (c>=0){
        *   soma += c;
        *    System.out.println("Informe um numero");
        *    c = t.nextInt();  
        *}
        *
        *System.out.println("A soma dos numeos eh de :" +soma); 
        */
   //===========================================================//     
        
   
   
   
   
   
    //===========================================================//  
    //==========INFORME A SENHA CORRETA ATE ACERTAR==============//  
   //===========================================================//  
      /*  Scanner t = new Scanner(System.in);
       * 
       *  
       *  System.out.println("Informe uma senha");
       * int c = t.nextInt();
       * 
       * while(c!=1234){
       *     System.out.println("Senha errada, informe novamente");
       *     c = t.nextInt();
       * }
       * 
       * System.out.println("Acesso liberado");
       */ 
    //===========================================================//  
   
        
    
    
    
    
    //===========================================================//  
    //===========INFORME A SENHA ATE ACERTAR(COM IF)=============//  
    //===========================================================//  
    /*Scanner t = new Scanner(System.in);
     *
     *String senha = "";
     *
     *while (!senha.equals("1234")){
     *   System.out.println("Infome sua senha");
     *   senha = t.nextLine();
     *   if (!senha.equals("1234")){
     *       System.out.println("Senha invalida, tente novamente");
     *   }
     *}
     *
     *   System.out.println("Acesso liberado!!");
     */
    //===========================================================//  
    
    
    
    
    
    
    //===========================================================//
    //======RECEBE UM NUMERO E CONTA REGRESSIVAMENTE=============//
    //===========================================================//
    /*Scanner t = new Scanner(System.in);
     *
     *System.out.println("Informe um numero");
     *int contador = t.nextInt();
     *  
     *
     * while (contador >= 0){
     *   System.out.println(contador);
     *   contador--;
     * }
     */
    //===========================================================//
    
    
    
    
    
    
    
    //===========================================================//
    //============SOMANDO NUMEROS ATE APARECER UM ZERO===========//
    //===========================================================//
    /*Scanner t = new Scanner(System.in);
     *   int soma = 0;
     *   int c = 1;
     *   
     *   
     *   while (c!=0){
     *       System.out.println("Informe um numero");
     *       c = t.nextInt();
     *       soma +=c;
     *       
     *   }
     *
     *   System.out.println("Ah soma dos numeros eh de:  "+soma);
     */
    //===========================================================//
   
     
    
    
   
    
    
    //===========================================================//
    //======ACERTE A SENHA COM DICAS SE È MENOR OU MAIOR=========//
    //===========================================================// 
    /*Scanner t = new Scanner(System.in);
     *
     *   int senha;
     *
     *   System.out.println("Informe a senha para liberar o acesso");
     *   senha = t.nextInt();
     *   
     *   while (senha!=50){
     *    
     *       if (senha>50){
     *           System.out.println("ah senha eh menor ");
     *       } else {
     *           System.out.println("ah senha eh maior");
     *       }
     *       senha=t.nextInt();
     *   }
     *
     *   System.out.println("Acesso liberado");
     */
     //===========================================================//
       
     
    
    
   
    //===========================================================//
    //============MEDIA DE NOTAS, SO PODE ENTRE 0 a 10===========//
    //===========================================================//
     /*Scanner t = new Scanner(System.in);
      *
      *  System.out.println("Informe as notas");
      *  int notas = t.nextInt();
      *  int soma = 0;
      *  int c = 0;
      *  
      *  
      *  while ((notas> 0)&& (notas <=10)){
      *   c++;   
      *   soma += notas; 
      *   notas = t.nextInt();
      *}
      *  
      * if (c>0){
      *     int media = soma/c;
      *     System.out.println("A media das notas validas sao de: "+media);
      * } else {
      *     System.out.println("Nao foi inserido notas validas");
      * }
      */  
    
     
     
     
     
   /*  Scanner t = new Scanner(System.in);
    
     
        System.out.println("Informe um numero");
        int n = t.nextInt();
        int c = 1;
        
        while (c<=10){
            System.out.println(n + " X " + c + " = " + (n*c));
            c++;
        }*/
   
   
   
   
  /* Scanner sc = new Scanner(System.in);
   
        System.out.print("Digite o numero inicial:  ");
        int n_i = sc.nextInt();
        System.out.print("Diite o numero final:   ");
        int n_f = sc.nextInt();
        
        System.out.print("Contagem: ");
        while (n_i<=n_f){
              System.out.print(n_i+" ");
              n_i++;   
        } */
        
  
  
        
     /*   int soma = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero (ou 0 para sair)");
        int n = sc.nextInt();
        
        while(n!=0){
            soma += n;
            System.out.println("Digite um numero (ou 0 para sair)");
            n = sc.nextInt();
        }
    
        System.out.println("A soma total dos numeros foi de : "+soma);*/
     
  /*   int t = 1;
     int n_a = (int) (Math.random()* 100 + 1);
     Scanner sc  = new Scanner(System.in);
     
     
        System.out.println("Tente adivinhar o numero que estou pensando (entre 1 a 100)");
        int n_j = sc.nextInt();
     
     while(n_a!=n_j){ 
         t++;    
         if (n_a < n_j){
             System.out.println("Muito alto! Tente um numero menor");
         } else {
             System.out.println("Muito baixo! Tente um numero maior");
         }
         System.out.println("Tente advinhar o numero que estou pensando(entre 1 a 100)");
         n_j = sc.nextInt();
     }
     
        System.out.println("Parabens voce acertou em: "+t+" tentativas"); */
     
  
       
 
      /*  Scanner sc = new Scanner(System.in);
        
        System.out.println("=================");
        System.out.print("Crie seu usuario:  ");
        String usuario = sc.nextLine();
        System.out.print("Crie sua senha:  ");
        String senha = sc.nextLine();
        System.out.println("=================");
        
        while (senha.equals(usuario)){
        
            System.out.println("ERRO!!! A senha nao pode ser igual ao nome do usario!");
            System.out.println("Crie sua senha:");
            senha = sc.nextLine();
        }
        
        System.out.println("Usario e senha cadastrados com sucesso!!");
        System.out.println("Usuario: "+usuario);
        System.out.println("Senha: "+senha);*/
      
      
      /*  int resultado = 0;
        String r_m = "";
      
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] Somar");
        System.out.println("[2] Subtrair");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Divisao");
        System.out.println("[5] Sair");
        System.out.print("Digite a sua opcao: ");
        int escolha = sc.nextInt();
        System.out.print("Digite o primeiro valor:  ");
        int p_v = sc.nextInt();
        System.out.print("Digite o segundo valor:  ");
        int s_v = sc.nextInt();
        
        while (escolha!=5){
        
            switch(escolha){
                
                case 1:
                    r_m = "soma";
                    resultado = p_v + s_v;
                    System.out.println("Resultado da "+r_m+" : "+resultado);
                    System.out.println("[1] Somar");
                    System.out.println("[2] Subtrair");
                    System.out.println("[3] Multiplicar");
                    System.out.println("[4] Divisao");
                    System.out.println("[5] Sair");
                    System.out.print("Digite a sua opcao: ");
                    escolha = sc.nextInt();
                    System.out.print("Digite o primeiro valor:  ");
                    p_v = sc.nextInt();
                    System.out.print("Digite o segundo valor:  ");
                    s_v = sc.nextInt();
                    break;
                case 2:
                    r_m = "subtracao";
                     resultado = p_v - s_v;
                     System.out.println("Resultado da "+r_m+" : "+resultado);
                    System.out.println("[1] Somar");
                    System.out.println("[2] Subtrair");
                    System.out.println("[3] Multiplicar");
                    System.out.println("[4] Divisao");
                    System.out.println("[5] Sair");
                    System.out.print("Digite a sua opcao: ");
                    escolha = sc.nextInt();
                    System.out.print("Digite o primeiro valor:  ");
                    p_v = sc.nextInt();
                    System.out.print("Digite o segundo valor:  ");
                    s_v = sc.nextInt();
                     break;
                case 3:
                    r_m = "divisao";
                    resultado = p_v * s_v;
                    System.out.println("Resultado da "+r_m+" : "+resultado);
                    System.out.println("[1] Somar");
                    System.out.println("[2] Subtrair");
                    System.out.println("[3] Multiplicar");
                    System.out.println("[4] Divisao");
                    System.out.println("[5] Sair");
                    System.out.print("Digite a sua opcao: ");
                    escolha = sc.nextInt();
                    System.out.print("Digite o primeiro valor:  ");
                    p_v = sc.nextInt();
                    System.out.print("Digite o segundo valor:  ");
                    s_v = sc.nextInt();
                    break;
                case 4:
                    r_m = "multiplicacao";
                    System.out.println("Resultado da "+r_m+" : "+resultado);
                     resultado = p_v / s_v;
                     System.out.println("[1] Somar");
                     System.out.println("[2] Subtrair");
                     System.out.println("[3] Multiplicar");
                     System.out.println("[4] Divisao");
                     System.out.println("[5] Sair");
                     System.out.print("Digite a sua opcao: ");
                     escolha = sc.nextInt();
                     System.out.print("Digite o primeiro valor:  ");
                     p_v = sc.nextInt();
                     System.out.print("Digite o segundo valor:  ");
                     s_v = sc.nextInt();
                     break;
                     
                case 5:
                    break;
                    
                default:
                    System.out.println("ERRO!! digite numeros apenas entre 1 e 5");
                    escolha = sc.nextInt();
                               
            }     
        } */
    
        
        
     /* int escolha = 0;
      Scanner sc = new Scanner(System.in);
      
      while (escolha!=5){
          
        System.out.println("[1] Somar");
        System.out.println("[2] Subtrair");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Divisao");
        System.out.println("[5] Sair");
        System.out.print("Digite a sua opcao: ");
        escolha = sc.nextInt();
        
        if (escolha < 1 || escolha > 5){
            System.out.println("Opcao invalida! tente novamente");
            continue;
        }
        
        if (escolha == 5){
            continue;
        }
        
          System.out.print("Digite o primeiro valor: ");
          int p_v = sc.nextInt();
          System.out.print("Digite o segundo valor: ");
          int s_v = sc.nextInt();
          
         switch (escolha){
             case 1:
                 System.out.println("O resultado da soma eh: "+(p_v + s_v));
                 break;
                 
             case 2:
                 System.out.println("O resultado da Subtracao: "+(p_v - s_v));
                 break;
                 
             case 3:
                 System.out.println("O resultado da multiplicacao: "+(p_v * s_v));
                 break;
             case 4: 
                 if (s_v ==0){
                     System.out.println("Nao é possivel dividir por zero (0)");
                 } else {
                 System.out.println("O resultado da divisao: "+(p_v / s_v));
                 }
                 break;
         } 
         
      }
      
        System.out.println("Programa encerrado. Até logo!");
        sc.close(); */
   
   
   
   
   
   
   /*Scanner sc = new Scanner(System.in);
   
   int escolha = 0;
   int p_v = 0;
   int s_v = 0;
   
   while (escolha != 5) {
   
        System.out.println("[1] somar");
        System.out.println("[2] subtrair");
        System.out.println("[3] mutiplicar");
        System.out.println("[4] dividir");
        System.out.println("[5] sair");
        System.out.println("Digite sua opcao: ");
        escolha = sc.nextInt();
        
        if (escolha == 5){
            break;
        }
        
        if (escolha < 1 || escolha > 5){
            System.out.println("Opcao incorreta, tente novamente");
            continue;
        }
        
       
          System.out.println("Digite o primeiro valor");
          p_v = sc.nextInt();
          System.out.println("Digite o segundo valor");
          s_v = sc.nextInt();       
      
          
        
        switch (escolha){
            case 1: 
                System.out.println("o resultado da soma eh: "+(p_v + s_v));
                break;
            
            case 2:    
                System.out.println("o resultado da subtracao eh: "+(p_v - s_v));
                break;
            
            case 3:
                System.out.println("o resultado da mutiplicacao eh: "+(p_v * s_v));
                break;
            
            case 4:
                if (s_v==0){
                    System.out.println("Nao eh possivel dividir por 0");
                } else {
                System.out.println("o resultado da divisao eh: "+((float) p_v / s_v));
                }
                break;
       
        }
        
   }
   
        System.out.println("Programa encerrado");*/
   

     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
   
   
   
   
    }    
}
