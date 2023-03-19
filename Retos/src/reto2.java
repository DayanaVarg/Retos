import java.util.Scanner;

public class reto2 {
 
  public static void main (String [] arg){    
    Scanner leer = new Scanner (System.in);
    System.out.println("Ingrese el nombre del bebé");
    String nombre = leer.nextLine();
    System.out.println("Ingrese los meses del bebé");
    int edad = leer.nextInt();
    System.out.println("Ingrese el peso del bebé");
    float peso = leer.nextFloat();
    System.out.println("Ingrese el nombre de la mamá");
    String madre = leer.next();
    System.out.println("Ingrese el tipo de vacuna a aplicar");
    String vacuna = leer.next();
    float dosis = ((peso+10)/(edad*10)*8) ;
    System.out.println("Nombre del bebé: " + nombre );
    System.out.println("Edad del bebé: " + edad + " meses" );
    System.out.println("Peso: " + peso );
    System.out.println("Nombre de la mamá: " + madre );
    System.out.println("Tipo de vacuna: " + vacuna );
    System.out.println("La dosis total a aplicar es: " + dosis );
    leer.close();
    } 
 
}