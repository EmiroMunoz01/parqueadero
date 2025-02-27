package com.parqueadero.parqueadero.servicio.VehiculoService;

import com.parqueadero.parqueadero.modelo.Factura;
import com.parqueadero.parqueadero.modelo.Vehiculo;

import java.util.List;

public interface IVehiculo {

    public List<Vehiculo> getAllVehiculo();

    public Vehiculo getVehiculoById(Integer idVehiculo);

    public void setVehiculo(Vehiculo vehiculo);

    public Vehiculo deleteVehiculoById(Integer idVehiculo);

    public void updateVehiculo(Integer idVehiculo);

    public Vehiculo createVehiculo(Integer idVehiculo);
}
