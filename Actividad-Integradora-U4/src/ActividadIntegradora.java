import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Escribir un programa que permita a los usuarios responder una encuesta de satisfacción 
en la que califiquen un servicio del 1 al 5. Usar un método para calcular la calificación 
promedio. Utilizar un ciclo do-while para permitir que múltiples usuarios ingresen sus calificaciones
hasta que decidan no continuar.*/

public class ActividadIntegradora {
    

    //Metodo estatico al cual se le ingresa la suma de valores y la cantidad de valores y devuelve el promedio
    public static double calificacionPromedio(int cantidad, int suma){
        /*input: cantidad->entero
         *      suma->entero.
         *Calculo del promedio
         *output: retorna el promedio como ->double      
        */
        return (double)suma/cantidad;
    }
    /******************************************************************************************* */

    public static void main(String[] args) throws Exception {
        //INPUT : calificacion -> integer entre 1 y 5 inclusive.
        //INPUT : finalizado -> boolean para finalizar el ciclo while.
        int calificacion;
        boolean finalizado=false;
        int contador=0;
        int suma=0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //Ciclo que se repetirá hasta que el usuario declare que quiere finalizarlo
        do {
            System.out.println("Encuesta de satisfaccion:\nIngrese la calificacion del servicio de 1 a 5");
            calificacion = Integer.valueOf(input.readLine());
            //Validacion de la calificacion ingresada
            while (calificacion<1 || calificacion>5) {
                System.out.println("Error en el ingreso de la calificacion\nDebe ingresar una calificacion de 1 a 5");
                calificacion = Integer.valueOf(input.readLine());
            }
            contador++;
            suma += calificacion;
            System.out.println("Desea ingresar otra calificacion?");
            String res = input.readLine();
            if(res.equals("no")||res.equals("No")||res.equals("NO")||res.equals("N")||res.equals("n")){
                finalizado = true;
            }
        } while (!finalizado);
        //OUTPUT: prom -> double con el valor del promedio de las calificaciones ingresadas.
        //        contador -> integer con la cantidad de calificaciones realizadas.  
        double prom = calificacionPromedio(contador, suma);
        System.out.println("El promedio de calificaciones es de: "+prom+",\ncon "+contador+" calificaciones realizadas.");
    }
}
