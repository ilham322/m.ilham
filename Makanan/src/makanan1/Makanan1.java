package Makanan1;

import java.util.Scanner;

public class Makanan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Makanan makanan = new Makanan(0); // Instance Makanan
        do {
            makanan.pilihan();
            System.out.print("Transaksi lagi Ya=1, Tidak=2: ");
        } while (input.nextInt() == 1);
    }
}
