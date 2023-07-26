package com.msaggik.homeworke;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    List<Eat> eats = new ArrayList<Eat>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitalData();

        RecyclerView recyclerView = findViewById(R.id.list_eat);

        eatAdapter adapter = new eatAdapter(this, eats);

        recyclerView.setAdapter(adapter);
    }
    private void setInitalData(){
        eats.add( new Eat("Картошка фри","Обжарить в масле при высокой темпиратуре",
               R.drawable.free,"Картошка, масло, приправы" ));
        eats.add( new Eat("Спагети","Сварить в сковороде заполненой водой",
                R.drawable.noodlse,"Лапша и приправы"));
        eats.add( new Eat("Стейк","Кусок мяса пожарить на сковороде",
                R.drawable.steake,"Кусок мяса и приправы"));
        eats.add( new Eat("Яичница","Разбить яйцо на сковороду и пожарить его",
                R.drawable.egg,"Яйцо и соль"));
    }
}