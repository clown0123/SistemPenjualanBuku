public abstract class BukuNonFiksi extends Buku {
    public BukuNonFiksi(String judul, int hargaBeli, int hargaJual, int jumlahStok) {
        super(judul, hargaBeli, hargaJual, jumlahStok);
    }

    @Override
    public void tambahStok(int jumlah) {
        jumlahStok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        jumlahStok -= jumlah;
        if (jumlahStok <= 0) {
            System.out.println("Stok " + judul + " habis.");
        }
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Harga Beli: " + hargaBeli);
        System.out.println("Harga Jual: " + hargaJual);
        System.out.println("Jumlah Stok: " + jumlahStok);
    }
}
