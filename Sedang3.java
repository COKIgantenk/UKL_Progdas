package UKL;

import java.util.Scanner;

public class Sedang3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[][] soal = {
                {4, '*', 6},
                {6, '/', 2},
                {5, '%', 3},
                {5, '*' ,5},
                {10, '/' ,5},
                {8, '%' ,2}
        };

        int benar = 0, salah = 0, i = 0;

        while (true) {
            if (i == soal.length) {
                System.out.println("Quiz Telah Selesai!");
                System.out.println("True: " + benar + ", False: " + salah);
                break;
            }

            int bil1 = soal[i][0];
            char operator = (char) soal[i][1];
            int bil2 = soal[i][2];

            System.out.print(bil1 + " " + operator + " " + bil2 + " = ");
            int jawabanBenar = hitung(bil1, bil2, operator);
            int jawabanUser = scanner.nextInt();

            if (jawabanUser == jawabanBenar) {
                System.out.println("Jawaban Anda Benar!");
                benar++;
            } else {
                System.out.println("Jawaban Anda Salah, Jawaban Yang Benar Adalah: " + jawabanBenar);
                salah++;
            }

            // Tambahkan bagian untuk menanyakan apakah ingin melanjutkan
            System.out.print("Apakah Kamu Ingin Melanjutkan Soal? (YES/NO) ");
            String lanjut = scanner.next();

            if (lanjut.equalsIgnoreCase("NO")) {
                System.out.println("Terimakasih Telah Bermain!");
                break;
            }

            i++;
        }

        scanner.close();
    }

    static int hitung(int bil1, int bil2, char operator) {
        switch (operator) {
            case '*':
                return bil1 * bil2;
            case '/':
                return bil1 / bil2;
            case '%':
                return bil1 % bil2;
            default:
                return 0;
    }
  }
}