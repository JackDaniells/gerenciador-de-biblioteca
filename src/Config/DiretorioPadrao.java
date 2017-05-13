/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

/**
 *
 * @author ASUS-DEV
 */
public class DiretorioPadrao {
    
    private static String DIRETORIO_PADRAO = System.getProperty("user.dir");

    /**
     * @return the DIRETORIO_PADRAO
     */
    public static String getDIRETORIO_PADRAO() {
        return DIRETORIO_PADRAO + "/BD";
    }
}
