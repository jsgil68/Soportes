
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN
 */
public class Usuario {
 
    private ArrayList<EmpresaPrincipal> inve = new ArrayList();

    public void setInve(ArrayList<EmpresaPrincipal> inve) {
        this.inve = inve;
    }

    public ArrayList<EmpresaPrincipal> getInve() {
        return inve;
    }

    @Override
    public String toString() {
        return "Usuario{" + "inve=" + inve + '}';
    }

   public boolean confirmarCompra(boolean confcompra){
   
       if (confcompra) {
           System.out.println("Su envio sera enviado por Rappi");
           return  true; 
         
       } else {
           
           return false;
       }
  
   }
    
    public String enviarQueja(String Queja){
  
    
        return Queja;
    }
    public void recibirCatalogo(String catalogo){
        System.out.println("Catalogo recibido");
        System.out.println(catalogo);
    
    }
    
    
}
