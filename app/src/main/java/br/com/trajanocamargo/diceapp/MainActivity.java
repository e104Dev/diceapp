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
        //TODO: Gerar numeros aleatorios entre 1 e 6 para os 2 dados

        Random ramdom = new Random();
        int numero1 = new Random().nextInt(6) + 1;
        int numero2 = new Random().nextInt(6) + 1;


        //TODO: Alterar a imagem do dado com base no numero sorteado para os 2 dados
        String idRecursoDiceOne = String.format("dice%s", numero1);
        String idRecursoDiceTwo = String.format("dice%s", numero2);

        int drawableDiceOne = getResources().getIdentifier(idRecursoDiceOne, "drawable", getPackageName());
        int drawableDiceTwo = getResources().getIdentifier(idRecursoDiceTwo, "drawable", getPackageName());

        ImageView imageViewDiceOne =  findViewById(R.id.imageViewDiceOne);
        imageViewDiceOne.setImageResource(drawableDiceOne);

        ImageView imageViewDiceTwo =  findViewById(R.id.imageViewDiceTwo);
        imageViewDiceTwo.setImageResource(drawableDiceTwo);
    }
}