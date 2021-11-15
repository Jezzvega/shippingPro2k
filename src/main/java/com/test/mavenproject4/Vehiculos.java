package com.test.mavenproject4;

public class Vehiculos {
    
    private String id;
    private Double capacidad_carga;
    private int disponibilidad;
    private String descripcion;
    private String nombre_chofer;
    private String ced_chofer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(Double capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre_chofer() {
        return nombre_chofer;
    }

    public void setNombre_chofer(String nombre_chofer) {
        this.nombre_chofer = nombre_chofer;
    }

    public String getCed_chofer() {
        return ced_chofer;
    }

    public void setCed_chofer(String ced_chofer) {
        this.ced_chofer = ced_chofer;
    }
    
    public String getDisponibilidadTxt(){
        return (this.disponibilidad == 0 ? "Disponible" : "Ocupado");
    }
    
}
