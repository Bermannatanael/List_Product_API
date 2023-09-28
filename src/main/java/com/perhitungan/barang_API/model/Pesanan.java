package com.perhitungan.barang_API.model;

public class Pesanan {
    public String namaProduct;
    public Integer harga;
    public Integer jumlah;
    public TotalHarga totalHarga;

    public String getNamaProduct() {
        return namaProduct;
    }

    public void setNamaProduct(String namaProduct) {
        this.namaProduct = namaProduct;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public TotalHarga getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(TotalHarga totalHarga) {
        this.totalHarga = totalHarga;
    }
}
