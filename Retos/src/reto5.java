import java.util.Scanner;
public class reto5 {
   public static void main(String[] args) {
      Scanner lect=new Scanner(System.in);
        int cant,precio,total=0,pagar,total1=0,doc, usua=1013106777,usua1=1018479035,usua3,i=1;
        String emple,clie,pro,ape,nom;
        System.out.println("Querido cliente, por favor ingrese su nombre");
        clie=lect.next();
        System.out.println("Ingrese su documento de identidad");
        doc=lect.nextInt();
        if (doc==usua || doc==usua1 ) {
            System.out.println("Bienvenid@ "+clie);
            System.out.println("Ingrese el nombre del empleado que realiza la venta");
            emple=lect.next();
            System.out.println("Ingrese la cantidad de productos a comprar");
            cant=lect.nextInt();

            for (i=1;i<=cant;i++) {
                System.out.println("Ingrese el nombre del producto #"+i);
                pro=lect.next();
                System.out.println("Ingrese el precio del producto");
                precio=lect.nextInt();
                total=total+precio;
                System.out.println("El precio del producto #"+i+" es:"+precio);
            }

         System.out.println("El total a pagar es: "+total);   
         System.out.println("¿Con cuánto desea pagar?");
         pagar=lect.nextInt();

            if (pagar<total) {
               total1=total-pagar;
               System.out.println("Querido cliente, no le alcanza para pagar la compra, le hacen falta: "+total1+" pesos");
            } else if (pagar>total) {
               total1=pagar-total;
               System.out.println("Querido cliente, su cambio es: "+total1+" pesos");
            } else {
               System.out.println("Tenga un buen día");
            }
        } else {
            System.out.println("Usted no se encuentra en el sistema, por favor registre sus datos");
            System.out.println("Ingrese su documento de identidad");
            usua3=lect.nextInt();
            System.out.println("Ingrese su nombre");
            nom=lect.next();
            System.out.println("Ingrese su apellido");
            ape=lect.next();

            System.out.println("Bienvenid@ "+nom);
            System.out.println("Ingrese el nombre del empleado que realiza la venta");
            emple=lect.next();
            System.out.println("Ingrese la cantidad de productos a comprar");
            cant=lect.nextInt();

            for (i=1;i<=cant;i++) {
                System.out.println("Ingrese el nombre del producto #"+i);
                pro=lect.next();
                System.out.println("Ingrese el precio del producto");
                precio=lect.nextInt();
                total=total+precio;
                System.out.println("El precio del producto #"+i+" es:"+precio);
            }

            System.out.println("El total a pagar es: "+total);   
            System.out.println("¿Con cuánto desea pagar?");
            pagar=lect.nextInt();

            if (pagar<total) {
               total1=total-pagar;
               System.out.println("Querido cliente, no le alcanza para pagar la compra, le hacen falta: "+total1+" pesos");
            } else if (pagar>total) {
               total1=pagar-total1;
               System.out.println("Querido cliente, su cambio es: "+total1+" pesos");
            } else {
               System.out.println("Tenga un buen día");
            }        
        }
    lect.close();    
    }
}
