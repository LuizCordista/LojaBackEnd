package com.luiz.loja.dtos;

import com.luiz.loja.objects.Product;

public record ProductResponseDTO(Long id, String name, String description, String imageurl, double price) {
    public ProductResponseDTO(Product product) {
        this(product.getId(), product.getName(), product.getDescription(), product.getImageurl(), product.getPrice());
    }
}