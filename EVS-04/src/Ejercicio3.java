import java.io.BufferedReader;
import java.io.InputStreamReader;
/*Escribe un programa que convierta un número decimal a binario utilizando un ciclo while(), 
pero imprime el resultado en bloques de 4 bits separados por espacios. Por ejemplo, el número 45
sería convertido a 0010 1101. */
public class Ejercicio3 {
    

    /*Metodo que recibe un numero natural y devuelve un binario en formato String*/
    public static String getBinario(int num){
        /*INPUT: num-> int */
        String res="";
        /* Evaluo que el numero no pueda ser interpretado como binario por defecto.(0 o 1) */
        if(num < 2){
            res= String.valueOf(num);
        }
        
        /* Convierto el numero decimal a binario realizando cocientes de 2 sucesivos.
         * quedandome con los restos que voy agregando a la cadena res que es un String.
         */
        while (num>=1) {
            if(num%2 == 0){
                res = String.join("","0",res);
            }else{
                res =String.join("","1",res);
            }
            num = (int) num/2;
        }
        /*Output res-> String. */
        return res;
    }
    /******************************************************************************* */

    /*Metodo que recibe un String binario y lo divide en bits de 4 caracteres */
    public static String binariToFourUnits(String cadena){
        /*Input: cadena->String */
        //Casos donde la cadena tiene menos de 4 caracteres - completo
        while (cadena.length() < 4) {
            cadena = String.join("","0",cadena);
        }
        //Casos donde la cadena tiene mas de 4 caracteres - divido
        if(cadena.length()>4){
            //Primero completo para que tenga una cantidad de caracteres multiplos de 4
            while(cadena.length()%4 !=0){
                cadena = String.join("","0" ,cadena);
            }
            //Divido en grupos de 4
            int index = 0;
            String newCadena="";
            while(index < cadena.length()){
                /*cuando arribo a un multiplo de 4 (4, 8, 12, 16) agrego un espacio */
                if(((index)%4==0)&&index>0){
                    newCadena = String.join(" ",cadena.substring(cadena.length()-index-1,cadena.length()-index) ,newCadena);
                }else{
                    newCadena = String.join("",cadena.substring(cadena.length()-index-1,cadena.length()-index),newCadena);
                }
                index++;
            }
            /*Convierto la cadena rectificada con ceros en la que contiene los espacios */
            cadena = newCadena;
        }
        /*Output: cadena->String */
        return cadena;
    }
    /*************************************************************************************************** */
    
    public static void main(String[] args) throws Exception {
        //INPUT: numero->int
        int numero;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un numero");
        numero = Integer.valueOf(input.readLine());
        /*INPUT: numero -> int */
        /*Ingreso el numero a dos metodos anidados el primero getBinario devuelve el numero ingresado
         * en forma de string. Ese valor ingresa al segundo metodo binariToFourUnits que toma como input
         * un string que representa un numero binario y retorna el mismo string pero con un espacio cada
         * cuatro caracteres.
        */
        System.out.println(binariToFourUnits(getBinario(numero)));
    }
}
