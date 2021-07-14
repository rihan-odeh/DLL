package com.example.dll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    DoublyLinkedList doublyLinkedList=new DoublyLinkedList(7);
    EditText output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.editText);
        doublyLinkedList.addNode(4);
        doublyLinkedList.addNode(10);
        doublyLinkedList.addNode(9);
        doublyLinkedList.addNode(5);
        doublyLinkedList.addNode(8);
        doublyLinkedList.printValuesBackward();
        doublyLinkedList.pop();
        output.setText(String.valueOf(doublyLinkedList.size()));
        //
       // doublyLinkedList.printValuesBackward();
      //  Log.e(" ----",doublyLinkedList.getString());

    }
}