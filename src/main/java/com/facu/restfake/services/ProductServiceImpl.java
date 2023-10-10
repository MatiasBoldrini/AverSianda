package com.facu.restfake.services;


import com.facu.restfake.entities.Product;
import com.facu.restfake.repositories.BaseRepository;
import com.facu.restfake.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProductServiceImpl  extends BaseServiceImpl<Product, Long> implements ProductoService {

    @Autowired
    private ProductoRepository productoRepositoryRepository;

    public ProductServiceImpl(BaseRepository<Product, Long> baseRepository, ProductoRepository productoRepositoryRepository) {
        super(baseRepository);
        this.productoRepositoryRepository = productoRepositoryRepository;
    }

    @Override
    public List<Product> busquedaPrecioMayorA (Double precioMinimo) throws Exception {
        try {
            List<Product> productos = productoRepositoryRepository.buscarPorPrecioMayorA(precioMinimo);
            return productos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Product> busquedaPrecioMayorA1(Double precioMinimo) throws Exception {
        try {
            List<Product> productos = productoRepositoryRepository.buscarPorPrecioMayorA1 (precioMinimo);
            return productos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Override
    public List<Product> buscarPorPrecioEntre(Double precioMinimo, Double precioMaximo) throws Exception {
        try {
            List<Product> productos = productoRepositoryRepository.buscarPorPrecioEntre (precioMinimo, precioMaximo);
            return productos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Override
    public List<Product> buscarPorPrecioEntre1(Double precioMinimo, Double precioMaximo) throws Exception {
        try {
            List<Product> productos = productoRepositoryRepository.buscarPorPrecioEntre1 (precioMinimo, precioMaximo);
            return productos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
