package com.parqueadero.parqueadero.servicio.ClienteService;

import com.parqueadero.parqueadero.modelo.Cliente;

import java.util.List;

public class ClienteService implements ICliente{
    @Override
    public List<Cliente> getAllCliente() {
        return List.of();
    }

    @Override
    public Cliente getClienteById(Integer idCliente) {
        return null;
    }

    @Override
    public void setCliente(Cliente cliente) {

    }

    @Override
    public Cliente deleteClienteById(Integer idCliente) {
        return null;
    }

    @Override
    public void updateCliente(Integer idCliente) {

    }

    @Override
    public Cliente createCliente(Integer idCliente) {
        return null;
    }
}
