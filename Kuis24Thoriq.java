import java.util.Scanner;

public class Kuis24Thoriq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah pelanggan hari ini: ");
        int n = sc.nextInt();
        int totalBerat = 0;
        int totalBiaya = 0;
        int totBerat = 0;
        int jmlhplnggan = 0;
        int NIM = 30;
        int kapasitas = NIM % 10;
        for (int i = 1; i <= n; i++) {
            System.out.print("Berat cucian pelanggan ke-" + i + " (kg): ");
            int berat = sc.nextInt();

            // Tarif: sampai 3 kg Rp 15000 (flat), lebih dari 3 kg ditambah Rp 4000 per kg kelebihannya
            int biaya;

            if (berat < 1 || berat > 20) {
                System.out.println("Input tidak valid, ulangi.");
            }

            if (berat <= 3) {
                biaya = 15000;
            } else {
                biaya = 15000 + (berat - 3) * 4000;
            }

            totalBiaya += biaya;
            totalBerat += berat;
            System.out.println("  Biaya: Rp " + biaya);
            totBerat += berat;
            jmlhplnggan++;
            if (totBerat >= 20) {
                System.out.println("Kapasitas mesin penuh ssetelah pelanggan ke-" + jmlhplnggan);
                System.out.println("Dilayani                                   :" + jmlhplnggan);
                break;
            }
        }

        double rataBerat = (double)totalBerat / n;
        System.out.println("=== REKAP HARIAN ===");
        System.out.println("Total pemasukan : Rp " + totalBiaya);
        System.out.println("Rata-rata berat : " + rataBerat + " kg");
        sc.close();
    }
}