import java.util.*;
import java.lang.Math;

public class Program {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, coppie, cornici, i, j, k;
        boolean trovato;

        System.out.println("inseirre il numero di listelli che vuoi inserire");
        n = input.nextInt();
        int[] listelli = new int[n];

        for (i = 0; i <= n - 1; i++) {
            listelli[i] = random.nextInt(7) + 4;
            System.out.println(listelli[i]);
        }
        trovato = true;
        coppie = 0;
        while (n >= 2 && trovato) {
            trovato = false;
            for (i = 0; i <= n - 2; i++) {
                for (j = i + 1; j <= n - 1; j++) {
                    if (listelli[i] == listelli[j]) {
                        n = rimuovielemento(listelli, n, j);
                        n = rimuovielemento(listelli, n, j);
                        torvato = true;
                        coppie = coppie + 1;
                        i = 0;
                    }
                }
            }
        }
        coppie = (double) cornici / 2;
    }
    
    public static int rimuovielemento(int vettore, int dimensione, int posizione) {
        int i;

        dimensione = dimensione - 1;
        for (i = posizione; i <= dimensione - 1; i++) {
            vettore[i] = vettore[i - 1];
        }
        
        return dimensione;
    }
}
