package pertemuanke10;
// uji wajib, langkah 10: jumlahKelompok = 2 + (28 mod 3) = 3
// uji wajib, langkah 10: jumlahPenilai = 3 + (28 mod 2) = 3

import java.util.Scanner;

public class NilaiKelompok28 {

    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok: ");
        int jumlahKelompok = fauzi.nextInt();
        System.out.print("Masukkan jumlah penilai: ");
        int jumlahPenilai = fauzi.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomorKelompok = 1;         // perhitungan outer loop
            double rataTertinggi = -1;      // -1 agar kelompok pertama pasti tercatat
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("Kelompok " + nomorKelompok);
                double totalNilai = 0;
                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                    do {
                        System.out.print("Nilai dari Penilai " + j + ": ");
                        nilai = fauzi.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println(" Niali harus 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                }
                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok + ": nilai rata-rata = " + rataNilai);
                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                }
                System.out.println();
                nomorKelompok++;
            }
            System.out.println("===============================");
            System.out.println("Kelompok Terbaik\t: " + kelompokTerbaik);
            System.out.println("Rata-rata Tertinggi\t: " + rataTertinggi);
        }
        fauzi.close();
    }
}
