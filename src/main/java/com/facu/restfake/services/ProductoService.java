package com.facu.restfake.services;


import com.facu.restfake.entities.Product;
import java.util.List;


public interface ProductoService extends BaseService<Product,Long> {

    List<Product> busquedaPrecioMayorA(Double precioMinimo) throws Exception;
    List<Product> busquedaPrecioMayorA1(Double precioMinimo) throws Exception;
    List<Product> buscarPorPrecioEntre(Double precioMinimo, Double precioMaximo) throws Exception;
    List<Product> buscarPorPrecioEntre1(Double precioMinimo, Double precioMaximo) throws Exception;
}


