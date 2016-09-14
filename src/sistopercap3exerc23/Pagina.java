/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistopercap3exerc23;

/**
 *
 * @author Donato
 */
public class Pagina  {//cria a classe Pagina com dois atributos nome e bits
    private String nome;
    private int bits;
    
    public Pagina (String nome, int bits){
       //super();
       this.nome=nome;
       this.bits=bits;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the bist
     */
    public int getBist() {
        return bits;
    }

    /**
     * @param bist the bist to set
     */
    public void setBist(int bist) {
        this.bits = bist;
    }
    
}
