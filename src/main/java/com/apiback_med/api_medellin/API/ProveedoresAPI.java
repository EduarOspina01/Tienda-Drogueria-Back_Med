package com.apiback_med.api_medellin.API;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiback_med.api_medellin.DAO.IProveedoresDAO;
import com.apiback_med.api_medellin.model.ProveedoresModel;


@Service
public class ProveedoresAPI {
	
	@Autowired
	private IProveedoresDAO proveedoresDAO;
	
	
	//CREATE UPDATE
	public ProveedoresModel guardarProveedor(ProveedoresModel proveedores) {
		return proveedoresDAO.save(proveedores);
	}
	
	public Optional<ProveedoresModel> listarProveedoresPorId(long id){
		return proveedoresDAO.findById(id);
	}
	
	
	public List<ProveedoresModel> listarProveedores(){
		return proveedoresDAO.findAll();
	}
	

	public boolean eliminarProveedor(Long id) {
		try {
			proveedoresDAO.deleteById(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
			// TODO: handle exception
		}
	}

}
