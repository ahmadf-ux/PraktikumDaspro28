package pertemuanke6;
import java.util.Scanner;

public class operatorLogikaWifi28 {
    public static void main(String[] args) {
        
        try (Scanner fauzi = new Scanner(System.in)) {
            boolean mahasiswa;
            boolean dosen;
            boolean akunDiBlokir;

            System.out.print("Apakah pengguna adalah mahasiswa? (true/false): ");
            mahasiswa = fauzi.nextBoolean();
            System.out.print("Apakah pengguna adalah dosen? (true/false): ");
            dosen = fauzi.nextBoolean();
            System.out.print("Apakah akun sedang diblokir? (true/false): ");
            akunDiBlokir = fauzi.nextBoolean();

            if ((mahasiswa && dosen) && !akunDiBlokir) {
                System.out.println("Akses wifi diberikan");
            } else {
                System.out.println("Akses wifi ditolak");
            }
      //fauzi.close();
        }
    }
}
