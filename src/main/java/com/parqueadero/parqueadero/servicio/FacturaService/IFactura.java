package com.parqueadero.parqueadero.servicio.FacturaService;

import com.parqueadero.parqueadero.modelo.Cliente;
import com.parqueadero.parqueadero.modelo.Factura;

import java.util.List;

public interface IFactura {

    public List<Factura> getAllFactura();

    public Factura getFacturaById(Integer idFactura);

    public void setFactura(Factura factura);

    public Factura deleteFacturaById(Integer idFactura);

    public void updateFactura(Integer idFactura);

    public Factura createFactura(Integer idFactura);
}
