# diceapp

O objetivo deste App e fomentar o interesse pela criação de aplicativos e demonstrar a criação e entrega de um app simples de forma rápida.
Ao conluir este app você terá compreendido a estrutura basica de auma aplicação em Android e a dinamica entre o layout XML e as classes Java para construção básica de um App.

## Tutorial DiceApp

Siga a risca os passo aabaixo para criarmos um App juntos

### Parte I - Layout Inicial

1. No arquivo `/res/layout/activity_main.xml`, substitua o conteudo da tag <TextView> pelo trecho abaixo.
  
```xml
<ImageView
        android:id="@+id/imageViewDiceOne"
        android:layout_width="175dp"
        android:layout_height="200dp"
        android:contentDescription="@string/image_view_description"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:srcCompat="@drawable/dice6" />

    <Button
        android:id="@+id/buttonRoll"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:onClick="roll"
        android:text="@string/button_jogar"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/imageViewDiceOne" />  
```

### Parte II - Interação
  
1. No arquivo `/java/ActivityMain.java`, logo abaixo da declaração `onCreate()`, crie a função que irá girar o Dado, incluindo o trecho a seguir.
  
```java
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
```
  
  2. Teste o App em seu smartphone ou emulador...

### Parte III - Mais Layout, Mais Interação
  
  > Comming Soon...
