class BukuFiksi extends Buku {
    public BukuFiksi(String judul, double hargaBeli, double hargaJual, int stok) {
        super(judul, hargaBeli, hargaJual, stok);
    }
 
    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis: Buku Fiksi");
        System.out.println("Judul: " + judul);
        System.out.println("Stok: " + stok);
    }
}
