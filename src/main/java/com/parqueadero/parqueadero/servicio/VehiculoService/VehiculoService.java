package com.parqueadero.parqueadero.servicio.VehiculoService;

import com.parqueadero.parqueadero.modelo.Vehiculo;

import java.util.List;

public class VehiculoService implements IVehiculo {
    @Override
    public List<Vehiculo> getAllVehiculo() {
        return List.of();
    }

    @Override
    public Vehiculo getVehiculoById(Integer idVehiculo) {
        return null;
    }

    @Override
    public void setVehiculo(Vehiculo vehiculo) {

    }

    @Override
    public Vehiculo deleteVehiculoById(Integer idVehiculo) {
        return null;
    }

    @Override
    public void updateVehiculo(Integer idVehiculo) {

    }

    @Override
    public Vehiculo createVehiculo(Integer idVehiculo) {
        return null;
    }
}
