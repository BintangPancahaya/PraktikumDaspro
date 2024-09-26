import java.util.Scanner;
public class PemilihanHariDenganIf05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka (1 - 7): ");
        byte angka = sc.nextByte();

        if (angka >= 1 && angka <=5)
        {
            System.out.println("Weekday");
        }
        else if (angka >= 6 && angka <= 7)
        {
            System.out.println("Weekend");
        }
        else
        {
            System.out.println("Invalid Number");
        }
    }
}
