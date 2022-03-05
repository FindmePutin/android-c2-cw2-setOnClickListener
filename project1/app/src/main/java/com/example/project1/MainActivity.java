      package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

      public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText number1 = findViewById(R.id.editTextTextPersonName2);
        EditText number2 = findViewById(R.id.editTextTextPersonName3);
        Button button = findViewById(R.id.button);
        TextView TOTAL = findViewById(R.id.TOTAL);

        button.setOnClickListener(new View.OnClickListener(){

           @Override
            public void onClick(View view){
              int total1 = Integer.parseInt( number1.getText().toString());
              int total2 = Integer.parseInt( number2.getText().toString());
              int total = (total1 + total2);
                      TOTAL.setText(total + "");
           }


        });

    }
}