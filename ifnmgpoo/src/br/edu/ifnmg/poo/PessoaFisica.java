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
public class PessoaFisica extends Pessoa {
    
    private long cpf;
    
    public PessoaFisica(){
        
        //super (id,nome);
        this.cpf = 1l;
        setNome("Alguem");
        setId("AB123");
        
    }
    
    public PessoaFisica(long cpf, String nome, String id){
       // super (id, nome);
        this.cpf= cpf;
        setNome("Outra Pessoa");
        setId("1234");     
        
    }
    
  
    @Override /*sobrescreve um metodo*/
   public String toString(){
       return super.toString()+"\t"+this.cpf;
   }
    
    
}
