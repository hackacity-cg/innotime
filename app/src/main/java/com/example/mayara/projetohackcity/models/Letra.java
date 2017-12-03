package com.example.mayara.projetohackcity.models;

import android.graphics.Bitmap;

/**
 * Created by Mayara on 02/12/2017.
 */
public class Letra {

    private String letra;
    private String urlVideo;
    private Bitmap imagem;

    public Letra(String letra, String urlVideo, Bitmap imagem) {
        this.letra = letra;
        this.urlVideo = urlVideo;
        this.imagem = imagem;
    }

    public Letra() {
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public Bitmap getImagem() {
        return imagem;
    }

    public void setImagem(Bitmap imagem) {
        this.imagem = imagem;
    }
}
