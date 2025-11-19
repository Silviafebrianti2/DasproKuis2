// NAMA : SILVIA FEBRIANTI CAHYANI
// NIM : 254107060014
// KELAS : SIB 1A
// SOAL KE-3
import java.util.Scanner;

public class Soal326 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Membuat array 2D 5 baris × 6 kolom
        char[][] kursi = new char[5][6];

        // Inisialisasi kursi dengan 'O' (kosong)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                kursi[i][j] = 'O';
            }
        }

        int pilihan;

        do {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Tampilkan denah kursi");
            System.out.println("2. Pesan kursi");
            System.out.println("3. Batalkan pemesanan kursi");
            System.out.println("4. Hitung jumlah kursi kosong dan terisi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {

                // Menampilkan denah kursi
                case 1:
                    System.out.println("\n--- Denah Kursi ---");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print(kursi[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                // Pesan kursi
                case 2:
                    System.out.print("Masukkan baris (0-4): ");
                    int baris = sc.nextInt();
                    System.out.print("Masukkan kolom (0-5): ");
                    int kolom = sc.nextInt();

                    if (kursi[baris][kolom] == 'O') {
                        kursi[baris][kolom] = 'X';
                        System.out.println("Kursi berhasil dipesan!");
                    } else {
                        System.out.println("Kursi sudah terisi!");
                    }
                    break;

                // Batalkan pemesanan
                case 3:
                    System.out.print("Masukkan baris (0-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (0-5): ");
                    kolom = sc.nextInt();

                    if (kursi[baris][kolom] == 'X') {
                        kursi[baris][kolom] = 'O';
                        System.out.println("Pemesanan berhasil dibatalkan.");
                    } else {
                        System.out.println("Kursi memang sudah kosong!");
                    }
                    break;

                // Hitung jumlah kursi kosong & terisi
                case 4:
                    int kosong = 0, terisi = 0;
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 6; j++) {
                            if (kursi[i][j] == 'O') kosong++;
                            else terisi++;
                        }
                    }
                    System.out.println("Jumlah kursi kosong : " + kosong);
                    System.out.println("Jumlah kursi terisi : " + terisi);
                    break;

                // Keluar
                case 5:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
                // menu muncul terus sampai user pilih 5
        } while (pilihan != 5); 
    }
}
