package models;
import javax.swing.JOptionPane;

public class Contrato extends Imovel{
private int Cod;
private int IdImovel;
private int Dias;
private int ValorTotal;

 
   public void setCod(int Cod) {
        this.Cod = Cod;
    }
    public int getIdImovel() {
        return IdImovel;
    }
    public void setIdImovel(int IdImovel) {
        this.IdImovel = IdImovel;
    }
    public int getDias() {
        return Dias;
    }
    public void setDias(int Dias) {
        this.Dias = Dias;
    }
    public int getValorTotal() {
        return ValorTotal;
    }
    public void setValorTotal(int ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

}
