// NAMA : SILVIA FEBRIANTI CAHYANI
// NIM : 254107060014
// KELAS : SIB 1A
// SOAL KE-1

import java.util.Scanner;

public class Soal126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        // Membuat array 1 dimensi
        int[] nilai = new int[n];

        // Input nilai mahasiswa
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
        }

        // Menghitung rata-rata, jumlah lulus dan tidak lulus
        int total = 0;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i < n; i++) {
            total += nilai[i];
            if (nilai[i] >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        double rataRata = (double) total / n;

        // Menampilkan hasil
        System.out.println("\n--- HASIL ---");

        System.out.println("Seluruh nilai yang diinput:");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println("\nRata-rata nilai: " + rataRata);
        System.out.println("Jumlah mahasiswa lulus     : " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
        
    }
}
