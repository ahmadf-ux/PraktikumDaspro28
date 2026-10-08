package  petemuanke2;
import java.util.Scanner;

public class Segitiga28 {

    public static void main(String[] args){

       try (Scanner sc = new Scanner(System.in);){

        int alas, tinggi;
        float luas;

        System.out.print("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.print("Masukkan tinggi: ");
        tinggi = sc.nextInt();

        luas = alas * tinggi / 2;
        System.out.println("Luas segitiga: " + luas);

        }
    }
}
