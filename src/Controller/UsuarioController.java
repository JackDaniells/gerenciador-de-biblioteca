/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entidades.Sessao;
import Entidades.Usuario;
import Enumeradores.EventoBotao;
import Framework.Seguranca;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import model.UsuarioModel;

/**
 *
 * @author Rolando
 */
public class UsuarioController {

    UsuarioModel _mdlUsuario = new UsuarioModel();
    Seguranca seg;

    public UsuarioController() {

    }

    public UsuarioController(Sessao p_sessao) {
        p_sessao.setTransacao("USUARIO");
        seg = new Seguranca(p_sessao);
    }

    public Usuario ExecutaEventoBotao(Usuario p_usuario, EventoBotao evtBotao) throws Exception {

        if (seg.VerificaAcesso(evtBotao) && ValidaRegrasNegocio(p_usuario, evtBotao)) {
            UsuarioModel _mdlUsuario = new UsuarioModel();
            switch (evtBotao) {
                case Incluir:
                    return _mdlUsuario.Incluir(p_usuario);
                case Alterar:
                    return _mdlUsuario.Alterar(p_usuario);
                case Excluir:
                    if (!_mdlUsuario.Excluir(p_usuario));
                    return null;
                case Consultar:
                    return _mdlUsuario.Consultar(p_usuario, false);
            }
        }

        return p_usuario;
    }

    public ArrayList<Usuario> Listar() {

        ArrayList<Usuario> _lstUsuario = null;
        try {
            _lstUsuario = _mdlUsuario.Listar();
        } catch (Exception e) {
            System.err.println(e);
        }
        return _lstUsuario;
    }

    private boolean ValidaRegrasNegocio(Usuario p_usuario, EventoBotao evtBotao) throws Exception {
        if (p_usuario.getIdUsuario() > 0 && evtBotao == EventoBotao.Incluir) {
            throw new Exception("Não pode incluir um registro com código.");
        } else if (p_usuario.getIdUsuario() == 0 && evtBotao == EventoBotao.Alterar) {
            throw new Exception("Não pode incluir um registro sem código.");
        } else if (p_usuario.getIdUsuario() > 0 && evtBotao == EventoBotao.Incluir) {
            throw new Exception("Não pode consultar um registro sem código.");
        }
        return true;
    }
}
