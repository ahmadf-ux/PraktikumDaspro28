import java.util.Scanner;

public class LuasTanahPakTono28 {

    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in)) {

        int lebar, panjang, diameterKolamIkan, sisiTaman, luasTanahAwal, luasTaman;
        double jariJariKolamIkan, luasKolamIkan, luasTanahAkhir;

        System.out.print("masukkan lebar tanah: ");
        lebar = scn.nextInt();
        System.out.print("masukkan panjang tanah: ");
        panjang = scn.nextInt();
        System.out.print("masukkan diameter kolam ikan: ");
        diameterKolamIkan = scn.nextInt();
        System.out.print("masukkan sisi taman: ");
        sisiTaman = scn.nextInt();

        jariJariKolamIkan = diameterKolamIkan / 2.0;
        luasTanahAwal = lebar * panjang;
        luasKolamIkan = Math.PI * jariJariKolamIkan * jariJariKolamIkan;
        luasTaman = sisiTaman * sisiTaman;
        luasTanahAkhir = (luasTanahAwal - (luasKolamIkan + luasTaman));
        
        System.out.println("Luas tanah awal: " + luasTanahAwal);
        System.out.println("Luas kolam ikan: " + luasKolamIkan);
        System.out.println("Luas taman: " + luasTaman);
        System.out.println("Luas tanah akhir: " + luasTanahAkhir);
        }
    }
}