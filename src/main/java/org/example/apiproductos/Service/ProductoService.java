package org.example.apiproductos.Service;


import org.example.apiproductos.entities.Producto;

import java.util.List;

public interface ProductoService {
    public List<Producto> findAll();

    public Producto findById(Long id);

    public void createProducto(Producto producto);

    public void modifyProducto(Long id, Producto producto);

    public void deleteProducto(Long id);
}

