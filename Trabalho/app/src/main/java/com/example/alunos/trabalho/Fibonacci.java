package com.example.alunos.trabalho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Stack;
//BIBLIOTECAS

public class Fibonacci extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);
    }//função para abrir a tel "fibonacci" a partir da tela principal

 Stack pilha = new Stack();//CRIA UMA PILHA
    public void fibo(View n){
        while(pilha.size()>0) pilha.pop();//DESEMPILHA ATÉ A PILHA FICAR VAZIA
        EditText pos = (EditText) findViewById(R.id.input);
        int num = Integer.parseInt(pos.getText().toString());//TRANSFORMA A VARIÁVEL PARA INTEIRO
        pilha.push(0);//COLOCA O 0 NA PILHA (PRIMEIRO VALOR)
        pilha.push(1);//COLOCA O 1 NA PILHA (SEGUNDO VALOR)
        for (int i=0; i<num-2; i++){
            int n1=Integer.parseInt(pilha.pop().toString()); //transfoma pra int o último
            int n2=Integer.parseInt(pilha.pop().toString()); //penúltimo
            pilha.push(n2);
            pilha.push(n1);
            pilha.push(n1+n2);
        }
        TextView pega = (TextView) findViewById(R.id.idfibom);
        pega.setText(pilha.toString());
        this.posicao(n);
        this.somatorio(n);
    }
    int a;
    public void posicao(View n){
        while(pilha.size()>0) pilha.pop();
        EditText pos = (EditText) findViewById(R.id.input);
        int num = Integer.parseInt(pos.getText().toString());
        pilha.push(0);
        pilha.push(1);

        for (int i=0; i<num-2; i++){
            int n1=Integer.parseInt(pilha.pop().toString()); //transfoma pra int o ultimo
            int n2=Integer.parseInt(pilha.pop().toString()); //penultimo
            pilha.push(n2);
            pilha.push(n1);
            pilha.push(n1+n2);
            a = n1+n2;
        }
        TextView pega = (TextView) findViewById(R.id.txtElemento);
        pega.setText(pilha.pop().toString());
        pilha.push(a);


    }
    public void somatorio (View n) {
        int soma = 0;
        while (!pilha.isEmpty()) {
            soma+= Integer.parseInt(pilha.pop().toString());
        }
        pilha.push(soma);
        String som =  pilha.pop().toString();
        TextView pega = (TextView) findViewById(R.id.txtsomar);
        pega.setText(som);


    }
}




