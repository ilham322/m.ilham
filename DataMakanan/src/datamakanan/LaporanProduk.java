/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class LaporanProduk {
    public static void main(String[] args) {
        // Frame Utama
        JFrame frame = new JFrame("Laporan Produk Toko Makanan");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Panel untuk Judul
        JPanel panelJudul = new JPanel(new GridLayout(2, 1));
        JLabel lblJudul = new JLabel("Laporan Produk Toko Makanan", SwingConstants.CENTER);
        JLabel lblTanggal = new JLabel("Tanggal 21 November 2024", SwingConstants.CENTER);
        panelJudul.add(lblJudul);
        panelJudul.add(lblTanggal);

        // Tabel Data Produk
        String[] columnNames = {"Kode Produk", "Nama Produk", "Harga", "Kategori"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);

        // Menambahkan data contoh ke tabel
        ArrayList<Object[]> dataProduk = new ArrayList<>();
        dataProduk.add(new Object[]{"PRD001", "Chicken Alfredo", 150000, "Main Course"}); 
        dataProduk.add(new Object[]{"PRD002", "Beef Wellington", 350000, "Main Course"}); 
        dataProduk.add(new Object[]{"PRD003", "Grilled Salmon", 200000, "Main Course"}); 
        for (Object[] row : dataProduk) {
            model.addRow(row);
        }

        // Menambahkan Scroll Pane untuk Tabel
        JScrollPane scrollPane = new JScrollPane(table);

        // Panel untuk Total
        JPanel panelTotal = new JPanel(new GridLayout(2, 2));
        panelTotal.add(new JLabel("Total Produk: "));
        panelTotal.add(new JLabel(String.valueOf(dataProduk.size())));
        panelTotal.add(new JLabel("Total Harga: "));
        int totalHarga = dataProduk.stream().mapToInt(row -> (int) row[2]).sum();
        panelTotal.add(new JLabel("Rp " + totalHarga));

        // Menambahkan komponen ke Frame
        frame.add(panelJudul, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panelTotal, BorderLayout.SOUTH);

        // Menampilkan Frame
        frame.setVisible(true);
    }
}
