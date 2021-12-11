package com.apiback_med.api_medellin.DAO;
import org.springframework.data.jpa.repository.JpaRepository;

import com.apiback_med.api_medellin.model.UsuariosModel;

public interface IUsuariosDAO extends JpaRepository<UsuariosModel, Long> {
	
}
