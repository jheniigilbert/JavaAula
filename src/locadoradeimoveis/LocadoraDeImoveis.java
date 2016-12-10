package locadoradeimoveis;

import models.Ap;
import banco.LocadoraImoveisBanco;
import models.Imovel;
import javax.swing.JOptionPane;

public class LocadoraDeImoveis {
    
    

    public void testeExmeploAplicado() {

    }

    public static void CadastrarImoveis() {
        String cd = JOptionPane.showInputDialog("Informe o Codigo do Imovel");

        String QunatComodos = JOptionPane.showInputDialog("Informe a quantidade de comodos do Imovel");
        int qc = Integer.parseInt(QunatComodos);

        String QunatGaragem = JOptionPane.showInputDialog("Informe a quantidade vagas de garagem do Imovel");
        int qg = Integer.parseInt(QunatGaragem);

        String QunatBanheiros = JOptionPane.showInputDialog("Informe a quantidade de Banheiros do Imovel");
        int qb = Integer.parseInt(QunatBanheiros);

        String QuantM = JOptionPane.showInputDialog("Informe a quantidade de Metros quadrados do Imovel");
        int qm = Integer.parseInt(QuantM);

        String Pr = JOptionPane.showInputDialog("Informe a quantidade de Metros quadrados do Imovel");
        int pp = Integer.parseInt(Pr);

        Imovel im = new Imovel();
        im.setCod(cd);
        im.setComodos(qc);
        im.setBanheiros(qb);
        im.setGaragen(qg);
        im.setMetros4(qm);
        im.setPreco(pp);

        LocadoraImoveisBanco.getImovel().add(im);

    }

    public static void AlterarImoveis(String Cod) {
        for (Imovel x : LocadoraImoveisBanco.getImovel()) {
            if (x.getCod().equals(Cod)) {

                if (x != null) {

                    String QunatComodos = JOptionPane.showInputDialog("Informe a quantidade de comodos do Imovel");
                    int qc = Integer.parseInt(QunatComodos);

                    String QunatGaragem = JOptionPane.showInputDialog("Informe a quantidade vagas de garagem do Imovel");
                    int qg = Integer.parseInt(QunatGaragem);

                    String QunatBanheiros = JOptionPane.showInputDialog("Informe a quantidade de Banheiros do Imovel");
                    int qb = Integer.parseInt(QunatBanheiros);

                    String QuantM = JOptionPane.showInputDialog("Informe a quantidade de Metros quadrados do Imovel");
                    int qm = Integer.parseInt(QuantM);

                    String Pr = JOptionPane.showInputDialog("Informe o Preço da mensalidade do imovel");
                    int pp = Integer.parseInt(Pr);

                    x.setComodos(qc);
                    x.setBanheiros(qb);
                    x.setGaragen(qg);
                    x.setMetros4(qm);
                    x.setPreco(pp);

                }

            }
        }

    }

    public static void ExibirImoveis(String codigo) {
        for (Imovel xq : LocadoraImoveisBanco.getImovel()) {
            if (xq.getCod().equals(codigo)) {

                if (xq != null) {
                    JOptionPane.showMessageDialog(null, "Codigo:" + xq.getCod() + "\nComodos:" + xq.getComodos() + "\nBanheiros:" + xq.getBanheiros() + "\nGaragem:" + xq.getGaragen() + "\nMetros Quadrados:" + xq.getMetros4() + "\nPreçp:" + xq.getPreco());
                }
            }
        }
    }

    public static void ExcluirImoveis(String codi) {
        for (Imovel aa : LocadoraImoveisBanco.getImovel()) {
            if (aa.getCod().equals(codi)) {

                LocadoraImoveisBanco.getImovel().remove(aa);
                JOptionPane.showMessageDialog(null, "Imovel removido com Sucesso!");

            }
        }
    }

    public static void GerenciarImoveis() {
        double loop = 52678;
        while (loop != 0) {

            String cs = JOptionPane.showInputDialog("Escolha de qual a opçao  \n -1.Cadastrar imovel \n-2.Alterar imovel \n-3.Exibir imovel\n-4.Ecluir imovel\n-0.Sair");
            int xp = Integer.parseInt(cs);

            switch (xp) {

                case 1:
                    CadastrarImoveis();
                    break;
                case 2:
                    String x = JOptionPane.showInputDialog("Informe o Codigo do imovel");

                    AlterarImoveis(x);
                    break;
                case 3://EXIBIR IMOVEIS 
                    String xis = JOptionPane.showInputDialog("Informe o Codigo do imovel");

                    ExibirImoveis(xis);
                    break;
                case 4://ExcluirImoveis;
                    String codimovel = JOptionPane.showInputDialog("Informe o Codigo do imovel");
                    ExcluirImoveis(codimovel);

                    break;
                case 0:
                    loop = 0;
                    break;

            }
        }
    }

    public static void main(String[] args) {

        LocadoraImoveisBanco.InicilizarBanco();

        double loop = 5678;
        while (loop != 0) {

            String c = JOptionPane.showInputDialog("Escolha de qual a opçao  \n -1. Verificar Imoveis \n-2.Gerenciar Imovel \n-3.Fechar Contratos \n-4.Exibir Contratod \n-0.Sair");
            int x = Integer.parseInt(c);

            switch (x) {

                case 1:/// Locar imovel --------------------------------

                    for (Imovel imovel : LocadoraImoveisBanco.getImovel()) {

                        JOptionPane.showMessageDialog(null, "Codigo:" + imovel.getCod() + "\nComodos:" + imovel.getComodos() + "\nBanheiros:" + imovel.getBanheiros() + "\nGaragem:" + imovel.getGaragen() + "\nMetros Quadrados:" + imovel.getMetros4() + "\nPreçp:" + imovel.getPreco());

                    }
                    break;

                case 2://Gerenciar  Imovel ----------------------------------
                    GerenciarImoveis();
                    break;

                case 3://Realizar contratos  ----------------------------------
                    // RealizarContrato();
                    JOptionPane.showMessageDialog(null, "Ainda nao implementado");

                    break;

                case 4: //Exibir contratos---------------------------------------
                    JOptionPane.showMessageDialog(null, "Ainda nao implementado");
                    break;

                case 0:///SAIR------------------------------

                    JOptionPane.showMessageDialog(null, "\n-------<3---\n ");
                    loop = 0;

                    break;

            }

        }

    }

}
