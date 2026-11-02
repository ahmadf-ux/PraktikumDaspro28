package pertemuanke10;
// uji awal, langkah 3: n = 2 + (28 mod 3) = 3
import java.util.Scanner;
public class Triangle28 {
    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = fauzi.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        i = n;
         while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        fauzi.close();
    }
}
