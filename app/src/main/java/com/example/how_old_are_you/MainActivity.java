package com.example.how_old_are_you;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculateButtonPressed(View buttonView){
        EditText editText = findViewById(R.id.editText);
        int age = Calendar.getInstance().get(Calendar.YEAR)-Integer.parseInt(editText.getText().toString());
        TextView edittext2 =findViewById(R.id.editText2);
        edittext2.setText(age + " ");
        Toast.makeText(MainActivity.this,"your age is "+edittext2.getText().toString(),Toast.LENGTH_LONG).show();
    }
}
