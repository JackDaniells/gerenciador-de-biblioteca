/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeradores.SituacaoLivro;
import java.io.Serializable;

/**
 *
 * @author Rolando
 */
public class Livro implements Serializable {

    private int idLivro;
    private String titulo;
    private String autor;
    //private String edicao;
    //private int qtdeTotal;
    //private int qtdeDisponivel;
    private SituacaoLivro situacao;

    public Livro(int p_IdLivro, String p_titulo, String p_autor) {
        this.idLivro = p_IdLivro;
        this.autor = p_autor;
        this.titulo = p_titulo;
        //this.edicao = edicao;
        //this.qtdeTotal = qtdeTotal;
        //this.qtdeTotal = qtdeTotal;
        this.situacao = SituacaoLivro.Disponivel;
    }

    public Livro(int p_IdLivro) {
        this.idLivro = p_IdLivro;
    }

    public Livro() {

    }

    /**
     * @return the titulo
     */
    public String getNome() {
        return titulo;
    }

    public void setNome(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @return the idLivro
     */
    public int getIdLivro() {
        return idLivro;
    }

    /**
     * @param idLivro the idLivro to set
     */
    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        if (situacao == SituacaoLivro.Disponivel) {
            return "Disponivel";
        } else {
            return "Emprestado";
        }
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(SituacaoLivro situacao) {
        this.situacao = situacao;
    }

}
