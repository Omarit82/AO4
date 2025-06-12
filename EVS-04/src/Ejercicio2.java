import java.io.BufferedReader;
import java.io.InputStreamReader;
/*Escribir programa que lea por teclado el valor del radio de una circunferencia, 
calcule y muestre por pantalla la longitud y el área de la circunferencia. 
(Tener en cuenta el tipo de variable a utilizar). */

public class Ejercicio2 {
    

    /*Metodo que recibe un radio como double y retorna la superficie de la circunferencia. */
    public static double getArea(double radio){
        /*input: radio->double */
        /*Calculo del area a partir de un radio. */
        double area = Math.PI*radio*radio;
        /*output: area->double */
        return area;
    }
    /************************************************************************************** */
    /*Metodo que recibe un radio como double y retorna la longitud del perimetro de la circunferencia */
    public static double getPerimetro(double radio){
        /*input: radio->double */
        /*Calculo del perimetro de la circunferencia
         * output: 2*Math.PI*radio -> double
         */
        return 2*Math.PI*radio;
    }
    /*****************************************************************************************
    /*Metodo que recibe un double y lo devuelve con dos decimales */
    public static double dosDecimales(double num){
        /*input: num->double */
        /*Redondeo el numero a dos decimales */
        num = num*100;
        num = Math.round(num);
        num = num/100;
        /*Output: num->double con dos decimales. */
        return num;
    }
    /**************************************************************************************** */

    public static void main(String[] args) throws Exception{
        //INPUT radio-> double mayor a cero.
        double radio;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el valor del radio de la circunferencia");
        radio = Double.valueOf(input.readLine());
        //Validacion del valor ingresado
        do {
            if(radio<0){
                System.out.println("Valor ingresado invalido");
                System.out.println("Reingrese el valor del radio:");
                radio = Double.valueOf(input.readLine());
            }
        } while (radio<0);
        //OUTPUT Area y perimetro de la circunferencia ->double
        System.out.println("La superficie del circulo de radio "+radio+" es de: "+dosDecimales(getArea(radio)));
        System.out.println("El perimetro del circulo de radio "+radio+" es de: "+dosDecimales(getPerimetro(radio)));
    }
}
