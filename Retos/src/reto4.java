import java.util.Scanner;
public class reto4 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        String nom, elecUsua;
        int apuesta, total=0,elecC;
        
        System.out.println("Ingrese su nombre");
        nom = lect.next();
        System.out.println("Ingrese su apuesta");
        apuesta = lect.nextInt(); 

    if (apuesta>=10000) {
    System.out.println("Elige piedra, papel o tijera:");
    elecUsua = lect.next();
    elecC = (int)Math.floor(Math.random()*3) ;
    System.out.println(elecC);

        if (elecUsua.equals("piedra")) {
            if (elecC==1) {
                System.out.println("Jugador "+nom+" ha salido papel, usted ha perdido "+apuesta+" pesos.");
            } else if (elecC==2){
                System.out.println("Jugador "+nom+" ha salido piedra, ha quedado en empate");
            }else {
                total=apuesta*2;
                System.out.println("Jugador "+nom+ " ha salido tijera, usted ha ganado "+total+" pesos.");
            }
        } else if (elecUsua.equals("papel")) {
            if (elecC==1) {
                System.out.println("Jugador "+nom+" ha salido tijera, usted ha perdido "+apuesta+" pesos.");
            } else if (elecC==2){
                System.out.println("Jugador "+nom+" ha salido papel, ha quedado en empate");
            } else {
                total=apuesta*2;
                System.out.println("Jugador "+nom+ "ha salido piedra, usted ha ganado "+total+" pesos.");
            }

        } else if (elecUsua.equals("tijera")) {
            if (elecC==1) {
                System.out.println("Jugador "+nom+" ha salido piedra, usted ha perdido "+apuesta+" pesos.");
            } else if (elecC==2){
                System.out.println("Jugador "+nom+" ha salido tijera, ha quedado en empate");
            } else {
                total=apuesta*2;
                System.out.println("Jugador "+nom+ "ha salido papel, usted ha ganado "+total+" pesos.");
            }
        }
        
    } else {
        System.out.println("La apuesta debe ser de 10000 en adelante");
    }
    lect.close();
    }
}

