package Lista1.Exercicio1_2;

public class Palindromo {
        public static boolean ehPalindromo(String texto) {

            String formatado = texto.replaceAll("\\s+", "").toLowerCase();

            String invertido = new StringBuilder(formatado).reverse().toString();

            return formatado.equals(invertido);
        }

}
