package pertemuanke10;
// Uji wajib: n = 5 + (28 mod 4) = 5
import java.util.Scanner;

public class Tugas2_28 {
    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);

        int totalHasil = 0;
        int hasil;
        System.out.print("Masukkan nilai n = ");
        int n = fauzi.nextInt();

         for (int i = 1; i <= n; i++) {         
            for (int j = 1; j <= n; j++) {      
                hasil = j * i; 
                System.out.printf("%4d", hasil);
                totalHasil += hasil;
            }
            System.out.println();                   
        }
        System.out.println("Jumlah seluruh angka: " + totalHasil);
        fauzi.close();
    }
}
