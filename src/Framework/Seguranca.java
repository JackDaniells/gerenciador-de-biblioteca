/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import Config.UsuarioPadrao;
import Entidades.Sessao;
import Entidades.Usuario;
import Enumeradores.EventoBotao;
import Enumeradores.TipoUsuario;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import model.UsuarioModel;

/**
 *
 * @author Rolando
 */
public class Seguranca {

    private Sessao sessaoUsuario;

    public void setSessaoUsuario(Sessao sessaoUsuario) {
        this.sessaoUsuario = sessaoUsuario;
    }

    public Sessao getSessaoUsuario() {
        return sessaoUsuario;
    }

    public Seguranca() {
    }

    public Seguranca(Sessao sessaoUsuario) {
        this.sessaoUsuario = sessaoUsuario;
    }

    public boolean VerificaAcesso(EventoBotao p_evtBotao) throws Exception {
        /**
         * try { if (1 == 2) { UsuarioModel mdlUsuario = new UsuarioModel();
         * Usuario _u = new Usuario(); ArrayList<Usuario> arrUsuario =
         * mdlUsuario.Listar(); Usuario _objRetorno =
         * arrUsuario.stream().filter((Usuario f) ->
         * f.getPermissoesTela().contains(this.sessaoUsuario.getTransacao()) &&
         * f.getPermissaoFuncao().contains(p_evtBotao) &&
         * this.sessaoUsuario.getIdUsuario() ==
         * f.getIdUsuario()).findFirst().orElse(null); return _objRetorno !=
         * null; } } catch (Exception e) {
         *
         * } *
         */
        switch (p_evtBotao) {
            case Alterar:
                switch (sessaoUsuario.getPerfilUsuario()) {
                    case GERENTE:
                        break;
                    case FUNCIONARIO:
                        if (sessaoUsuario.getTransacao().equals("EMPRESTIMO")) {
                            throw new Exception("Você não tem permissão para realizar esta operação.");
                        }
                        break;
                    case CLIENTE:
                        break;
                }
                break;
            case Incluir:
                switch (sessaoUsuario.getPerfilUsuario()) {
                    case GERENTE:
                        break;
                    case FUNCIONARIO:
                        break;
                    case CLIENTE:
                        break;
                }
                break;
            case Excluir:
                switch (sessaoUsuario.getPerfilUsuario()) {
                    case GERENTE:
                        break;
                    case FUNCIONARIO:
                        if (sessaoUsuario.getTransacao().equals("EMPRESTIMO") || sessaoUsuario.getTransacao().equals("USUARIO") || sessaoUsuario.getTransacao().equals("LIVRO")) {
                            throw new Exception("Você não tem permissão para realizar esta operação.");
                        }
                        break;
                    case CLIENTE:
                        break;
                }
                break;
        }
        return true;
    }

    public Usuario Login(Usuario p_usuario) throws Exception {
        //usuario e senha padrao
        Cripto c = new Cripto(UsuarioPadrao.getPASSWORD_PADRAO());
        if (p_usuario.getUsuario().equals(UsuarioPadrao.getUSERNAME_PADRAO()) && p_usuario.getSenha().equals(c.Criptografa())) {
            return new Usuario(0, "Admin", null, null, null, null, null, TipoUsuario.GERENTE);
        } else {
            try {
                UsuarioModel mdlUsuario = new UsuarioModel();
                Usuario _u = mdlUsuario.Consultar(p_usuario, true);
                //usuario e senha padrao
                if (_u != null && p_usuario.getSenha().equals(_u.getSenha())) {
                    return _u;
                } else {
                    throw new Exception("Usuario ou senha está incorreto.");
                }
            } catch (Exception e) {

            }
        }
        return null;
    }
}
