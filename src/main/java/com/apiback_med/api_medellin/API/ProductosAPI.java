package com.apiback_med.api_medellin.API;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiback_med.api_medellin.DAO.IProductosDAO;
import com.apiback_med.api_medellin.model.ProductosModel;



@Service
public class ProductosAPI {
	
	@Autowired
	private IProductosDAO productosdao;
	
	//CREATE UPDATE
		public ProductosModel guardarProveedor(ProductosModel productos) {
			return productosdao.save(productos);
		}
		
		public Optional<ProductosModel> listarProveedoresPorId(long id){
			return productosdao.findById(id);
		}
		
		
		public List<ProductosModel> listarProveedores(){
			return productosdao.findAll();
		}
		

		public boolean eliminarProveedor(Long id) {
			try {
				productosdao.deleteById(id);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
				// TODO: handle exception
			}
		}
}
