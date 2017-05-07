package com.example.usuario.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener,CompoundButton.OnCheckedChangeListener{

    ToggleButton toggleButton;
    Spinner spinner;
    String [] ArrayNombres = new String[]{"jhonatan","hector","mauricio","lady","viviana"};
    String [] ArrayApellidos = new String[]{"alzate","martinez","zuluaga","tangarife","quiceno"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);
        toggleButton = (ToggleButton)findViewById(R.id.toggleButton);

        spinner.setOnItemSelectedListener(this);
        toggleButton.setOnCheckedChangeListener(this);



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if (toggleButton.isChecked())
        {
            ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,ArrayNombres);
            spinner.setAdapter(adapter);
        }else
        {
            ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,ArrayApellidos);
            spinner.setAdapter(adapter);
        }

    }
}
