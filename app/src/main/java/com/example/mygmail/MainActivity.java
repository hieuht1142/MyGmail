package com.example.mygmail;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<MyModel> items;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initItems();

        MyAdapter adapter = new MyAdapter(this, items);
        listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initItems() {
        items = new ArrayList<>();
        items.add(new MyModel("Tom Holland",
                "Hello, how can i help you?", "10:22AM"));
        items.add(new MyModel("Mark",
                "Hello, how can i help you?", "09:43AM"));
        items.add(new MyModel("Jack",
                "Hello, how can i help you?", "08:12AM"));
        items.add(new MyModel("Taylor Swift",
                "Hello, how can i help you?", "07:00AM"));
        items.add(new MyModel("Katy Perry",
                "Hello, how can i help you?", "06:11AM"));
        items.add(new MyModel("Ariana Grande",
                "Hello, how can i help you?", "05:33AM"));
        items.add(new MyModel("Xiao Jun",
                "Hello, how can i help you?", "04:32AM"));
        items.add(new MyModel("Tom Holland",
                "Hello, how can i help you?", "03:00AM"));
        items.add(new MyModel("Tom Holland",
                "Hello, how can i help you?", "02:08AM"));
        items.add(new MyModel("Tom Holland",
                "Hello, how can i help you?", "01:05AM"));
    }

}