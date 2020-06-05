package com.example.bubblesort;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    EditText editText;
    ArrayList<String> itemList;
    private  String[] items = {"5", "4", "8", "2", "4", "10"};
    Integer[] items1 = new Integer[items.length];


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        adapter = new ArrayAdapter<>(this, R.layout.list_item, R.id.txtview, items);
        ListView listV = (ListView) findViewById(R.id.myList);
        listV.setAdapter(adapter);


        Button btAdd = (Button) findViewById(R.id.button);
        btAdd.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                sortArray();


            }


        });
    }

        public void sortArray(){

            // takes item list (arraylist) changes to array of objects



            //takes array of objects and changes to array of ints

            for (int i = 0; i < items.length; i++)
                items1[i] = Integer.parseInt(items[i]);


            int tempVar;

            int size = items1.length;
            int[] arr = new int[size];


            // bubble sort into arr

            lab1 : for (int i = 0; i < items1.length - 1; i++) {
                for (int j = 0; j < items1.length - i - 1; j++) {
                    if (items1[j] > items1[j + 1]) {
                        tempVar = items1[j + 1];
                        items1[j + 1] = items1[j];
                        items1[j] = tempVar;

                        break lab1;




                    }
                }
            }



            returnArray();


        }

    public void returnArray(){

        // change back into string array from int array

        for (int i = 0; i < items1.length; i++)
            items[i] = String.valueOf(items1[i]);


        // notify listview of data changed
        adapter.notifyDataSetChanged();


    }




    }




