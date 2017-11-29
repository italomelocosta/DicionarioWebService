/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.lemaf.Conexao;

import br.ufla.lemaf.Visão.Principal;
import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public class MyThread extends Thread {

    Principal p;

    public void run() {
        String Palavra;
        ClientWebService buscaPalavras = new ClientWebService();
        Palavra = buscaPalavras.Pesquisa(0);
        //System.out.println(Palavra);
        int i = 1;
        if (Palavra != null) {
            p.listaPalavras.add(Palavra.toUpperCase());
            while (Palavra != null) {

                Palavra = buscaPalavras.Pesquisa(i);
                p.listaPalavras.add(Palavra.toUpperCase());
                i++;
            }
        }
    }
}
