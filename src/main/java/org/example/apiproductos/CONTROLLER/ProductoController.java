package org.example.apiproductos.CONTROLLER;
import org.example.apiproductos.Service.ProductoService;
import org.example.apiproductos.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productoo")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @PostMapping
    public void guardarProducto(@RequestBody Producto producto) {
        productoService.createProducto(producto);
    }

    @PutMapping("/{id}")
    public void actualizarProducto(@PathVariable Long id, @RequestBody Producto producto) {
        productoService.modifyProducto(id, producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoService.deleteProducto(id);
    }
}

