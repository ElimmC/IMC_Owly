package com.example.touchier.imc_owly;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends Activity {

    private Button btn;
    private RadioGroup gen, Estilo;
    private RadioButton typegen, typevida;
    private EditText nombre, apaterno, amaterno, edad, correo;
    private CheckBox deporte, estudio, trabajo, nada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.btn);
        gen = (RadioGroup)findViewById(R.id.gen);
        Estilo = (RadioGroup)findViewById(R.id.Estilo);
        nombre = (EditText)findViewById(R.id.name);
        apaterno = (EditText)findViewById(R.id.apellidop);
        amaterno = (EditText)findViewById(R.id.apellidom);
        edad = (EditText)findViewById(R.id.edad);
        correo = (EditText)findViewById(R.id.correo);


    }

    public void enviar (View view){

        int selectedgen = gen.getCheckedRadioButtonId();
        typegen = (RadioButton) findViewById(selectedgen);
        int selectedestilo = Estilo.getCheckedRadioButtonId();
        typevida = (RadioButton) findViewById(selectedestilo);

        Intent screen = new Intent(this, IMC1.class);
        screen.putExtra("nombre", nombre.getText().toString());
        screen.putExtra("apaterno", apaterno.getText().toString());
        screen.putExtra("amaterno", amaterno.getText().toString());
        screen.putExtra("gen", typegen.getText().toString());
        screen.putExtra("estilo", typevida.getText().toString());
        screen.putExtra("edad", edad.getText().toString());
        screen.putExtra("mail", correo.getText().toString());
        startActivity(screen);

    }

}
