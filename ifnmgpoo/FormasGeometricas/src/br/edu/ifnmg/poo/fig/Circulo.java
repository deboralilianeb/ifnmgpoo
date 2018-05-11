/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.fig;

/**
 *
 * @author ifnmg
 */
public class Circulo extends FiguraGeometrica{
    
    private Double raio;
    
    public Circulo(){
        raio=0.0;
    }
    
    @Override
    public Double CalcularPerimetro(){
       return (Math.PI*raio)*2;
       }
    
    public Double CalcularVolume(){
        
    }
}
