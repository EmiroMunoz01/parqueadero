package com.parqueadero.parqueadero.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;



    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cedula_cliente;


    @Column(name = "placa")
    private String placa;


    @Column(name = "fecha_factura")
    private Date fecha_factura;


    @Column(name = "fecha_entrada")
    private Date fecha_entrada;


    @Column(name = "fecha_salida")
    private Date fecha_salida;


    @Column(name = "costo")
    private Double costo;

}
