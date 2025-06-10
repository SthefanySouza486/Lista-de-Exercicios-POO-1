package Lista3.Exercicio3_2;

public class ValorContainer {
    int valor;

    public ValorContainer(int valor) {
        this.valor = valor;
    }

    public static void trocarValores(ValorContainer refA, ValorContainer refB) {
        int temp = refA.valor;
        refA.valor = refB.valor;
        refB.valor = temp;
    }
}
