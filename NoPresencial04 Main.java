import es.ulpgc.eii.recursive.MathUtils;

public class Main {
    /**
     * Prueba el método MathUtils.mcd
     * @param input1
     * @param input2
     * @param expected - resultado esperado (mcd(input1, input2))
     */
    static void test(int input1, int input2, int expected) {
    	// Se informa del caso que se está probando
    	System.out.println("probando: mcd(" + input1 + ", " + input2 + ")");
    	
        // Llamada al método a probar
        int result = MathUtils.mcd(input1, input2);
        
        // Comprobación de los resultados
        if (result != expected) {
            System.out.print(">> Resultado erróneo, deberia ser: " + expected + "");
            System.out.println(" y es: " + result + "");
        } else {
            System.out.println(">> Resultado correcto: " + result + "");
        }        
    }

    /**
     * @param args
     */
    /**
     * Invoca a test para realizar múltiples pruebas de StringUtils.span
     * @param args
     */
    public static void main(String[] args) {
        test(25, 20, 5);
        test(34, 0, 34);
        test(90, 60, 30);
    }
}
