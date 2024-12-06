package UKL;

import java.util.Scanner;

public class Mudah1{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input data dari user
        System.out.print("Masukkan berat paket (kg): ");
        double beratPaket = scanner.nextDouble();
        System.out.print("Masukkan jarak tempuh (km): ");
        double jarakTempuh = scanner.nextDouble();
        System.out.print("Masukkan volume barang (cm³): ");
        double volumeBarang = scanner.nextDouble();

        // Hitung biaya pengiriman
        double biayaPengiriman = hitungBiayaPengiriman(beratPaket, jarakTempuh, volumeBarang);

        // Tampilkan hasil
        System.out.println("Total biaya pengiriman: Rp " + biayaPengiriman);

        scanner.close();
    }

    // Fungsi untuk menghitung biaya pengiriman
    public static double hitungBiayaPengiriman(double beratPaket, double jarakTempuh, double volumeBarang) {

        // Hitung biaya dasar berdasarkan jarak
        double biayaDasar = 0;
        if (jarakTempuh <= 10) {
            biayaDasar = beratPaket * 4250;
        } else {
            biayaDasar = beratPaket * 6000;
        } 

        // Tambah biaya volume jika volume melebihi 100 cm³
        if (volumeBarang > 100) {
            biayaDasar += 50000;
        } if (volumeBarang > 200) {
            biayaDasar += 100000;
        }

        return biayaDasar;
    }
}
