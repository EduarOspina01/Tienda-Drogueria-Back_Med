package com.apiback_med.api_medellin.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiback_med.api_medellin.model.Detalle_VentaModel;

public interface IDetalle_VentaDAO extends JpaRepository<Detalle_VentaModel, Integer> {

}
