package pertemuanke5;
import java.util.Scanner;
public class TugasParkir28 {
    public static void main(String[] args) {
        try (Scanner fauzi = new Scanner(System.in);) {
        int batasJamAwal = 2, tarifDasar = 2000, tarifTambahan = 1000, lamaParkir, jamTambahan, totalBiaya;

        System.out.print("Masukkan lama parkir: ");
        lamaParkir = fauzi.nextInt();

        if (lamaParkir <= batasJamAwal) {
            totalBiaya = tarifDasar;
            System.out.println(totalBiaya);
        } else {
            jamTambahan= lamaParkir-batasJamAwal;
            totalBiaya = tarifDasar+ (jamTambahan*tarifTambahan);
            System.out.println(totalBiaya);
        }
        }
    }
}
