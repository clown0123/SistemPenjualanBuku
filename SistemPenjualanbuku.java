public class SistemPenjualanBuku {
    private static int modalAwal;
    private static int modalBerjalan;
    private static ArrayList<Buku> daftarBuku = new ArrayList<>();

    static {
        modalAwal = 7500000;
        modalBerjalan = 3500001;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan = -1;

        System.out.println("Sistem Penjualan Buku");
        System.out.println("Nama : Gusti Ary Wicaksana");
        System.out.println("Nim  : 22201216");

        while (pilihan != 0) {
            tampilkanMenu();
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanLaporan();
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
                case 0:
                    System.out.println("Program Selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    public static void tampilkanMenu() {
        System.out.println("=== Manajemen Penjualan Buku ===");
        System.out.println("1. Tampilkan Laporan");
        System.out.println("2. Tampilkan Stok Buku");
        System.out.println("3. Penjualan Buku");
        System.out.println("4. Pembelian Buku");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan: ");
    }

    public static void tampilkanLaporan() {
        System.out.println("Modal Awal: " + modalAwal);
        System.out.println("Modal Berjalan: " + modalBerjalan);
    }

    public static void tampilkanStokBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku dalam stok.");
        } else {
            for (Buku buku : daftarBuku) {
                buku.tampilkanInfo();
                System.out.println();
            }
        }
    }

    public static void penjualanBuku() {
        // Kode untuk penjualan buku
    }

    public static void pembelianBuku() {
        // Kode untuk pembelian buku
    }

    public static Buku cariBuku(String judul) {
        // Kode untuk mencari buku
        return null;
        // Kode untuk mencari buku
    }
}
