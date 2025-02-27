package com.parqueadero.parqueadero.repositorio;

import com.parqueadero.parqueadero.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
