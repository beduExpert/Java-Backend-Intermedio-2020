package org.bedu.java.backend.sesion3.reto1.controllers;

import org.bedu.java.backend.sesion3.reto1.model.Producto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ProductoController {

    @PostMapping("/producto")
    public ResponseEntity<Void> creaProducto(@Valid @RequestBody Producto producto){
        return ResponseEntity.ok().build();
    }
}
