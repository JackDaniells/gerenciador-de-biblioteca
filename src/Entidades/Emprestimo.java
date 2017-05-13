/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package Entidades;

import Enumeradores.SituacaoLivro;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Rolando
 */
public class Emprestimo implements Serializable {

    /**
     * @param livro the livro to set
     */
    private int idEmprestimo;
    private Livro livro;
    private Usuario usuario;
    private Date dtEmprestimo;
    private Date dtDevolucao;
    private static int tempoEmprestimo = 14;

    public Emprestimo(int idEmprestimo, Livro livro, Usuario user) {
        this.idEmprestimo = idEmprestimo;
        this.livro = livro;

        this.usuario = user;
        Calendar c = Calendar.getInstance();
        this.dtEmprestimo = c.getTime();
        c.add(Calendar.DATE, tempoEmprestimo);
        this.dtDevolucao = c.getTime();
    }

    public Emprestimo() {
    }

    public Emprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    /**
     * @return the livro
     */
    public Livro getLivro() {
        return livro;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    /**
     * @return the dtEmprestimo
     */
    public Date getDtEmprestimo() {
        return dtEmprestimo;
    }

    /**
     * @return the dtDevolucao
     */
    public Date getDtDevolucao() {
        return dtDevolucao;
    }

    /**
     * @return the dtEmprestimo
     */
    public String getDtEmprestimoString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(dtEmprestimo);
    }

    /**
     * @return the dtDevolucao
     */
    public String getDtDevolucaoString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(dtDevolucao);
    }

    /**
     * @return the idEmprestimo
     */
    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    /**
     * @param idEmprestimo the idEmprestimo to set
     */
    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    /**
     * @return the tempoEmprestimo
     */
    public static int getTempoEmprestimo() {
        return tempoEmprestimo;
    }

}
