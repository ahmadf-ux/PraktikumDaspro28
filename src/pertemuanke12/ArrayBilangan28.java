package pertemuanke12;
//uji wajib tambahan:  bil[0] = 28, bil[1] = 36, bil[2] = -1, bil[3] = 33
        
import java.util.Arrays;
public class ArrayBilangan28 {

    public static void main(String[] args) {
        int bil[] = {28, 36, -1, 33};
        // bil[0] = 5;
        // bil[1] = 13;
        // bil[2] = -7;
        // bil[3] = 17;

        // bil[0] = 28;
        // bil[1] = 36;
        // bil[2] = -1;
        // bil[3] = 33;

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));
    }
}
