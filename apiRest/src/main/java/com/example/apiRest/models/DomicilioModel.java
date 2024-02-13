package com.example.apiRest.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.*;
@Entity
@Table(name = "domicilios")// nombre de la tabla de la bdd
public class DomicilioModel implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    public Long getId() {
        return id;
    }

    @Column
    private Long cuit;

    public Long getCuit() {
        return cuit;
    }

    public void setCuit(Long cuit) {
        this.cuit = cuit;
    }

    @Column
    private Long cuit_representado;

    public Long getCuit_representado() {
        return cuit_representado;
    }

    public void setCuit_representado(Long cuit_representado) {
        this.cuit_representado = cuit_representado;
    }

    @Column
    private Integer partida;

    public Integer getPartida() {
        return partida;
    }

    public void setPartida(Integer partida) {
        this.partida = partida;
    }

    @Column
    private String domicilio;

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio= domicilio;
    }

    @Column
    private Integer superficie_afectada;

    public Integer getSuperficie_afectada() {
        return superficie_afectada;
    }

    public void setSuperficie_afectada(Integer superficie_afectada) {
        this.superficie_afectada = superficie_afectada;
    }

    @Column
    private Integer nro_habilitacion;

    public Integer getNro_habitacion() {
        return nro_habilitacion;
    }

    public void setNro_habitacion(Integer nro_habilitacion) {
        this.nro_habilitacion = nro_habilitacion;
    }

    @Column
    private String fecha_inicio;

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio= fecha_inicio;
    }

    @Column
    private String fecha_cese;

    public String getFecha_cese() {
        return fecha_cese;
    }

    public void setFecha_cese(String fecha_cese) {
        this.fecha_cese= fecha_cese;
    }

    @Column
    private LocalDateTime fecha_operacion;

    public LocalDateTime getFecha_operacion() {
        return fecha_operacion;
    }

    public void setFecha_operacion(LocalDateTime fecha_operacion) {
        this.fecha_operacion= fecha_operacion;
    }

    @Column
    private String movimiento;

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento= movimiento;
    }

    @Column
    private Integer no_aplica;

    public Integer getNo_aplica() {
        return no_aplica;
    }

    public void setNo_aplica(Integer no_aplica) {
        this.no_aplica = no_aplica;
    }

    @Column
    private String delete_at;

    public String getDelete_at() {
        return delete_at;
    }
    
    public void setDelete_at(String delete_at) {
        this.delete_at= delete_at;
    }
    @OneToMany(mappedBy = "domicilioAsociado", fetch = FetchType.LAZY)
    private List<TitularesIngresadosModel> titularesIngresados;
 
    @OneToMany(mappedBy = "domicilioAsociado", fetch = FetchType.LAZY)
    private List<ActividadesIngresadasModel> actividadesIngresadas;
}

