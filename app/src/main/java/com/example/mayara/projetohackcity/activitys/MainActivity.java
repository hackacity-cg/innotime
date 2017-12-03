package com.example.mayara.projetohackcity.activitys;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mayara.projetohackcity.R;
import com.example.mayara.projetohackcity.models.Letra;
import com.example.mayara.projetohackcity.util.VariaveisEstaticas;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private LinearLayout contBotoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contBotoes = (LinearLayout) findViewById(R.id.contBotoes);

        carregaLista();
        carregaTela();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void carregaTela(){


        int cont = VariaveisEstaticas.getListaLetras().size() / 4;
        for(int i = 0 ; i < cont ; i++){

            LinearLayout ll = (LinearLayout) getLayoutInflater().inflate(R.layout.cont_botao, null);

            for(int j = 0; j < 4; j++){
                if(!VariaveisEstaticas.getListaLetras().isEmpty()){
                    LinearLayout item = (LinearLayout) getLayoutInflater().inflate(R.layout.botao_letra, null);

                    TextView txtNome = (TextView) item.findViewById(R.id.txtNome);
                    ImageView ivBotao = (ImageView) item.findViewById(R.id.ivBotao);

                    Letra letra = VariaveisEstaticas.getListaLetras().remove(0);

                    txtNome.setText(letra.getLetra());
                    ivBotao.setImageBitmap(letra.getImagem());

                    item.setTag(letra);
                    ll.addView(item);
                }
            }
            contBotoes.addView(ll);
        }

    }

    private void carregaLista(){
        if(VariaveisEstaticas.getListaLetras() == null &&
                VariaveisEstaticas.getListaLetras().isEmpty()){
            VariaveisEstaticas.setListaLetras(new ArrayList<Letra>());

            VariaveisEstaticas.getListaLetras().add(new Letra("a", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("B", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("C", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("D", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("E", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("F", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("G", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("H", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("I", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("J", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("K", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("L", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("M", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("N", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("O", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("P", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("Q", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("R", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("S", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("T", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("U", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("V", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("W", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("X", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("Y", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));
            VariaveisEstaticas.getListaLetras().add(new Letra("Z", "", BitmapFactory.decodeResource(getResources(), R.drawable.a)));

        }
    }


}
