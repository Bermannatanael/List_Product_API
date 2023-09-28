package com.perhitungan.barang_API.controller;

import com.perhitungan.barang_API.model.ListPesanan;
import com.perhitungan.barang_API.service.ListPesananService;
import com.perhitungan.barang_API.service.ListProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarangController {

    @Autowired
    ListProductService listProduct;

    @Autowired
    ListPesananService listPesananService;

    @GetMapping(value = "/list-product")
    public ResponseEntity<?> getListProduct(){
        return new ResponseEntity<>(listProduct.listProduct(), HttpStatus.OK);
    }

    @PostMapping(value = "/listPesanan")
    public ResponseEntity<?> listPesan(@RequestBody ListPesanan listPesanan){

        return new ResponseEntity<>(listPesananService.listPesan(listPesanan), HttpStatus.OK);
    }

}

