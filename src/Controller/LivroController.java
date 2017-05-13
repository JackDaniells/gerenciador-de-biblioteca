/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entidades.Livro;
import Entidades.Sessao;
import Enumeradores.EventoBotao;
import Framework.Seguranca;
import java.io.IOException;
import java.util.ArrayList;
import model.LivroModel;

/**
 *
 * @author Rolando
 */
public class LivroController {

    LivroModel _mdlLivro = new LivroModel();
    Seguranca seg;

    public LivroController() {

    }

    public LivroController(Sessao p_sessao) {
        p_sessao.setTransacao("LIVRO");
        seg = new Seguranca(p_sessao);
    }

    public Livro ExecutaEventoBotao(Livro p_livro, EventoBotao evtBotao) throws Exception {
        
            if (seg.VerificaAcesso(evtBotao) && ValidaRegrasNegocio(p_livro, evtBotao)) {
                //LivroModel _mdlLivro = new LivroModel();
                switch (evtBotao) {
                    case Incluir:
                        _mdlLivro.Incluir(p_livro);
                        break;
                    case Alterar:
                        _mdlLivro.Alterar(p_livro);
                        break;
                    case Excluir:
                        if (!_mdlLivro.Excluir(p_livro)) {
                            return null;
                        }
                        break;
                    case Consultar:
                        return _mdlLivro.Consultar(p_livro);

                }
            }
        
        return p_livro;
    }

    public ArrayList<Livro> Listar() {

        ArrayList<Livro> _lstLivro = null;
        try {
            _lstLivro = _mdlLivro.Listar();
        } catch (Exception e) {
            System.err.println(e);
        }
        return _lstLivro;
    }

    private boolean ValidaRegrasNegocio(Livro p_livro, EventoBotao evtBotao) throws Exception {
        if (p_livro.getIdLivro() > 0 && evtBotao == EventoBotao.Incluir) {
            throw new Exception("Não pode incluir um registro com código.");
        } else if (p_livro.getIdLivro() == 0 && evtBotao == EventoBotao.Alterar) {
            throw new Exception("Não pode incluir um registro sem código.");
        } else if (p_livro.getIdLivro() > 0 && evtBotao == EventoBotao.Incluir) {
            throw new Exception("Não pode consultar um registro sem código.");
        } else if (p_livro.getSituacao().equals("Emprestado") && evtBotao == EventoBotao.Excluir) {
            throw new Exception("Não pode excluir um livro emprestado.");
        }
        return true;
    }
}
