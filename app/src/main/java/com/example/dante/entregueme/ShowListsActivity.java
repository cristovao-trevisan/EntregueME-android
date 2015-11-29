package com.example.dante.entregueme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShowListsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_lists);

        ListView lists = (ListView) findViewById(R.id.show_lists);
        String[] lists_array = getResources().getStringArray(R.array.lists_HARDCODED);
        ArrayAdapter<String> notAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , lists_array);
        lists.setAdapter(notAdapter);
    }
}
