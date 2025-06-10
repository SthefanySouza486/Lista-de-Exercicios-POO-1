package Lista3.Exercicio3_1;

public class Main {
    public static void main(String[] args) {
        Numero n1 = new Numero(0);
        n1.setValor(1);
        n1.imprimirValor();

        System.out.println("Endereço simulado do objeto: " + System.identityHashCode(n1));

    }
}
