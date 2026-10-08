package pertemuanke7;
import java.util.Scanner;
public class StudiKasus2_28{
    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);
        String namaMhs, jnsKegiatan;
        int jmlDokumen, peringkat , statusPendanaan, dokumenKurang;

        System.out.print("Nama mahasiswa: ");
        namaMhs = fauzi.nextLine();
        System.out.print("Jenis kegiatan: ");
        jnsKegiatan = fauzi.nextLine();
        System.out.print("Jumlah Dokumen: ");
        jmlDokumen = fauzi.nextInt();

        if (jnsKegiatan.equalsIgnoreCase("BELMAWA") || jnsKegiatan.equalsIgnoreCase("BAKORMA") || jnsKegiatan.equalsIgnoreCase("MANDIRI") ) {
            System.out.print("Peringkat juara: ");
            peringkat = fauzi.nextInt();
            System.out.println("Nama Mahasiswa: " + namaMhs);
            System.out.println("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): " + jnsKegiatan);
            System.out.print("Peringkat juara: " + peringkat);
            if (peringkat == 1 || peringkat == 2 || peringkat == 3) {
                if (jmlDokumen == 4) {
                    System.out.println("Anda berhak untuk mendapatkan dana penghargaan.");
                } else {
                    dokumenKurang = 4 - jmlDokumen;
                    System.out.println("Dokumen anda kurang "+ dokumenKurang + " dokumen." );
                    System.out.println("Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Anda tidak berhak mendapatkan dana penghargaan");
            }
        } else if (jnsKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status : ");
            statusPendanaan = fauzi.nextInt();
            System.out.println("Nama Mahasiswa: " + namaMhs);
            System.out.println("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): " + jnsKegiatan);
             if (statusPendanaan == 1) {
                System.out.println("Anda berhak untukmendapatkan  dana penghargaan.");
                 if (jmlDokumen == 4) {
                    System.out.println("");
            } else {
                dokumenKurang = 4 - jmlDokumen;
                System.out.println("Dokumen anda kurang "+ dokumenKurang + " dokumen." );
                System.out.println("Dana penghargaan tidak diberikan.");
            }
            } else {
                System.out.println("Tidak memperoleh dana penghargaan (PKM tidak tidak lolos pendanaan)");
            }
        } else if (jnsKegiatan.equalsIgnoreCase("lainnya")) {
           System.out.println("Tidak memperoleh dana penghargaan mahasiswa");
        } else {
            System.out.println("Jenis kegiatan tidak valid.");
        }
        fauzi.close();
        
    }
}
