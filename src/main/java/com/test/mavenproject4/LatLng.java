/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.mavenproject4;

/**
 *
 * @author jezzvega
 */
public class LatLng {
    
    private final double lat;
    private final double lng;

    public LatLng(Double lat, Double lng) {
        this.lat = lat;
        this.lng = lng;
    }
    
    public double distanceTo(double lat, double lng){
        
        double theta = this.lng - lng;
        double dist = Math.sin(deg2rad(this.lat)) * Math.sin(deg2rad(lat)) + Math.cos(deg2rad(this.lat)) * Math.cos(deg2rad(lat)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        
        dist = dist * 1.609344;
        
        return (dist);
        
    }
    
    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    /*::  This function converts decimal degrees to radians             :*/
    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private double deg2rad(double deg) {
      return (deg * Math.PI / 180.0);
    }

    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    /*::  This function converts radians to decimal degrees             :*/
    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private double rad2deg(double rad) {
      return (rad * 180.0 / Math.PI);
    }
    
}
