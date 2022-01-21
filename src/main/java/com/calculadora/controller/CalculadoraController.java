/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calculadora.controller;

/**
 *
 * @author Victor
 */
public class CalculadoraController {
    
    private Double valor = 0.00;
    private String ope;
    
    public void ralizaOperacoes(String ope, Double valor){
        if(ope == "soma"){
            if(this.valor.equals(0.00)){
                this.valor = valor;
                this.ope = "soma";
            }else{
                this.valor += valor;
                this.ope = "soma";
            }   
        }
        else if(ope == "sub"){
            if(this.valor.equals(0.00)){
                this.valor = valor;
                this.ope = "sub";
            }else{
                this.valor -= valor;
                this.ope = "sub";
            }  
        }
        else if (ope =="mult"){
            if(this.valor.equals(0.00)){
                this.valor = valor;
                this.ope = "mult";
            }else{
                this.valor *= valor;
                this.ope = "mult";
            }  
        }
        else if (ope == "divi"){
            if(this.valor.equals(0.00)){
                this.valor = valor;
                 this.ope = "divi";
            }else{
                this.valor /= valor;
                this.ope = "divi";
            }  
        }
              
    }
    
    
    public String getValor(){
        String str = Double.toString(this.valor);
        return str;
    }
    
    public String getOpe(){
        return this.ope;
    }
    
    public void setOpe(String ope){
        this.ope = ope;
    }
    
    public void zerar(){
        this.valor = 0.00;
    }
    
}
