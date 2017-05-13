/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Entidades.Livro;
import Entidades.Emprestimo;
import Enumeradores.EventoBotao;
import Enumeradores.SituacaoLivro;
import Framework.Persistencia;
import java.util.ArrayList;

/**
 *
 * @author Rolando
 */
public class EmprestimoModel {

    Persistencia db = new Persistencia();

    public Emprestimo Incluir(Emprestimo p_emprestimo) {
        p_emprestimo.setIdEmprestimo((int) db.ExecutaPersistencia(p_emprestimo, EventoBotao.Incluir).get(0));
        p_emprestimo.getLivro().setSituacao(SituacaoLivro.Emprestado);
        LivroModel mdlLivro = new LivroModel();
        Livro _livro = p_emprestimo.getLivro();
        _livro = mdlLivro.Alterar(_livro);
        p_emprestimo.setLivro(_livro);
        return p_emprestimo;
    }

    public Emprestimo Alterar(Emprestimo p_emprestimo) {
        Emprestimo emp = (Emprestimo) db.ExecutaPersistencia(p_emprestimo, EventoBotao.Alterar).get(0);

        return emp;
    }

    public boolean Excluir(Emprestimo p_emprestimo) {

        p_emprestimo.getLivro().setSituacao(SituacaoLivro.Disponivel);
        LivroModel mdlLivro = new LivroModel();
        Livro _livro = p_emprestimo.getLivro();
        _livro = mdlLivro.Alterar(_livro);
        p_emprestimo.setLivro(_livro);
        return (boolean) db.ExecutaPersistencia(p_emprestimo, EventoBotao.Excluir).get(0);
    }

    public Emprestimo Consultar(Emprestimo p_emprestimo) {
        return (Emprestimo) db.ExecutaPersistencia(p_emprestimo, EventoBotao.Consultar).get(0);

    }

    public ArrayList<Emprestimo> Listar() {
        ArrayList<Object> arrEmprestimoGenerico = db.ExecutaPersistencia(new Emprestimo(), EventoBotao.Listar);
        ArrayList<Emprestimo> arrEmprestimo = new ArrayList<>();
        for (Object emprestimo : arrEmprestimoGenerico) {
            arrEmprestimo.add((Emprestimo) emprestimo);
        }
        return arrEmprestimo;
    }
}
