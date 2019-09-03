package com.example.leonpsilva.todo_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.leonpsilva.todo_list.adpter.TarefaAdapter;
import com.example.leonpsilva.todo_list.modelos.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Tarefa> tarefas = new ArrayList<>();
    private ArrayAdapter<Tarefa> tarefaArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        criarTarefas();

        listView = findViewById(R.id.list_view_tarefas);

        tarefaArrayAdapter = new TarefaAdapter(MainActivity.this,
                (ArrayList<Tarefa>) tarefas);
        listView.setAdapter(tarefaArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*Toast toast = Toast.makeText(getApplicationContext(),
                        tarefas.get(position).getNome(),
                        Toast.LENGTH_LONG);
                toast.show();*/
                Intent intent = new Intent(MainActivity.this,
                        TarefaActivity.class);
                intent.putExtra("TITULO", tarefas.get(position).getNome());


                Intent intent2 = new Intent(MainActivity.this,
                        TarefaActivity.class);
                intent.putExtra("DESCRICAO", tarefas.get(position).getDescricao());
                startActivity(intent);

            }
        }); {

        }

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                tarefas.get(position).setStatus(!tarefas.get(position).getStatus());
                listView.invalidateViews();
                return false;
            }
        });

    }

    public void criarTarefas(){
        tarefas.add(new Tarefa("1","Estudar Android","Estudo todo o conteudo!!",false));
        tarefas.add(new Tarefa("2","Estudar Testes","Estude Tbm!!",false));
        tarefas.add(new Tarefa("3","Jogar Coup","Jogue Coup",true));
    }

}
