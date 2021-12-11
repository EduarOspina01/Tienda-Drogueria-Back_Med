package com.apiback_med.api_medellin.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiback_med.api_medellin.model.VentasModel;

public interface IVentasDAO extends JpaRepository<VentasModel, Long> {

}
