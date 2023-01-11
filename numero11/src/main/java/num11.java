

import java.util.Scanner;
public class num11 {
    public static void main(String[]args)
    {
        double cm;
        int pulg = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero de pulgadas");
        pulg =sc.nextInt();
        cm = pulg*2.54;
        System.out.println("La conversion de " + pulg + " pulgadas " + "a cm es: "+cm);
    }
}
