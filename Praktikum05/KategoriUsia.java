import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usia;

        System.out.print("Masukkan usia (angka positif): ");
        
        if (sc.hasNextInt()) {
            usia = sc.nextInt();
            if (usia < 0) {
                System.out.println("Usia tidak boleh negatif.");
                return;
            }
        } else {
            System.out.println("Input tidak valid. Harap masukkan angka positif.");
            return;
        }
        String kategori;
                if (usia <= 12) {
                    kategori = "Anak";
                } else if (usia > 13 && usia <= 19) {
                    kategori = "Remaja";
                }    else if(usia >= 20 && usia <= 64) 
                {
                    kategori = "Dewasa";
                } else {
                    kategori = "Lansia";
                }

        System.out.println("Kategori usia Anda: " + kategori);
    }
}