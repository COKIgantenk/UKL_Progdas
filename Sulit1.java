package UKL;
import java.util.Scanner;





public class Sulit1{

    public static void main(String[] args) {

        // Deklarasi Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Meminta input jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        // Deklarasi array untuk menyimpan nilai ujian
        double[] nilaiUjian = new double[jumlahSiswa];

        // Meminta input nilai ujian dari setiap siswa
        System.out.println("Masukkan nilai ujian setiap siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Nilai siswa ke-" + (i + 1) + ": ");
            nilaiUjian[i] = input.nextDouble();
        }

        // Menghitung total nilai ujian
        double totalNilai = 0;
        for (double nilai : nilaiUjian) {
            totalNilai += nilai;
        }

        // Menghitung rata-rata nilai ujian
        double rataRata = totalNilai / jumlahSiswa;

        // Menampilkan hasil
        System.out.println("Rata-rata nilai ujian: " + rataRata);

        // Menutup Scanner
        input.close();
    }
}

