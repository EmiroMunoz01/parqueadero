package com.parqueadero.parqueadero.servicio.FacturaService;

import com.parqueadero.parqueadero.modelo.Factura;

import java.util.List;

public class FacturaService implements IFactura {
    @Override
    public List<Factura> getAllFactura() {
        return List.of();
    }

    @Override
    public Factura getFacturaById(Integer idFactura) {
        return null;
    }

    @Override
    public void setFactura(Factura factura) {

    }

    @Override
    public Factura deleteFacturaById(Integer idFactura) {
        return null;
    }

    @Override
    public void updateFactura(Integer idFactura) {

    }

    @Override
    public Factura createFactura(Integer idFactura) {
        return null;
    }
}
