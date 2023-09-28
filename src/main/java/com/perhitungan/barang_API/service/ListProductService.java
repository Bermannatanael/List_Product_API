package com.perhitungan.barang_API.service;

import com.perhitungan.barang_API.model.Product;
import com.perhitungan.barang_API.model.response.ResponseList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListProductService {
    public ResponseList<Product> listProduct(){

        ResponseList<Product> responseList = new ResponseList();

        responseList.setStatus("Berhasil");
        responseList.setErrorcode("000000");
        responseList.setErrrormesage("Berhasil mendapatkan list product");

        Product product = new Product();
        Product product1 = new Product();
        product1.setNamaProduct("Laptop");
        product1.setHarga(2000000);

        Product product2 = new Product();
        product2.setNamaProduct("Iphone");
        product2.setHarga(22000000);

        Product product3 = new Product();
        product3.setNamaProduct("Pisang Goreng");
        product3.setHarga(15000);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        responseList.setData(products);

        return responseList;
    }
}
