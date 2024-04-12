package org.example.apiproductos.ProductoDao;

import org.example.apiproductos.entities.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDAO extends CrudRepository<Producto, Long>
{
}
