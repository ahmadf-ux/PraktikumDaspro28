package pertemuanke12;
//uji wajib tambahan: nilai yang diinput = 30 + (28 mod 71) = 58
import java.util.Scanner;
public class ArrayRataNilai28 {
    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);

        int element;
        System.out.print("Masukkan jumalah element array: ");
        element = fauzi.nextInt();

        int[] nilaiMhs = new int[element];
        int total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = fauzi.nextInt();
            total += nilaiMhs[i];
        }
        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        String predikat = "";
        int lulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];

            if (rata2 >= 85) {
                predikat = "SANGAT BAIK";
            } else if (rata2 >= 70) {
                predikat = "BAIK";
            } else {
                predikat = "PERLU PENDAMPINGAN";
            }

            if (nilaiMhs[i] >70) {
                lulus++;
            }
        }                      
        System.out.println("Predikat Kelas: " +predikat);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Banyak mahasiswa yang lulus: " + lulus);
        fauzi.close();
    }
}
