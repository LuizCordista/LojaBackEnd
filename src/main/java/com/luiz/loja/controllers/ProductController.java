package com.luiz.loja.controllers;

import com.luiz.loja.dtos.ProductRequestDTO;
import com.luiz.loja.dtos.ProductResponseDTO;
import com.luiz.loja.objects.Product;
import org.springframework.beans.factory.annotation.Autowired;
import com.luiz.loja.repos.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveProduct(@RequestBody ProductRequestDTO data) {
        Product productData = new Product(data);
        productRepository.save(productData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ProductResponseDTO> getAllProducts() {
        List<ProductResponseDTO> productsList = productRepository.findAll().stream().map(ProductResponseDTO::new).toList();
        return productsList;
    }


}
