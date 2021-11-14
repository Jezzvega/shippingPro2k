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
    private String fecha_de_entrada;
    private int estado;
    private float costo;
    private String descripcion;
    private int tiempo_envio;

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

    public String getFecha_de_entrada() {
        return fecha_de_entrada;
    }

    public void setFecha_de_entrada(String fecha_de_entrada) {
        this.fecha_de_entrada = fecha_de_entrada;
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
    
    public String getEstadoText(){
        
        String estadoTxt = "";
        
        switch(estado){
            case 0 -> estadoTxt = "Recibida";
            case 1 -> estadoTxt = "En Camino";
            case 2 -> estadoTxt = "Entregada";
        }
        
        return estadoTxt;
    }

    public int getTiempo_envio() {
        return tiempo_envio;
    }

    public void setTiempo_envio(int tiempo_envio) {
        this.tiempo_envio = tiempo_envio;
    }
    
    public String getTiempoEstTxt(){
        return String.format("%d dia(s)", this.tiempo_envio);
    }
    
}
