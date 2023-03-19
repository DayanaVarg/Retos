import java.util.Scanner;
public class reto7 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        String nom, elecUsua;
        int apuesta, total=0,elecC,din,i=0,resp,acu=0;
        
        System.out.println("Ingrese su nombre");
        nom = lect.next();
        System.out.println("Ingrese su cantidad de dinero");        
        din = lect.nextInt();

        do {
        System.out.println("Ingrese su apuesta");
        apuesta = lect.nextInt(); 
            if (apuesta>=din) {
            System.out.println("Elige piedra, papel o tijera:");
            elecUsua = lect.next();
            elecC = (int)Math.floor(Math.random()*3) ;
            System.out.println(elecC);

                if (elecUsua.equals("piedra")) {
                    if (elecC==1) {
                    System.out.println("Jugador "+nom+" ha salido papel, por lo tanto ganó la máquina.");
                    acu=acu-apuesta;
                    } else if(elecC==2) {
                    System.out.println("Jugador "+nom+" ha salido piedra, por lo tanto es empate.");
                    acu=acu*1;
                    } else {
                    total=apuesta*2;
                    acu=acu+total;
                    System.out.println("Jugador "+nom+ " ha salido tijera, usted ha ganado.");
                    }

                } else if (elecUsua.equals("papel")) {
                    if (elecC==1) {
                    System.out.println("Jugador "+nom+" ha salido tijera, por lo tanto ganó la máquina.");
                    acu=acu-apuesta;
                    } else if(elecC==2) {
                    System.out.println("Jugador "+nom+" ha salido papel, por lo tanto es empate.");
                    acu=acu*1;
                    } else {
                    total=apuesta*2;
                    System.out.println("Jugador "+nom+ "ha salido piedra, usted ha ganado.");
                    acu=acu+total;
                    }

                } else if (elecUsua.equals("tijera")) {
                    if (elecC==1) {
                    System.out.println("Jugador "+nom+" ha salido piedra, por lo tanto ganó la máquina.");
                    acu=acu-apuesta;
                    } else if(elecC==2) {
                    System.out.println("Jugador "+nom+" ha salido tijera, por lo tanto es empate.");
                    acu=acu*1;
                    } else {
                    total=apuesta*2;
                    System.out.println("Jugador "+nom+ "ha salido papel, usted ha ganado.");
                    acu=acu+total;
                    }
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

