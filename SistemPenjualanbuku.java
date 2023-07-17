import java.util.ArrayList;
import java.util.Scanner;

class PenjualanBuku {
    private static double modalAwal = 2000000.0;
    private static double modalBerjalan = 2000000.0;
    private static ArrayList<Buku> daftarBuku = new ArrayList<>();
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
                // Menambahkan beberapa buku sebagai contoh
        daftarBuku.add(new BukuFiksi("1984 : oleh George Orwell", 8000, 15000, 10));
        daftarBuku.add(new BukuFiksi("The Alchemist : oleh Paulo Coelho", 15000, 20000, 5));
        daftarBuku.add(new BukuNonFiksi("The Diary of a Young Girl : oleh Anne frank", 10000, 15000, 35));
        daftarBuku.add(new BukuNonFiksi("Thinking, fast and slow : oleh Daniel Kahnemamn", 7000, 12000, 8));
        daftarBuku.add(new Majalah("National Geographic", 10000, 15000, 13, 212));
        daftarBuku.add(new Majalah("The Economist", 5000, 18000, 19, 666));
 
        while (true) {
            System.out.println("*******************************************************************************************");
            System.out.println("Sistem Penjualan Buku");
            System.out.println("By: Gusti Ary Wicaksana, <NIM: 22201216>");
            System.out.println("*******************************************************************************************5");
            System.out.println("Silahkan pilih menu: ");
            System.out.println("1. Tampilkan Laporan Modal");
            System.out.println("2. Tampilkan Stok Buku");
            System.out.println("3. Penjualan Buku");
            System.out.println("4. Pembelian Buku");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
 
            switch (pilihan) {
                case 1:
                    tampilkanLaporanModal();
                    break;
                case 2:
                    tampilkanStokBuku();
                    break;
                case 3:
                    penjualanBuku();
                    break;
                case 4:
                    pembelianBuku();
                    break;
                case 5:
                    System.out.println("Program Selesai");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid");
            }
 
            System.out.println();
        }
    }
 
    private static void tampilkanLaporanModal() {
        System.out.println("===== Laporan Modal =====");
        System.out.println("Modal Awal: " + modalAwal);
        System.out.println("Modal Berjalan: " + modalBerjalan);
    }
 
    private static void tampilkanStokBuku() {
        System.out.println("===== Stok Buku =====");
        for (Buku buku : daftarBuku) {
            buku.tampilkanInfo();
        }
    }
 
    private static void penjualanBuku() {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("===== Penjualan Buku =====");
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan jumlah yang terjual: ");
        int jumlahTerjual = scanner.nextInt();
 
        Buku bukuTerjual = cariBuku(judul);
        if (bukuTerjual != null) {
            double pendapatan = bukuTerjual.getHargaJual() * jumlahTerjual;
            modalBerjalan += pendapatan;
            bukuTerjual.kurangiStok(jumlahTerjual);
            System.out.println("Penjualan berhasil. Pendapatan: " + pendapatan);
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }
 
    private static void pembelianBuku() {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("===== Pembelian Buku =====");
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan jumlah yang dibeli: ");
        int jumlahDibeli = scanner.nextInt();
 
        Buku bukuDibeli = cariBuku(judul);
        if (bukuDibeli != null) {
            double pengeluaran = bukuDibeli.getHargaBeli() * jumlahDibeli;
            if (pengeluaran <= modalBerjalan) {
                modalBerjalan -= pengeluaran;
                bukuDibeli.tambahStok(jumlahDibeli);
                System.out.println("Pembelian berhasil. Pengeluaran: " + pengeluaran);
            } else {
                System.out.println("Modal berjalan tidak mencukupi.");
            }
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }
 
    private static Buku cariBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                return buku;
            }
        }
        return null;
    }
}
