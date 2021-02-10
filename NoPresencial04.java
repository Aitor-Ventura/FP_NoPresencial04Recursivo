package es.ulpgc.eii.recursive;

/*  Aitor Ventura Delgado
    09.03.2019
    Haremos un método que haga el máximo común divisor de dos números pasados
    como parámetros. Manera recursiva. */

public class MathUtils {
    public static int mcd(int a, int b){
        //Mientras el segundo parámetro sea diferente de 0
        if (b != 0){
            /*Repetir el proceso con el segundo parámetro y el resto del primero
            entre el segundo*/
            return mcd(b, a%b);
        //Cuando sea 0
        } else {
            //Devolver el primer parámetro, que será el común divisor
            return a;
        }
    }
}