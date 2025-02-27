package com.parqueadero.parqueadero.servicio.ClienteService;

import com.parqueadero.parqueadero.modelo.Cliente;

import java.util.List;

public interface ICliente {

    public List<Cliente> getAllCliente();

    public Cliente getClienteById(Integer idCliente);

    public void setCliente(Cliente cliente);

    public Cliente deleteClienteById(Integer idCliente);

    public void updateCliente(Integer idCliente);

    public Cliente createCliente(Integer idCliente);
}
