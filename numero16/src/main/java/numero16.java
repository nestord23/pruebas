import java.util.Scanner;
public class numero16 {
  public static void main(String[]args)
  {
   Scanner sc = new Scanner(System.in);
   int op;
   int cant,total1,total2,total3,total4;
   boolean salir = false;
   while(!salir){
   System.out.println("menu");
   System.out.println("bocadillo de jamon 50 pesos");
   System.out.println("bocadillo de queso 20 pesos");
   System.out.println("patatas fritas 30 pesos");
   System.out.println("refresco 17 pesos");
   System.out.println("sodas 25 pesos");
   System.out.println("ingrese la opcion");
   op= sc.nextInt();
   switch(op){
       case 1:
           System.out.println("ingrese la cantidad de jamon que necesita");
           cant = sc.nextInt();
           total1 = cant*50;
           System.out.println("el total es de:" + total1 );
           break;
       case 2:
           System.out.println("ingrese la cantidad de jamon que necesita");
           cant = sc.nextInt();
           total1 = cant*20;
           System.out.println("el total es de:" + total1 );
           break;    
        case 3:
           System.out.println("ingrese la cantidad de jamon que necesita");
           cant = sc.nextInt();
           total1 = cant*30;
           System.out.println("el total es de:" + total1 );
           break;
        case 4:
           System.out.println("ingrese la cantidad de jamon que necesita");
           cant = sc.nextInt();
           total1 = cant*17;
           System.out.println("el total es de:" + total1 );
           break;    
           case 5:
           System.out.println("ingrese la cantidad de jamon que necesita");
           cant = sc.nextInt();
           total1 = cant*25;
           System.out.println("el total es de:" + total1 );
           break;
   }
   
  }
   
  }
}
