public abstract class Buku {
    protected String judul;
    protected int hargaBeli;
    protected int hargaJual;
    protected int jumlahStok;
    
    public Buku(String judul, int hargaBeli, int hargaJual, int jumlahStok) {
        this.judul = judul;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
        this.jumlahStok = jumlahStok;
    }
    
    public abstract void tambahStok(int jumlah);
    public abstract void kurangStok(int jumlah);
    public abstract void tampilkanInfo();
}
