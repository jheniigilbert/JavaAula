package banco;

import java.util.ArrayList;
import java.util.List;
import models.*;

public class LocadoraImoveisBanco {
 
    private static List<Imovel> Imovel;
    private static List<Contrato> contrato;
    private static List<Usuarios> usuarios;
    
    public static List<Imovel> getImovel() {
        return Imovel;
    }
    
    public static List<Contrato> getContrato() {
        return contrato;
    }
    
    public static List<Usuarios> getUsuarios() {
        return usuarios;
    }
    
    public static void InicilizarBanco(){
        Imovel = new ArrayList<Imovel>();
        contrato= new ArrayList<Contrato>();
        usuarios =new ArrayList<Usuarios>();
    }   
    
}
