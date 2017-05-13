/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entidades.Emprestimo;
import Entidades.Livro;
import Entidades.Sessao;
import Enumeradores.EventoBotao;
import Framework.Seguranca;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import model.EmprestimoModel;

/**
 *
 * @author Rolando
 */
public class EmprestimoController {

    EmprestimoModel _mdlEmprestimo = new EmprestimoModel();
    Seguranca seg;

    public EmprestimoController() {

    }

    public EmprestimoController(Sessao p_sessao) {
        p_sessao.setTransacao("EMPRESTIMO");
        seg = new Seguranca(p_sessao);
    }

    public Emprestimo ExecutaEventoBotao(Emprestimo p_emprestimo, EventoBotao evtBotao) {
        try {
            if (seg.VerificaAcesso(evtBotao) && ValidaRegrasNegocio(p_emprestimo, evtBotao)) {
                //EmprestimoModel _mdlEmprestimo = new EmprestimoModel();
                switch (evtBotao) {
                    case Incluir:
                        _mdlEmprestimo.Incluir(p_emprestimo);
                        break;
                    case Alterar:
                        _mdlEmprestimo.Alterar(p_emprestimo);
                        break;
                    case Excluir:
                        if (_mdlEmprestimo.Excluir(p_emprestimo)) {
                            return null;
                        }

                        break;
                    case Consultar:
                        return _mdlEmprestimo.Consultar(p_emprestimo);
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return p_emprestimo;
    }

    public ArrayList<Emprestimo> Listar() {

        ArrayList<Emprestimo> _lstEmprestimo = null;
        try {
            _lstEmprestimo = _mdlEmprestimo.Listar();
        } catch (Exception e) {
            System.err.println(e);
        }
        return _lstEmprestimo;
    }

    private boolean ValidaRegrasNegocio(Emprestimo p_emprestimo, EventoBotao evtBotao) throws Exception {
        if (p_emprestimo.getIdEmprestimo() > 0 && evtBotao == EventoBotao.Incluir) {
            throw new Exception("Não pode incluir um registro com código.");
        } else if (p_emprestimo.getIdEmprestimo() == 0 && evtBotao == EventoBotao.Alterar) {
            throw new Exception("Não pode incluir um registro sem código.");
        } else if (p_emprestimo.getIdEmprestimo() > 0 && evtBotao == EventoBotao.Incluir) {
            throw new Exception("Não pode consultar um registro sem código.");
        }
        return true;
    }

    public int devolveLivro(Emprestimo p_emprestimo) {

        int multa = 0;
        Calendar c = Calendar.getInstance();
        Date _dAgora = c.getTime();
        if (p_emprestimo.getDtDevolucao().before(_dAgora)) {
            //calcula multa
            multa = (int) ((_dAgora.getTime() - p_emprestimo.getDtDevolucao().getTime()) / (1000 * 60 * 60 * 24));
        }

        return multa;
    }
}
