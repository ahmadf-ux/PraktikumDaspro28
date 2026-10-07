package pertemuanke5;
import java.util.Scanner;
public class TugasAntrean28 {
    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);

        int kode;
        System.out.println("Kode layanan:\n1\n2\n3\n4");
        System.out.print("Masukkan kode: ");
        kode = fauzi.nextInt();

        switch (kode) {
            case 1:
            System.out.println("Legalisir ijazah");
            System.out.println("Loket A");
                break;
            case 2:
            System.out.println("Surat Keterangan Aktif Kuliah");
            System.out.println("Loket B");
                break;
            case 3:
            System.out.println("Pembayaran UKT");
            System.out.println("Loket C");
                break;
            case 4:
            System.out.println("Pengajuan Cuti Akademik");
            System.out.println("Loket D");
                break;
            default:
            System.out.println("Kode Layanan Salah");
                break;
        }
        fauzi.close();
    }
}
