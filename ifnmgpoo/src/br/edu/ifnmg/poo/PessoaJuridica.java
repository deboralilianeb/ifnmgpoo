/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo;

/**
 *
 * @author ifnmg
 */
public class PessoaJuridica extends Pessoa{
    
    private long cnpj;
    
     public void setCnpj(long cnpjf){
        this.cnpj=cnpj;
    }
    
    public long getCnpj(){
        return this.cnpj;
    }
    
    
}
