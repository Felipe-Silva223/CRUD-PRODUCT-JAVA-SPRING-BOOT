package com.Envision.productAPI.Repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Envision.productAPI.Model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository <ProductModel, UUID> {
    

}
