package com.parqueadero.parqueadero.modelo;



import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Vehiculo")
@Entity
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Integer id_factura;


    @Column(name = "placa")
    private String placa;


    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;


    @Column(name = "clase_vehiculo")
    @Enumerated(EnumType.STRING)
    private DescripcionVehiculo clase;

   
}