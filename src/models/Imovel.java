package models;

import javax.swing.JOptionPane;

public  class Imovel {

    private String Cod;
    private int Comodos;
    private int Garagen;
    private int Banheiros;
    private int Metros4;
    private int preco;

    public int getComodos() {
        return Comodos;
    }

    public void setComodos(int Comodos) {
        this.Comodos = Comodos;
    }

    public int getGaragen() {
        return Garagen;
    }

    public void setGaragen(int Garagen) {
        this.Garagen = Garagen;
    }

    public int getBanheiros() {
        return Banheiros;
    }

    public void setBanheiros(int Banheiros) {
        this.Banheiros = Banheiros;
    }

    public int getMetros4() {
        return Metros4;
    }

    public void setMetros4(int Metros4) {
        this.Metros4 = Metros4;
    }

    public String getCod() {
        return Cod;
    }

    public void setCod(String Cod) {
        this.Cod = Cod;
    }
    public int getPreco() {
        return preco;
    }
 public void setPreco(int preco) {
        this.preco = preco;
    }
    
 
  
}

