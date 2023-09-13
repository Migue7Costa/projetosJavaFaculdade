public class Main14 {
    public static void main(String[] args) {

        System.out.println("Calcula números Primos");

        int limiteSuperior = 100;

        System.out.println("Números primos de 1 a " + limiteSuperior + ":");

        for (int numero = 2; numero <= limiteSuperior; numero++) {
            if (ePrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
    }

    // Função para verificar se um número é primo
    public static boolean ePrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}