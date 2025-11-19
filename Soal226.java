// NAMA : SILVIA FEBRIANTI CAHYANI
// NIM : 254107060014
// KELAS : SIB 1A
// SOAL KE-2

import java.util.Scanner;

public class Soal226 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input jumlah kota dan jumlah hari
        System.out.print("Masukkan jumlah kota (k): ");
        int k = sc.nextInt();

        System.out.print("Masukkan jumlah hari (h): ");
        int h = sc.nextInt();

        // Deklarasi array 2D
        double[][] suhu = new double[k][h];

        // Input data suhu setiap kota
        System.out.println("\n=== Input Data Suhu ===");
        for (int i = 0; i < k; i++) {
            System.out.println("Kota " + (i + 1) + ":");
            for (int j = 0; j < h; j++) {
                System.out.print("  Hari " + (j + 1) + " = ");
                suhu[i][j] = sc.nextDouble();
            }
        }

        // Untuk menyimpan rata-rata tiap kota
        double[] rata2 = new double[k];

        System.out.println("\n=== HASIL PER KOTA ===");

        // Hitung max, min, dan rata-rata untuk tiap kota
        for (int i = 0; i < k; i++) {
            double max = suhu[i][0];
            double min = suhu[i][0];
            double total = 0;

            for (int j = 0; j < h; j++) {
                double nilai = suhu[i][j];

                if (nilai > max) max = nilai;
                if (nilai < min) min = nilai;

                total += nilai;
            }

            rata2[i] = total / h;

            System.out.println("\nKota " + (i + 1));
            System.out.println("  Suhu maksimum : " + max);
            System.out.println("  Suhu minimum  : " + min);
            System.out.println("  Rata-rata     : " + rata2[i]);
        }

        // Menentukan kota dengan rata-rata tertinggi dan terendah
        int idxMax = 0, idxMin = 0;

        for (int i = 1; i < k; i++) {
            if (rata2[i] > rata2[idxMax]) {
                idxMax = i;
            }
            if (rata2[i] < rata2[idxMin]) {
                idxMin = i;
            }
        }

        System.out.println("\n=== PERBANDINGAN ANTAR KOTA ===");
        System.out.println("Kota dengan rata-rata suhu tertinggi : Kota " + (idxMax + 1));
        System.out.println("Kota dengan rata-rata suhu terendah  : Kota " + (idxMin + 1));
    }
}
