package com.neliel.frases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void gerarNovaFrase (View view) {

            String[] frases = {
                    "A persistência é o caminho do êxito!",
                    "As pessoas costumam dizer, que a motivação não dura para sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente.",
                    "Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação.",
                    "Em meio a dificuldade, encontra-se a oportunidade!",
                    "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo que quiser ser, mas, acima de tudo, seja você sempre.",
                    "Tudo o que um sonho precisa para ser realizado, é alguém que acredite que ele possa ser realizado.",
                    "Imagine uma nova história para sua vida e acredite nela.",
                    "O insucesso é apenas uma oportunidade para recomeçar com mais inteligência.",
                    "Você precisa fazer aquilo que pensa que não é capaz de fazer.",
                    "O sucesso é ir de fracasso em fracasso sem perder o entusiasmo.",
                    "Só se pode alcançar um grande êxito, quando nos mantemos fiéis a nós mesmos.",
                    "Nossa maior fraqueza está em desistir. O caminho mais certo de vencer, é tentar mais uma vez.",
                    "Não importa o que você decidiu. O que importa é que isso te faça feliz.",
                    "Algumas vezes, coisas ruins acontecem em nossas vidas, para nos colocar na direção das melhores coisas que poderíamos viver.",
                    "Se a caminhada está difícil, é porque você está no caminho certo.",
                    "Toda conquista começa com a decisão de tentar.",
                    "Insista, persista e nunca desista.",
                    "Vai. E se der medo, vai com medo mesmo.",
                    "Todo esforço tem a sua recompensa.",
                    "Se não puder fazer tudo, faça tudo que puder."
            };
            int numero = new Random().nextInt(20);

            TextView texto = findViewById(R.id.fraseFinal);
            texto.setText(frases[numero]);
        }

}