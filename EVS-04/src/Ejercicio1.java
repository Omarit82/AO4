import java.io.BufferedReader;
import java.io.InputStreamReader;
//Escribe un programa que encuentre todos los números primos entre dos límites ingresados por el usuario. 
//Usa un ciclo for para iterar entre los límites y otro ciclo anidado while() (dentro de un método) para 
//verificar la primalidad. 
//Al final, mostrar la lista de números primos encontrados y la suma de los mismos.

public class Ejercicio1 {
    
    //Metodo que recibe un entero y evalua si es primo.
    public static boolean isPrimo(int numero){
        /*input: numero->entero */
        boolean response = true;
        int divisor = numero-1;
        while((divisor > 1)&&(divisor<numero)){
            if(numero%divisor == 0){
                response = false;
            }
            divisor--;
        }
        /*Outputs: El metodo static isPrimo retorna: 
        response ->boolean */
        return response;
    }
    /***********************************************/

    public static void main(String[] args) throws Exception {
        /*INPUTS
          limiteInferior -> integer
          LimiteSuperior -> integer (donde además limiteInferior < limiteSuperior.)
        */
        int limiteInferior;
        int limiteSuperior;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("PROGRAMA PARA ENCONTRAR NUMEROS PRIMOS ENTRE DOS NUMEROS DADOS");
        // Lectura de los dos numeros naturales ingresados
        System.out.println("Ingrese el limite inferior");
        limiteInferior = Integer.valueOf(input.readLine());
        System.out.println("Ingrese el limite superior");
        limiteSuperior = Integer.valueOf(input.readLine());
        // Validación de los numeros ingresados.
        do {
            if(limiteInferior >= limiteSuperior) {
                System.out.println("El Limite inferior debe ser menor al limite superior");
                System.out.println("Reingrese el limite superior");
                limiteSuperior = Integer.valueOf(input.readLine());
            }
        } while (limiteInferior >= limiteSuperior);

        System.out.println("Listado de numeros primos:");
        /*Ciclo que recorre los numeros desde el limite inferior al limite superior */
        for (int i = limiteInferior; i < limiteSuperior; i++){
            if(isPrimo(i)){
                /*Outputs:
                i -> integer en caso de que sea primo */
                System.out.println(i+" es un numero primo");
            }
        }
    }
}
