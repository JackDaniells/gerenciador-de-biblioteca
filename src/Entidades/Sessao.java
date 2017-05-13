/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeradores.TipoUsuario;
import Enumeradores.TransacaoSistema;

/**
 *
 * @author Rolando
 */
public class Sessao {

    private int IdUsuario;
    private TipoUsuario PerfilUsuario;
    private String Transacao;

    public Sessao(int p_id, TipoUsuario p_tp, String p_trs) {
        IdUsuario = p_id;
        PerfilUsuario = p_tp;
        Transacao = p_trs;
    }

    public String getTransacao() {
        return Transacao;
    }

    public void setTransacao(String Transacao) {
        this.Transacao = Transacao;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public TipoUsuario getPerfilUsuario() {
        return PerfilUsuario;
    }

    public void setPerfilUsuario(TipoUsuario PerfilUsuario) {
        this.PerfilUsuario = PerfilUsuario;
    }

}
