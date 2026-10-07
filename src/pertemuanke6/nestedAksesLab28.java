package pertemuanke6;
import java.util.Scanner;

public class nestedAksesLab28 {
    public static void main(String[] args) {
        try (Scanner fauzi = new Scanner(System.in)) {
            boolean mahasiswaAktif;
            boolean sedangDisanksi;
            boolean punyaIzinDosen;
            boolean asistenLab;

            System.out.print("Apakah mahasiswa aktif(true/false): ");
            mahasiswaAktif = fauzi.nextBoolean();
            System.out.print("Apakah sedang disanksi(true/false): ");
            sedangDisanksi = fauzi.nextBoolean();
            System.out.print("Apakah memiliki izin dari dosen (true/false): ");
            punyaIzinDosen = fauzi.nextBoolean();
            System.out.print("Apakah asisten lab (true/false): ");
            asistenLab = fauzi.nextBoolean();

            if (mahasiswaAktif && !sedangDisanksi) {
                if (punyaIzinDosen || asistenLab) {
                    System.out.println("Akses laboratorium diberikan");
                } else {
                    System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
                }
            } else {
                 System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
            }
   //fauzi.close();
        }
    }
}
