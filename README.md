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

Nesta parte iremos incluir o segundo dado e fazer com que os 2 dados rolem após pressionar o botáo rolar.

> Após alterar o layout, verifique as maracções visuais das contraints.

1. No arquivo `main_activity_xml`, atualize-o com o trecho abaixo, neste código adicionamos um novo dado (ImageView) e ajustamos suas contraints para que elas ocupem o tamanho máximos permitido na tela. Esta cnfiguração não esta no video gravado em sala, mas utilizamos as propriedades `match_constraint` para o o comprimento e altura.
```java
<ImageView
        android:id="@+id/imageViewDiceOne"
                android:layout_width="0dp"
                android:layout_height="0dp"
                android:layout_marginStart="16dp"
                android:layout_marginTop="16dp"
                android:layout_marginEnd="16dp"
                android:layout_marginBottom="8dp"
                android:contentDescription="@string/image_view_description"
                app:layout_constraintBottom_toTopOf="@+id/imageViewDiceTwo"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                app:srcCompat="@drawable/dice6" />

<ImageView
        android:id="@+id/imageViewDiceTwo"
                android:layout_width="0dp"
                android:layout_height="0dp"
                android:layout_marginStart="16dp"
                android:layout_marginTop="8dp"
                android:layout_marginEnd="16dp"
                android:layout_marginBottom="16dp"
                android:adjustViewBounds="false"
                android:cropToPadding="false"
                app:layout_constraintBottom_toTopOf="@+id/buttonRoll"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@+id/imageViewDiceOne"
                app:srcCompat="@drawable/dice1" />

<Button
        android:id="@+id/buttonRoll"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_marginStart="16dp"
                android:layout_marginEnd="16dp"
                android:layout_marginBottom="16dp"
                android:backgroundTint="@color/white"
                android:onClick="roll"
                android:text="@string/button_jogar"
                android:textColor="@color/purple_500"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="@+id/imageViewDiceTwo"
                app:layout_constraintStart_toStartOf="@+id/imageViewDiceTwo" />
```
2. No arquivo `MainActivity.java`, inclua o trecho abaixo para atualizar  código e criar a interação com o segundo dado.

```java
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
```

3. Teste o aplicativo em seu samrtphone e comente na thread da aula de hoje!

# Have Fun


