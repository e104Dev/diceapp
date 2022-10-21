package br.com.trajanocamargo.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Esta função faz a ligação da interface(XML) com o Java.
     * Ela precisa de uma assinatura com o prametro do tipo View, para que
     * a propriedade onClick() a identifique automaticamente.
     * @param v View - Referencia da interface grafica
     */
    public void roll(View v) {
        //TODO: Gerar numero aleatorio entre 1 e 6.

        Random ramdom = new Random();
        int numero = new Random().nextInt(6) + 1;

        String mensagem = String.format("O número sorteado foi %d", numero);

        //TODO: Alterar a imagem do dado com base no numero sorteado.
        String idRecurso = String.format("dice%s", numero);

        int drawable = getResources().getIdentifier(idRecurso, "drawable", getPackageName());

        ImageView imageView =  findViewById(R.id.imageViewDiceOne);
        imageView.setImageResource(drawable);
    }
}