package com.example.app.gymapi.bean.clientes;

import com.example.app.gymapi.abstracts.AbstractBean;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class Cliente extends AbstractBean {
    private String nombre;
    private String cedula;
    private String ruc;
    private String telefono;
    private String email;
    private String direccion;
    private LocalDate fecha_registro;
}
