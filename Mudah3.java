package UKL;


public class Mudah3 {

    public static void main(String[] args) {
        // Deklarasikan variabel untuk menyimpan kata "saya" dan "anak"
        String saya = "saya";
        String anak = "anak";

        // Deklarasikan variabel untuk menyimpan kata "moklet" dan "wikusama"
        String moklet = "moklet";
        String wikusama = "wikusama";

        // Deklarasikan variabel untuk menyimpan kata "angkatan" dan "33"
        String angkatan = "angkatan";
        String tigaTiga = "33";

        // Deklarasikan variabel untuk menyimpan kata "senang"
        String senang = "senang";

        // Looping untuk menampilkan output
        for (int i = 50; i > 1; i--) {
            // Kondisi untuk menampilkan "saya anak moklet"
            if (i % 3 == 0) {
                System.out.println(i + ". " + saya + " " + anak + " " + moklet);
            } else if (i % 2 == 0) { // Kondisi untuk menampilkan "saya anak wikusama"
                System.out.println(i + ". " + saya + " " + anak + " " + wikusama);
            } else { // Kondisi untuk menampilkan "saya angkatan 33"
                System.out.println(i + ". " + saya + " " + angkatan + " " + tigaTiga);
            }
        }

        // Menampilkan "1. saya senang"
        System.out.println("1. " + saya + " " + senang);
    }
}