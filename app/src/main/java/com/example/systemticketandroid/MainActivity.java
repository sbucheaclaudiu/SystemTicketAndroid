package com.example.systemticketandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.systemticketandroid.adapter.EventAdapter;
import com.example.systemticketandroid.model.EventDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<EventDTO> eventDTOList;

    private List<EventDTO> noSortEventDTOList;
    private EventAdapter eventAdapter;

    private EventRepo eventRepo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupList();
        setupSpinner();
    }
    private void setupList(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        EventRepo eventRepo = new EventRepo();
        this.eventRepo = eventRepo;
        this.eventDTOList = eventRepo.getEventDTOList();
        this.noSortEventDTOList = this.eventDTOList;

        EventAdapter eventAdapter = new EventAdapter(this.eventDTOList,MainActivity.this);
        this.eventAdapter = eventAdapter;
        recyclerView.setAdapter(eventAdapter);
    }

    private void setupSpinner(){
        List<String> lstSpinner = Arrays.asList("Fara sortare", "Pret", "Data");

        Spinner spinner = (Spinner) findViewById(R.id.sortSpinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_list, lstSpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if(position == 0){
                    sortRandom();
                }
                else if(position == 1){
                    sortByPrice();
                }
                else if(position == 2){
                    sortByDate();
                }

                eventAdapter.notifyDataSetChanged();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void sortRandom(){
        this.eventDTOList = this.noSortEventDTOList;
        Log.v("HERE", this.eventDTOList.toString());
    }

    private void sortByPrice(){
        this.eventDTOList.sort((e1, e2) -> e1.getPrice().compareTo(e2.getPrice()));
        Log.v("HERE", this.eventDTOList.toString());
    }

    private void sortByDate(){
        this.eventDTOList.sort((e1, e2) -> e1.getDate().compareTo(e2.getDate()));
        Log.v("HERE", this.eventDTOList.toString());
    }

}