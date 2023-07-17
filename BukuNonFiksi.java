class BukuNonFiksi extends Buku {
    public BukuNonFiksi(String judul, double hargaBeli, double hargaJual, int stok) {
        super(judul, hargaBeli, hargaJual, stok);
    }
 
    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis: Buku Non-Fiksi");
        System.out.println("Judul: " + judul);
        System.out.println("Stok: " + stok);
    }
}
