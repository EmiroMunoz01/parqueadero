package com.parqueadero.parqueadero.repositorio;

import com.parqueadero.parqueadero.modelo.Factura;
import org.springframework.data.repository.CrudRepository;

public interface FacturaRepository extends CrudRepository<Factura, Integer> {
}
