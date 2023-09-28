package com.perhitungan.barang_API.service;

import com.perhitungan.barang_API.model.ListPesanan;
import com.perhitungan.barang_API.model.TotalHarga;
import com.perhitungan.barang_API.model.response.ResponseListService;
import org.springframework.stereotype.Service;

@Service
public class ListPesananService {
    public ResponseListService<TotalHarga> listPesan(ListPesanan listPesanan){
        ResponseListService<TotalHarga> responseListService = new ResponseListService<>();

        responseListService.setStatus("Berhasil");
        responseListService.setErrorCode("000000");
        responseListService.setErrrorMesage("Berhasil mendghitung harga pesanan");

        TotalHarga totalHarga = new TotalHarga();
        int totalhargapesanan = 0;

        for(int i = 0; i < listPesanan.getListPesanan().size(); i++){
            int hargaPesanan = listPesanan.getListPesanan().get(i).getHarga() * listPesanan.getListPesanan().get(i).getJumlah();
            totalhargapesanan += hargaPesanan;
        }

        totalHarga.setTotalHarga(totalhargapesanan);

        responseListService.setData(totalHarga);


        return responseListService;

    }
}
