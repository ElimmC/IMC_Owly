package com.example.touchier.imc_owly;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

public class IMC1 extends AppCompatActivity {
    EditText ePeso,eAltura;
    TextView imc;
    Button calcular;
    ImageView img;
    Drawable peso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);



        calcular=(Button) findViewById(R.id.calculaIMC);
    }


    public void textoB(View view){
        ePeso=(EditText) findViewById(R.id.peso);
        eAltura=(EditText) findViewById(R.id.altura);
        imc=(TextView) findViewById(R.id.imcText);
        img=(ImageView) findViewById(R.id.imageView);

        Intent datos = getIntent();

        String nombre = datos.getStringExtra("nombre");
        String paterno = datos.getStringExtra("apaterno");
        String materno = datos.getStringExtra("amaterno");
        String gen = datos.getStringExtra("gen");
        String estilo = datos.getStringExtra("estilo");
        String edad = datos.getStringExtra("estilo");
        String mail = datos.getStringExtra("mail");

        Double lPeso, lAltura, lImc;
        String texto= "";
        lPeso= Double.parseDouble(ePeso.getText().toString());
        lAltura= Double.parseDouble(eAltura.getText().toString());
        lImc= (lPeso)/(Math.pow(lAltura,2));

        Intent screen2 = new Intent(this, resultado.class);
        screen2.putExtra("nombre", nombre);
        screen2.putExtra("apaterno", paterno);
        screen2.putExtra("amaterno", materno);
        screen2.putExtra("gen", gen);
        screen2.putExtra("estilo", estilo);
        screen2.putExtra("imc", ""+lImc+"");
        screen2.putExtra("edad", edad);
        screen2.putExtra("mail", mail);
        startActivity(screen2);


    }

}
