package models;
import javax.swing.JOptionPane;


public  class Usuarios  {
    private int Cod;
    private String Nome;
    private int CPF;
    private int bdate;
    private String Login;
    private String Senha;

    public int getCod() {
        return Cod;
    }


    public String getNome() {
        return Nome;
    }

 
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
   public int getBdate() {
        return bdate;
    }

    public void setBdate(int bdate) {
        this.bdate = bdate;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }
    
    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
}
