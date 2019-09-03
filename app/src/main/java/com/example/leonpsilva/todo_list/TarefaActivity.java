package com.example.leonpsilva.todo_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TarefaActivity extends AppCompatActivity {


    private TextView textViewTituloTarefa;
    private TextView textViewDescTarefa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefa);

        textViewTituloTarefa = findViewById(R.id.textViewTituloTarefa);
        textViewDescTarefa = findViewById(R.id.textViewDescTarefa);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra("TITULO");
        textViewTituloTarefa.setText(titulo);

        Intent intent1 = getIntent();
        String titulo2 = intent1.getStringExtra("DESCRICAO");
        textViewDescTarefa.setText(titulo2);
    }
}
