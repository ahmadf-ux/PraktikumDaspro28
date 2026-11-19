package pertemuanke12;
//uji wajib tambahan: elemen dasar array (B) = 20 + (28 mod 60) = 48
//elemen pada array: {48, 63, 40, 78, 28, 53}
import java.util.Arrays;

public class SortNilai28 {

    public static void main(String[] args) {
        // int[] nilai = {78, 65, 90, 55, 88, 72};
        int[] nilai = {48, 63, 40, 78, 28, 53};

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nilai));
    }
}
