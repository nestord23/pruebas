import java.util.Scanner;
public class numero20 {
    public static void main(String[]args)
    {
        String nom;
        int edad,res;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        nom= sc.next();
        System.out.println("ingrese el año de nacimiento");
        edad= sc.nextInt();
        res = 2023-edad;
        System.out.println("el nombre es:"+ nom +" Su Edad es de:"+ res);
                
   
        
    }
}
