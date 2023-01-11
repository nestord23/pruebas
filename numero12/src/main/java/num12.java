import java.util.Scanner;
public class num12 {
      public static void main(String[]args)
      {
          double resp1,resp2;System
           Scanner lectura = new Scanner (System.in);
           System.out.println("ingrese el nombre dinosaurio");
           String nombre = lectura.next();
           System.out.println("ingrese el peso del dinosario en libras");
           double peso = lectura.nextDouble();
           System.out.println("ingrese la longuitud del dinosaurio en pies ");
           double loguitud = lectura.nextDouble();
           resp1 = loguitud*0.3048;
           resp2= peso*0.453592;
           System.out.println("el nombre del dinosario es "+nombre+" su peso el KG es "+peso+" su loguitud es de "+loguitud);
           
           
      }
}
