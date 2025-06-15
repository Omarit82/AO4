import java.io.BufferedReader;
import java.io.InputStreamReader;

/**   
 * Realice un programa en Java que permita al usuario ingresar varios pares de números enteros,
 * de a uno por vez. Por cada par ingresado, el programa debe:
 *      Calcular la suma de los dos números.
 *      Mostrar si el resultado es par o impar.
 *      Luego de mostrar el resultado, el programa debe preguntar al usuario si desea continuar 
 *      ingresando más datos. Si el usuario responde "sí", se repite el proceso; si responde "no",
 *      el programa finaliza.

    Implementar el programa utilizando al menos un método con retorno y al menos un método sin retorno
    Utilice el ciclo mas apropiado. Justifique

    Validar las respuestas solo aceptando "sí" o "no" (ignorar mayúsculas/minúsculas). */
public class ActividadIntegradora2 {
    /**METODO ESTATICO QUE RECIBE DOS ENTEROS Y RETORNA LA SUMA DE AMBOS */
    public static int retornaSuma(int uno,int dos){
        //INPUT: uno y dos -> integer
        int resultado;
        //PROCESO: ejecuta la suma de los dos numeros
        resultado = uno+dos;
        //OUTPUT: resultado -> integer
        return resultado;
    }
    /**METODO ESTATICO VOID QUE IMPRIME SI LA SUMA DE LOS NUMEROS ES PAR O IMPAR  */
    public static void esParImpar(int num){
        //INPUT: num->integer
        //PROCESO: evaluacion del numero ingresado para saber si es par o impar
        if(num % 2 == 0){
            //OUTPUT: String con el resultado es par.
            System.out.println("La suma es par!");
        }else{
            //OUTPUT: String con el resultado es impar.
            System.out.println("La suma es impar!");
        }
    }
    
    /******METODO MAIN*** ***/
    public static void main(String[] args) throws Exception{
        //INPUT: primero y segundo -> integer
        //      respuesta -> String.
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int primero;
        int segundo;
        int suma;
        boolean finalizar = false;
        System.out.println("Bienvenido!\nIngrese un par de numeros enteros");
        //UTILIZO UN DO-WHILE DADO QUE NO CONOZCO EL NUMERO DE ITERACIONES DE ANTEMANO(para utilizar un for) Y
        //DEBO EJECUTAR AL MENOS UNA VEZ EL CODIGO DENTRO DEL DO.
        do {
            System.out.println("Primer numero: ");
            primero = Integer.valueOf(input.readLine());
            System.out.println("Segundo numero: ");
            segundo = Integer.valueOf(input.readLine());
            //PROCESO: utiliza el metodo estatico retornaSuma para obtener la suma de los numeros.
            suma = retornaSuma(primero,segundo);
            System.out.println("La suma de ambos numeros es: "+suma);
            //PROCESO: utiliza el metodo estatico esParImpar para declarar si la suma es par o impar.
            esParImpar(suma);
            System.out.println("Desea ingresar un nuevo par de numeros?(ingrese si o no)");
            String respuesta = input.readLine();
            //PROCESO: valida la respuesta ingresada
            while (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println("Ingreso incorrecto reingrese");
                System.out.println("Desea ingresar un nuevo par de numeros?(ingrese si o no)");
                respuesta = input.readLine();
            }     
            //PROCESO: si la respuesta es 'no' finalizo el ciclo while con la variable booleana finalizar.
            if(respuesta.equals("no")){
                finalizar = true;
            }
        } while (!finalizar);
    }
}
