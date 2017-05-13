/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notebook;

import Entidades.Usuario;
import View.LoginView;
import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author Rolando
 */
public class NoteBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         java.awt.EventQueue.invokeLater(() -> {
             new LoginView().setVisible(true);
         });
         
         
        // TODO code application logic here
               /*ArrayList<Usuario> _lstUsuarios = new ArrayList<Usuario>();
        Usuario c = new Usuario();
        c.setIdUsuario(1);
        _lstUsuarios.add(c);
        Usuario e = new Usuario();
        c.setIdUsuario(3);
        _lstUsuarios.add(e);
        Usuario f = new Usuario();
        c.setIdUsuario(4);
        _lstUsuarios.add(f);
        Object[] a = new Object[10];
        a = _lstUsuarios.stream().filter((u) -> u.getIdUsuario() == 4).toArray();
        Usuario b = (Usuario)a[0];
        int r = 1;*/
       
        
    }
    
}
