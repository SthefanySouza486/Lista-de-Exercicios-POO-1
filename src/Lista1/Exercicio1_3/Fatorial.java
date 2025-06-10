package Lista1.Exercicio1_3;

public class Fatorial {
    public static long fatorial(int n) {
        if (n < 2) {
            return n;
        }  return n * fatorial(n - 1);
        }
    }

