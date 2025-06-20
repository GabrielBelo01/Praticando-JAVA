

package whilecambalhota;

public class WhileCambalhota {

    public static void main(String[] args) {
       
        /*int cc = 0;
        
        while (cc<10){
            cc++;
            if (cc == 5 || cc == 7) {     O COMANDO CONTINUE JOGA VOLTA PRA CIMA DO LAÇO
                continue;
            }
            System.out.println("Camabalhota" + cc);
        }*/
        
        
        int cc = 0;
        
        while (cc<10){
            cc++;
            if(cc==5){
            break;
            }
            System.out.println("Cambalhota "+cc);
        }
        
        
    }
    
}
