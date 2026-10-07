package pertemuanke6;
import java.util.Scanner;

public class tugas2SeleksiAsisten28 {
    public static void main(String[] args) {
        try (Scanner fauzi = new Scanner(System.in)) {
            boolean mahasiswaAktif, sansiakademik, sertifKompetensiPemrograman;
            double nilaiDasarPemrograman, nilaiWawancara;

            System.out.print("Apakah mahasiswa aktif (true/false: )");
            mahasiswaAktif = fauzi.nextBoolean();
            System.out.print("Apakah mahasiswa sedang menerima sanksi akademik (true/false: )");
            sansiakademik = fauzi.nextBoolean();

            if (mahasiswaAktif && !sansiakademik) {
                System.out.println("Mahasiswa bisa mengikuti seleksi");
                System.out.print("Apakah mahasiswa memiliki srtifikat kompetensi pemrograman (true/false: )");
                sertifKompetensiPemrograman = fauzi.nextBoolean();
                System.out.print("Masukkan nilai dasar pemrograman: ");
                nilaiDasarPemrograman = fauzi.nextDouble();
                if (nilaiDasarPemrograman > 81 || sertifKompetensiPemrograman) {
                    System.out.println("Mahasiswa bisa melanjutkan ke proses wawancara");
                    System.out.print("Masukkan nilai wawancara: ");
                    nilaiWawancara = fauzi.nextDouble();
                    if (nilaiWawancara > 76) {
                        System.out.println("Selamat anda diterima sebagai asisten praktikum");
                    } else {
                        System.out.println("Mohon maaf anda tidak diterima sebagai asisten praktikum");
                    }
                } else {
                    System.out.println("Mohon maaf anda tidak bisa melanjutkan ke proses seleksi selanjutnya");
                }
            } else {
                System.out.println("Mahasiswa tidak bisa mengikuti seleksi calon asisten praktikum");
            }
        }

        //fauzi.close();
    }
}
