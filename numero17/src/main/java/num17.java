import java.util.Scanner;
public class num17 {
     public static void main(String[]args)
        {
            int res1,res2,res3,res4;
         Scanner sc = new Scanner(System.in);
         System.out.println("ingrese cantidad en monedas");
         int mone = sc.nextInt();
        res1=mone-1;
        res2=mone-5;
        res3=mone-10;
        res4=mone-20;
        System.out.println("cantidad en monedas 1: "+ res1+" moneda 5: "+res2+" moneda 10: "+res3+" monedas de 20: "+res4);
        }
}
