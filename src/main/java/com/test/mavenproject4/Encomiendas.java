/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.mavenproject4;

/**
 *
 * @author jezzvega
 */
public class Encomiendas {
  /*tis an indent file*/
    /*esta es otra prueba*/
    private int id;
    private String envia;
    private String recibe;
    private int prioridad;
    private float peso_paquete;
    private String fecha_entrada;
    private int estado;
    private float costo;
    private String descripcion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnvia() {
        return envia;
    }

    public void setEnvia(String envia) {
        this.envia = envia;
    }

    public String getRecibe() {
        return recibe;
    }

    public void setRecibe(String recibe) {
        this.recibe = recibe;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public float getPeso_paquete() {
        return peso_paquete;
    }

    public void setPeso_paquete(float peso_paquete) {
        this.peso_paquete = peso_paquete;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getPrioridadText(){
        return ((this.prioridad == 0) ? "Baja" : "Alta");
    }
    
}
