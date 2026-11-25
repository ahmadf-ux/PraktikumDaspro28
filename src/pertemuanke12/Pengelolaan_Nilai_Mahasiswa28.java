package pertemuanke12;
//uji wajib: jumlah nilai mahasiswa = 5 + (28 mod 11) = 11
//uji wajib: salah satu nilai yang diinput = 28 mod 100 = 28 
import java.util.Scanner;
public class Pengelolaan_Nilai_Mahasiswa28 {
    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int mhs = fauzi.nextInt();
        System.out.println("=====================================================");

        System.out.println();
        int[] nilai = new int[mhs];
        int total = 0;
        double rata;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = fauzi.nextInt();
            total += nilai[i];
        }
        System.out.println();
        rata = (double) total / nilai.length;
        int tertinggi = -1;
        int terendah = 100;
        System.out.println("=====================================================");
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];

            String status = (nilai[i] > 51) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i +1) + ": " + nilai[i] + " (" + status + ")"); 
        }
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("Mahasiswa dengan nilai tertinggi: " + tertinggi);
        System.out.println("Mahasiswa dengan nilai terendah: " + terendah);
        System.out.println("Rata-rata nilai dari seluruh mahasiswa yang berjumlah " + mhs + " orang: " + rata);
        fauzi.close();
    }
}
