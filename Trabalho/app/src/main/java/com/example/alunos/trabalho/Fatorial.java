package com.example.alunos.trabalho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class Fatorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_fatorial);
    }//funçaõ para abrir a tela fatorial a partir da página inicial


    public void  calcfatorial (View n){
        EditText pos = (EditText) findViewById(R.id.idfi);//variavél criada para receber o valor informado
        int num = Integer.parseInt(pos.getText().toString());//trasforma a váriavél para string
        int y=1;//cria a variável y e atribui 1 a ela 
        for (int i=1; i<=num; i++){
            y*=i;
        }//função para calcular o fatorial do valor indicado
        TextView x = (TextView) findViewById(R.id.idfm);//variável que recebe o id do local de resposta
        x.setText(Integer.toString(y));//mostrando o valor como uma string 

    }

}
