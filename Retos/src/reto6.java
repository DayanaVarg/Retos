import java.util.Scanner;
public class reto6 {
    public static void main(String[] args) {
        Scanner lect=new Scanner(System.in);
        String nom, elec;
        int apuesta,total=0,din, acu=0,i=0,resp;
        double res;

        System.out.println("Ingrese su nombre");
        nom = lect.next();
        System.out.println("Ingrese su cantidad de dinero");        
        din = lect.nextInt();

        do {           
        System.out.println("Ingrese su apuesta");
        apuesta = lect.nextInt();
            if (apuesta>=din) {
                System.out.println("Elija cara o sello : ");
                elec = lect.next();
                res=(int)Math.floor(Math.random()*2);
                if (elec.equals("cara")) {
                    if (res == 1) {
                     total=apuesta*2;
                     System.out.println("Jugador "+nom+" ha salido cara, usted ha ganado.");
                    acu=acu+total;
                    } else {
                     System.out.println("Jugador "+nom+" ha salido sello, por lo tanto ganó la máquina.");
                     acu=acu-apuesta;
                    }
                } else if (elec.equals("sello")) {
                    if (res == 1) {
                     total=apuesta*2;
                     System.out.println("Jugador "+nom+" ha salido sello, usted ha ganado.");
                     acu=acu+total;
                    } else {
                     System.out.println("Jugador "+nom+" ha salido cara, por lo tanto ganó la máquina.");
                     acu=acu-apuesta;
                    }
                } else {
                 System.out.println("Eleccion invalida.");
                }   
            
            } else {
             System.out.println("La apuesta debe ser mayor a la cantidad de dinero que tiene");
            }

        i++;
        System.out.println("¿Desea jugar de nuevo?\n 1.Si\n 2.No");
        resp=lect.nextInt();
        } while (resp==1);
        
        System.out.println("Jugador "+nom+" el juego ha finalizado");
        System.out.println("Usted ha jugado: "+i+" veces");
        System.out.println("Ha acumulado: "+acu+" pesos. ¡Felicidades!");
        lect.close();
    }
} 
