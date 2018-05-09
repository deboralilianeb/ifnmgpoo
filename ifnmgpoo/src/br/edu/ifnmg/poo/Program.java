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
public class Program {
    
    public static void main (String[] args){
    
            Pessoa p1 = new Pessoa();      /*Dois metodos com mesmo nome, sobrecarga*/
            Pessoa p2 = new Pessoa(1,"Debora"); 
            
            PessoaFisica pf1 = new PessoaFisica(123456l, "Debora Liliane" , "ABCDS1");
            
            System.out.println(pf1);
            
            System.out.println(p2);
            System.out.println(p1);
            
            System.out.println(p1.getNome());
            System.out.println(p1.getCpf());
            
            System.out.println(p2.getCpf());
            System.out.println(p2.getNome());
            
            
            
    } 
}   

    

