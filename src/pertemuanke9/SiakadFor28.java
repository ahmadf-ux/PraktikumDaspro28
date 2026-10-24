//Batas perulangan FOR = 8 + (28 mod 5) = 11
//Batas kelulusan = 55 + (28 mod 11) = 61

import java.util.Scanner;

public class SiakadFor28 {

    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++) {
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
        fauzi.close();
    }
}
