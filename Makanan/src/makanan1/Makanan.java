package Makanan1;

import java.util.Scanner;

public class Makanan {
    int jumlah;
    int harga;

    public Makanan(int harga) {
        this.harga = harga;
        System.out.println("Harga per item: " + harga);
    }

    public void pilihan() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Appetizer");
        System.out.println("2. Main Course");
        System.out.print("Silahkan pilih kategori makanan: ");
        int pilih = input.nextInt();
        
        switch (pilih) {
            case 1 -> appetizer();
            case 2 -> maincourse();
            default -> System.out.println("Pilihan tidak valid.");
        }
    }

    public void appetizer() {
        Scanner input = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("Pilih Menu Appetizer");
        System.out.println("====================");
        System.out.println("1. Bruschetta");
        System.out.println("2. Spring Rolls");
        System.out.println("3. Shrimp Cocktail");
        System.out.print("Masukkan Pilihan: ");
        int pilih1 = input.nextInt();
        
        Makanan menu;
        switch (pilih1) {
            case 1 -> menu = new Makanan(40000);
            case 2 -> menu = new Makanan(30000);
            case 3 -> menu = new Makanan(50000);
            default -> {
                System.out.println("Pilihan tidak valid.");
                return;
            }
        }
        menu.tampil("appetizer");
    }

    public void maincourse() {
        Scanner input = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("Pilih Menu Main Course");
        System.out.println("====================");
        System.out.println("1. Beef Wellington");
        System.out.println("2. Chicken Alfredo");
        System.out.println("3. Grilled Salmon");
        System.out.print("Masukkan Pilihan: ");
        int pilih2 = input.nextInt();
        
        Makanan menu;
        switch (pilih2) {
            case 1 -> menu = new Makanan(300000);
            case 2 -> menu = new Makanan(200000);
            case 3 -> menu = new Makanan(250000);
            default -> {
                System.out.println("Pilihan tidak valid.");
                return;
            }
        }
        menu.tampil("main course");
    }

    void tampil(String type) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah " + type + " yang dibeli: ");
        jumlah = input.nextInt();
        int totalHarga = jumlah * harga;
        System.out.println("Total harga: " + totalHarga);
    }
}
