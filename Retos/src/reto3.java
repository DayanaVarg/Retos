
import java.util.Scanner;
public class reto3 {
    public static void main(String[] args) {
       Scanner lect=new Scanner(System.in);
      String nom, elec;
      int apuesta,total;
     double res;
      System.out.println("Ingrese su nombre");
        nom = lect.next();
        System.out.println("Ingrese su apuesta");
        apuesta = lect.nextInt(); 
        if (apuesta>=10000) {
            System.out.println("Elija cara o sello : ");
            elec = lect.next();
            res=(int)Math.floor(Math.random()*2);
            if (elec.equals("cara")) {
                if (res == 1) {
                    total=apuesta*2;
                    System.out.println("Jugador "+nom+" ha salido cara, usted ha ganado "+total+" pesos.");
                } else {
                    System.out.println("Jugador "+nom+" ha salido sello, usted ha perdido "+apuesta+" pesos.");
                }
            } else if (elec.equals("sello")) {
                if (res == 1) {
                    total=apuesta*2;
                    System.out.println("Jugador "+nom+" ha salido sello, usted ha ganado "+total+" pesos.");
                } else {
                    System.out.println("Jugador "+nom+" ha salido cara, usted ha perdido "+apuesta+" pesos.");
                }
            } else {
                System.out.println("Eleccion invalida.");
            } 
        } else {
            System.out.println("La apuesta debe ser de 10000 en adelante");
        }
        lect.close();
    }
} 
    