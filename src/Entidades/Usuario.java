/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeradores.EventoBotao;
import Enumeradores.SituacaoLivro;
import Enumeradores.TipoUsuario;
import Enumeradores.TransacaoSistema;
import Framework.Cripto;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rolando
 */
public class Usuario implements Serializable {

    private int IdUsuario;
    private String NmUsuario;
    private String DeEndereco;
    private String NuCpf;
    private String DtNascimento;
    private String NmLogin;
    private String DeSenha;
    private TipoUsuario TpUsuario;
    private SituacaoLivro DeLivro;

    private ArrayList<TransacaoSistema> PermissoesTela;
    private ArrayList<EventoBotao> PermissaoFuncao;

    public Usuario(int p_IdUsuario, String p_nmUsuario, String p_endUsuario, String p_nuCpf, String p_dtNascimento, String p_nmLogin, String p_deSenha, TipoUsuario p_tpUsuario) {
        Cripto c = new Cripto(String.valueOf(p_deSenha));
        this.IdUsuario = p_IdUsuario;
        this.NmUsuario = p_nmUsuario;
        this.DeEndereco = p_endUsuario;
        this.NuCpf = p_nuCpf;
        this.DtNascimento = p_dtNascimento;
        this.NmLogin = p_nmLogin;
        this.DeSenha = c.Criptografa();
        this.TpUsuario = p_tpUsuario;
    }

    public Usuario(int p_IdUsuario) {
        this.IdUsuario = p_IdUsuario;
    }

    public Usuario() {

    }

    public SituacaoLivro getDeLivro() {
        return DeLivro;
    }

    public void setDeLivro(SituacaoLivro DeLivro) {
        this.DeLivro = DeLivro;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNome() {
        return NmUsuario;
    }

    public void setNome(String nome) {
        this.NmUsuario = nome;
    }

    public String getEndereco() {
        return DeEndereco;
    }

    public void setEndereco(String endereco) {
        this.DeEndereco = endereco;
    }

    public String getCpf() {
        return NuCpf;
    }

    public void setCpf(String cpf) {
        this.NuCpf = cpf;
    }

    public String getDtNasc() {
        return DtNascimento;
    }

    public void setDtNasc(String dtNasc) {
        this.DtNascimento = dtNasc;
    }

    public String getUsuario() {
        return NmLogin;
    }

    public void setUsuario(String Usuario) {
        this.NmLogin = Usuario;
    }

    public String getSenha() {
        return DeSenha;
    }

    public void setSenha(String Senha) {
        Cripto objCripto = new Cripto(Senha);
        this.DeSenha = objCripto.Criptografa();
    }

    public void setTpUsuario(TipoUsuario TpUsuario) {
        this.TpUsuario = TpUsuario;
    }

    public TipoUsuario getTipoUsuario() {
        return TpUsuario;
    }

    public ArrayList<TransacaoSistema> getPermissoesTela() {
        return PermissoesTela;
    }

    public void setPermissoesTela(ArrayList<TransacaoSistema> PermissoesTela) {
        this.PermissoesTela = PermissoesTela;
    }

    public ArrayList<EventoBotao> getPermissaoFuncao() {
        return PermissaoFuncao;
    }

    public void setPermissaoFuncao(ArrayList<EventoBotao> PermissaoFuncao) {
        this.PermissaoFuncao = PermissaoFuncao;
    }

}
