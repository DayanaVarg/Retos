import java.util.Scanner;
public class reto8 {
    public static void main(String[] args) {
       Scanner lect=new Scanner(System.in);
       int num, rest=10, elec; 
       num=(int)Math.floor(Math.random()*100);

       System.out.println(num);
       System.out.println("Adivina un número del 1 al 100, tienes 10 intentos. ¡Suerte!");

       do{
        System.out.println("Intento #"+(11-rest)+": ");
        elec=lect.nextInt();
            if (elec==num) {
            System.out.println("Felicidades has adivinado el número \nFueron "+(11-rest)+" intentos.");
            return;
            } else if (elec<num) {
            System.out.println("El número a adivinar es mayor, vuelve a intentarlo");
            } else if (elec>num){
            System.out.println("El número a adivinar es menor, vuelve a intentarlo");
            }
        rest--;
       } while(rest>0);
       
       System.out.println("Lo siento, no adivinaste el número \nEl número a adivinar era: "+num);
       lect.close();
    }
}
