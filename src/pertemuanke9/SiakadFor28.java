import java.util.Scanner;
public class SiakadFor28 {
    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);
        double nilai,tertinggi = 0 , terendah = 100;

        for (int i = 1; i < 10 ; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-" + i + ":");
            nilai = fauzi.nextDouble();
        }
    }
}
