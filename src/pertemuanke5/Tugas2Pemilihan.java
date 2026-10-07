package pertemuanke5;
import java.util.Scanner;
public class Tugas2Pemilihan {
    public static void main(String[] args) {
        
        try (Scanner fauzi = new Scanner(System.in);) {
        
        int jumlahSks;

        System.out.print("Masukkan jumlah SKS: ");
        jumlahSks = fauzi.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }
        }
    }
}
