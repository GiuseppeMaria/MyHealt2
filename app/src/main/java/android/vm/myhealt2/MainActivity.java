package android.vm.myhealt2;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    AdapterAssunzione adapter;
    FloatingActionButton pluse;
    Assunzione aggiunta;
    EditText nome,data;
    List<Assunzione> aggiunti;


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        recyclerView= (RecyclerView) findViewById(R.id.lista_medicinali);
        layoutManager= new LinearLayoutManager(this);
        adapter= new AdapterAssunzione();
        nome = (EditText) findViewById(R.id.medical_name);
        data = (EditText) findViewById(R.id.date);


        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        aggiunti = new ArrayList<>();

        pluse = (FloatingActionButton) findViewById(R.id.aggiungi_medicine);
        pluse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                aggiunta = new Assunzione(nome.getText()+"",data.getText()+"");
                aggiunti.add(aggiunta);
                adapter.setDataSet(aggiunti);
                nome.setText("");
                data.setText("");
            }
        });


    }


}