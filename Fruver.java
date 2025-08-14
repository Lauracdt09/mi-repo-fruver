//ANALISIS:
/*
* Entradas: cant_bananos (double), cant_manzanas (double)
* Salidas: subt_bananos (double), subt_manzanas (double), total_sin_descuento(double),
* descuento_aplicado (double), totalfinal (double)
*
*Ejemplo: 2 manzanas y 3 bananos. subt_manzanas=2*1000=2000. subt_bananos=3*800 = 2400.
*total_sin_descuento = 4400. descuento_aplicado = 440. totalfinal =4400 - 440 = 3960
*/
import java.util.Scanner;

public class Fruver{
    public static void main(String[] args){

        final double precio_manzana = 1000;
        final double precio_banano = 800;
        final double descuento = 0.1;

        Scanner escaner = new Scanner(System.in);
    
        //Declaración de variable 
        System.out.println("Hola bienvenido, regalame tu nombre ");
        String mensaje = escaner.nextLine();
        System.out.println("Buenos dias " + mensaje);
        System.out.println("Cantidad de manzanas:");
        double cant_manzanas = escaner.nextDouble();
        escaner.nextLine();

        System.out.println("Cantidad de bananas:");
        double cant_bananos = escaner.nextDouble();
        escaner.nextLine();

        double subt_manzanas, subt_bananos, total_sin_descuento, descuento_aplicado, total_final;
        subt_manzanas = calcular_subtotal(cant_manzanas, precio_manzana);
        subt_bananos = calcular_subtotal(cant_bananos, precio_banano);

        System.out.println("El subtotal a pagar de manzanas es: " + subt_manzanas);
        System.out.println("El subtotal a pagar de bananos es: " + subt_bananos);

        total_sin_descuento = calcular_total_sin_descuento (subt_manzanas, subt_bananos);
        System.out.println("El total sin descuento es: " + total_sin_descuento);

        descuento_aplicado = calcular_descuento_aplicado (total_sin_descuento, descuento );
        System.out.println("El valor del descuento aplicado es: " + descuento_aplicado);

        total_final = calcular_total_final (total_sin_descuento, descuento_aplicado );
        System.out.println("El valor total de su compra es: " + total_final);


       

        //System.out.println("Ingresaste: "+numero1);
    
    }

    public static double calcular_subtotal (double cantidad, double precio){
        double subtotal = cantidad * precio;
        return subtotal;
    }

    public static double calcular_total_sin_descuento (double subt_manzanas, double subt_bananos){
        double total_sin_descuento = subt_manzanas + subt_bananos;
        return total_sin_descuento;
    }

    public static double calcular_descuento_aplicado (double total_sin_descuento, double descuento){
        double descuento_aplicado = total_sin_descuento *descuento;
        return descuento_aplicado;
    }

    public static double calcular_total_final (double total_sin_descuento, double descuento_aplicado){
        double total_final = total_sin_descuento - descuento_aplicado;
        return total_final;
    }


}
