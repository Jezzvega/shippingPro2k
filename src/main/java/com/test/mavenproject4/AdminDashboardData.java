package com.test.mavenproject4;

import java.util.ArrayList;

public class AdminDashboardData {
    
    private Double ingreso;
    private int recibidas;
    private int en_camino;
    private int entregadas;
    private int vehiculos_disponibles;
    private int vehiculos_totales;
    private ArrayList<Encomiendas> ultimasEncomiendas;

    public Double getIngreso() {
        return ingreso;
    }

    public void setIngreso(Double ingreso) {
        this.ingreso = ingreso;
    }

    public int getRecibidas() {
        return recibidas;
    }

    public void setRecibidas(int recibidas) {
        this.recibidas = recibidas;
    }

    public int getEn_camino() {
        return en_camino;
    }

    public void setEn_camino(int en_camino) {
        this.en_camino = en_camino;
    }

    public int getEntregadas() {
        return entregadas;
    }

    public void setEntregadas(int entregadas) {
        this.entregadas = entregadas;
    }

    public int getVehiculos_disponibles() {
        return vehiculos_disponibles;
    }

    public void setVehiculos_disponibles(int vehiculos_disponibles) {
        this.vehiculos_disponibles = vehiculos_disponibles;
    }

    public int getVehiculos_totales() {
        return vehiculos_totales;
    }

    public void setVehiculos_totales(int vehiculos_totales) {
        this.vehiculos_totales = vehiculos_totales;
    }

    public ArrayList<Encomiendas> getUltimasEncomiendas() {
        return ultimasEncomiendas;
    }

    public void setUltimasEncomiendas(ArrayList<Encomiendas> ultimasEncomiendas) {
        this.ultimasEncomiendas = ultimasEncomiendas;
    }
    
}
