package com.example.projek_4;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

public class Search_Destination extends AppCompatActivity {

    SearchView searchView ;
    ListView listView ;

    String[] nameList = {"Pekan Baru","Pematang Reba","Medan"};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_destination);

        searchView = findViewById(R.id.search_bar);
        listView = findViewById(R.id.list_item);

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,nameList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Search_Destination.this, "You Click -"+adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
            }
        });

        // then Search View set Filter...
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Search_Destination.this.arrayAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Search_Destination.this.arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });




    }
}