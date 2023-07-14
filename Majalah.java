public abstract class Majalah extends Buku {
    private int nomorEdisi;

    public Majalah(String judul, int hargaBeli, int hargaJual, int jumlahStok, int nomorEdisi) {
        super(judul, hargaBeli, hargaJual, jumlahStok);
        this.nomorEdisi = nomorEdisi;
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
        System.out.println("Nomor Edisi: " + nomorEdisi);
    }
}
