package com.luiz.loja.repos;

import com.luiz.loja.objects.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
