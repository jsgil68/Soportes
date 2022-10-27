/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EmpresaPrincipal inv1 = new EmpresaPrincipal(1234 , "pan", 150000, 50);
        EmpresaPrincipal inv2 = new EmpresaPrincipal(1235 , "celular", 400000, 60);
        EmpresaPrincipal inv3 = new EmpresaPrincipal(1236 , "camiseta de CR7", 50000, 70);
        
        Usuario usuario = new Usuario();
        
        usuario.recibirCatalogo(inv1.toString());
        usuario.recibirCatalogo(inv2.toString());
        usuario.recibirCatalogo(inv3.toString());
        
        usuario.confirmarCompra(true);
        
        inv1.recibirQueja(usuario.enviarQueja("El envio se demoro tres dias mas"));
        
    }
    
}
