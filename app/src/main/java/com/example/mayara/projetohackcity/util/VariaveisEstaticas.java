package com.example.mayara.projetohackcity.util;

import com.example.mayara.projetohackcity.models.Letra;

import java.util.List;

/**
 * Created by Mayara on 02/12/2017.
 */
public class VariaveisEstaticas {
    private static List<Letra> listaLetras;

    public static List<Letra> getListaLetras() {
        return listaLetras;
    }

    public static void setListaLetras(List<Letra> listaLetras) {
        VariaveisEstaticas.listaLetras = listaLetras;
    }
}
