package com.apiback_med.api_medellin.API;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiback_med.api_medellin.DAO.IClientesDAO;
import com.apiback_med.api_medellin.model.ClientesModel;

@Service
public class ClientesAPI {
	
	@Autowired
	private IClientesDAO clientesDAO;
	
	
	//CREATE UPDATE
	public ClientesModel guardarCliente(ClientesModel clientes) {
		return clientesDAO.save(clientes);
	}
	
	public Optional<ClientesModel> listarClientesPorId(long id){
		return clientesDAO.findById(id);
	}
	
	
	public List<ClientesModel> listarClientes(){
		return clientesDAO.findAll();
	}
	

	public boolean eliminarCliente(Long id) {
		try {
			clientesDAO.deleteById(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
			// TODO: handle exception
		}
	}
}

