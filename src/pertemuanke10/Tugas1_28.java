package pertemuanke10;
//Uji wajib: n = 6 + (28 mod 5) = 9  
import java.util.Scanner;

public class Tugas1_28 {

    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = fauzi.nextInt();

        int totalNilai = 0;
        int nilai = 0;
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(" " + j);
                nilai = j;
                j++;
            }
            totalNilai += nilai;
            System.out.println();
            i++;
        }
        System.out.println("Total angka tercetak: " + totalNilai);
    }
}
