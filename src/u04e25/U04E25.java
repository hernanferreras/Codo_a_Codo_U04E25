
package u04e25;

import java.util.Scanner;

public class U04E25 {
    public static void main(String args[]) {
      Scanner entrada=new Scanner(System.in);
      String clave;
      int contador=0;
      do{
        System.out.print("Ingrese la clave: ");
        clave=entrada.nextLine();
        if ((clave.equals("eureka"))!=true){
            System.out.println("La clave es incorrecta, ingresela nuevamente\n");
            contador++;
        }else
            contador=4;
      }while(contador<3);
      if (clave.equals("eureka")==true){
          System.out.print("Puede ingresar al programa");
      }else
        System.out.print("Ingreso la clave de manera incorrecta "+contador+" veces, no puede ingresar");
        
    }
}