/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo;

import com.sun.org.apache.xml.internal.serializer.ToStream;

/**
 *
 * @author ifnmg
 */
public class Pessoa {
    
    private String nome;
    private long cpf;
    private String id;
    
    public Pessoa(){
        this.cpf=0l;
        this.nome="sem nome";
    }
    
    public Pessoa(long cpf, String nome){
        this.cpf= cpf;
        this.nome= nome;
    }
    
    public void setNome(String nome){
        this.nome= nome;

    }
    
    public String getNome(){
         return this.nome;
     }
    
    public void setCpf(long cpf){
        this.cpf=cpf;
    }
    
    public long getCpf(){
        return this.cpf;
    }
    
    public void setId(String id){
        this.id= id;

    }
    
    public String getId(){
         return this.id;
     }
   @Override /*sobrescreve um metodo*/
   public String toString(){
       return this.cpf +"\t"+this.nome;
   }
      
    
}


