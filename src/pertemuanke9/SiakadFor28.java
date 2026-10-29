package pertemuanke9;
//Batas perulangan FOR = 8 + (28 mod 5) = 11
//Batas kelulusan = 55 + (28 mod 11) = 61
import java.util.Scanner;
public class SiakadFor28 {
    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 11; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-" + i + ":");
            nilai = fauzi.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + tidakLulus);
        fauzi.close();
    }
}
