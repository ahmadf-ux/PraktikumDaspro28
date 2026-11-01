package pertemuanke10;
// n (uji ke 1) = 3 + (28 mod 5) = 6  
// n (uji ke 2) = 9 + (28 mod 5) = 12
// n Pertanyaan 1 & 2 = 4 + (28 mod 4) = 4 
// n Pertanyaan 3 = 10 + (28 mod 6) = 14

import java.util.Scanner;
public class Star28 {
    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);
        int n;
        System.out.print("Masukkan nilai n: ");
        n = fauzi.nextInt();

        for (int i = 2; i <= n; i += 2) {
            System.out.print((i - 1) + " ");
        }
        System.out.println();
        fauzi.close();
    }
}
