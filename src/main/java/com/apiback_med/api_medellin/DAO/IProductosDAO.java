package com.apiback_med.api_medellin.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiback_med.api_medellin.model.ProductosModel;


public interface IProductosDAO extends JpaRepository<ProductosModel, Long>{

}
