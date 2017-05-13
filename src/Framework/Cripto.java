/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Rolando
 */
public class Cripto implements Serializable {

    private final String Hash;

    public Cripto(String p_senha) {
        Hash = p_senha;
    }

    public String Criptografa() {
        StringBuilder strSenha = new StringBuilder();
        String _alfa = "QqWwEeTtYuIiOoPp=P*8123457AaSsFfhHKkÇçCcXxMmNnBb.RrZzU";
        int _n = _alfa.length();
        String[] a = Hash.split("");
        for (String string : a) {
            int _nuPosition = _alfa.indexOf(string);
            if (_nuPosition != -1) {
                if (_nuPosition == _alfa.length() - 1) {
                    strSenha.append(Character.toString(_alfa.charAt(_nuPosition / 3)));
                } else {
                    strSenha.append(Character.toString(_alfa.charAt(_nuPosition / 2)));
                }
            } else {
                strSenha.append(Character.toString(_alfa.charAt(Hash.length() / 2)));
            }
        }
        return strSenha.toString();
    }
}
