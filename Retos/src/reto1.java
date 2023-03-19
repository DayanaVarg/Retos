import java.util.Scanner;

public class reto1 {
 
  public static void main (String [] arg){    
    Scanner leer = new Scanner (System.in);
    System.out.println("A continuacion se hará la conversión de grados Kelvin a grados Centígrados");
    System.out.println("Ingrese los grados Kelvin");
    int grados = leer.nextInt();
    double resultado = (grados - 273.15);
    System.out.println("Los grados kelvin ingresados, equivalen a  " + resultado + " grados Centigrados");
    leer.close();
    } 
 
}