package com.example.touchier.imc_owly;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

public class resultado extends Activity {

    TextView txtIMC, name;
    ImageView viewImagen;
    Button btnEnviar;
    Drawable peso;

    Intent datos = getIntent();

    String nombre = datos.getStringExtra("nombre");
    String paterno = datos.getStringExtra("apaterno");
    String materno = datos.getStringExtra("amaterno");
    String gen = datos.getStringExtra("gen");
    String mail = datos.getStringExtra("mail");
    String estilo = datos.getStringExtra("estilo");
    double lImc = Double.parseDouble(datos.getStringExtra("imc"));
    int edad = Integer.parseInt(datos.getStringExtra("edad"));

    String texto="";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtIMC = (TextView)findViewById(R.id.txtIMC);
        name = (TextView)findViewById(R.id.name);
        viewImagen = (ImageView)findViewById(R.id.viewImagen);


        name.setText(nombre+" "+paterno+" "+materno);

        txtIMC.setText("" + lImc);
        if(lImc < 18.5){

            //inicio flaco menor de edad
            if(edad<18){
                if(estilo.equals("Sedentario")){
                    int imageResource = getResources().getIdentifier("@drawable/delgado", null, getPackageName());
                    peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                    texto = "Estas bajo de peso. Eres menor de edad, no haces nah. " +
                            "Contar con cinco" +
                            " a seis comidas diarias repartidas en desayuno, media mañana, almuerzo, merienda y cena, todas ellas con porcentajes altos de calorías " +
                            "repartidas en 20, 5, 30, 15 y 30 % respectivamente.\n" +
                            "Desayuno (7:00h): 1 Vaso de leche entera, 60 gr de muesli y una tostada de pan (60g.) con queso fresco y aguacate.\n" +
                            "Desayuno II (10:00h): 2 mandarinas y un bocadillo (120 g. de pan) de jamón ibérico.\n" +
                            "Media mañana (12:00h): 30 g. de nueces y un plátano\n" +
                            "Comida (14:00h): Espagueti con verduras, bistec de buey a la plancha con berenjena, pimiento y patata asados al horno. Yogur natural.\n" +
                            "Merienda (17:00h): Zumo de naranja natural, bocadillo (120g. De pan) de atún al natural\n" +
                            "Cena (20:00h): Ensalada de lentejas con huevo cocido y salmón ahumado. Yogur natural.\n" +
                            "Recena (22.00h): 2 biscotes de pan con jamó york, vaso de leche entera con canela."
                    ;
                }
                else{
                    if(estilo.equals("Mixto")){
                        int imageResource = getResources().getIdentifier("@drawable/delgado", null, getPackageName());
                        peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                        texto = "Estas bajo de peso. Eres menor de edad, media haces algo, " +
                                "es importante saber que para que esta dieta resulte efectiva es recomendable," +
                                " realizar actividad física 30 min, por" +
                                " ejemplo cardio de 3 a 4 veces por semana y " +
                                "de 2 a  3 veces por semana ejercicio para formación  y tonificación de masa muscular, como pilates o body pump.\n " +
                                "Desayuno (7:00h): 1 Vaso de leche entera, 60 gr de muesli y una tostada de pan (60g.) con queso fresco y aguacate.\n" +
                                "Desayuno II (10:00h): 2 mandarinas y un bocadillo (120 g. de pan) de jamón ibérico.\n" +
                                "Media mañana (12:00h): 30 g. de nueces y un plátano\n" +
                                "Comida (14:00h): Espagueti con verduras, bistec de buey a la plancha con berenjena, pimiento y patata asados al horno. Yogur natural.\n" +
                                "Merienda (17:00h): Zumo de naranja natural, bocadillo (120g. De pan) de atún al natural\n" +
                                "Cena (20:00h): Ensalada de lentejas con huevo cocido y salmón ahumado. Yogur natural.\n" +
                                "Recena (22.00h): 2 biscotes de pan con jamó york, vaso de leche entera con canela." ;
                    }
                    else{
                        int imageResource = getResources().getIdentifier("@drawable/delgado", null, getPackageName());
                        peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                        texto = "Estas bajo de peso. Eres menor de edad, eres deportista," +
                                " Debes tener en cuenta que a menudo el objetivo no es solo engordar un número" +
                                " determinado de kilos, sino que además, también se pretende una mejora de la tonificación muscular. Para ello, la ingesta calórica debe de " +
                                "ir acompañada de ejercicio físico y entrenamiento adecuado.\n" +
                                "Desayuno (7:00h): 1 Vaso de leche entera, 60 gr de muesli y una tostada de pan (60g.) con queso fresco y aguacate.\n" +
                                "Desayuno II (10:00h): 2 mandarinas y un bocadillo (120 g. de pan) de jamón ibérico.\n" +
                                "Media mañana (12:00h): 30 g. de nueces y un plátano\n" +
                                "Comida (14:00h): Espagueti con verduras, bistec de buey a la plancha con berenjena, pimiento y patata asados al horno. Yogur natural.\n" +
                                "Merienda (17:00h): Zumo de naranja natural, bocadillo (120g. De pan) de atún al natural\n" +
                                "Cena (20:00h): Ensalada de lentejas con huevo cocido y salmón ahumado. Yogur natural.\n" +
                                "Recena (22.00h): 2 biscotes de pan con jamó york, vaso de leche entera con canela." ;
                    }
                }
            }
            //termina flaco menor de edad

            //inicia flaco adulto

            else {
                if(edad>18 && edad<58){
                    if(estilo.equals("Sedentario")){
                        int imageResource = getResources().getIdentifier("@drawable/delgado", null, getPackageName());
                        peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                        texto = "Estas bajo de peso. Eres un adulto, no haces nah " +
                                "Contar con cinco" +
                                " a seis comidas diarias repartidas en desayuno, media mañana, almuerzo, merienda y cena, todas ellas con porcentajes altos de calorías " +
                                "repartidas en 20, 5, 30, 15 y 30 % respectivamente.\n" +
                                "Desayuno (7:00h): 1 Vaso de leche entera, 60 gr de muesli y una tostada de pan (60g.) con queso fresco y aguacate.\n" +
                                "Desayuno II (10:00h): 2 mandarinas y un bocadillo (120 g. de pan) de jamón ibérico.\n" +
                                "Media mañana (12:00h): 30 g. de nueces y un plátano\n" +
                                "Comida (14:00h): Espagueti con verduras, bistec de buey a la plancha con berenjena, pimiento y patata asados al horno. Yogur natural.\n" +
                                "Merienda (17:00h): Zumo de naranja natural, bocadillo (120g. De pan) de atún al natural\n" +
                                "Cena (20:00h): Ensalada de lentejas con huevo cocido y salmón ahumado. Yogur natural.\n" +
                                "Recena (22.00h): 2 biscotes de pan con jamó york, vaso de leche entera con canela."
                        ;

                    }
                    else{
                        if(estilo.equals("Mixto")){
                            int imageResource = getResources().getIdentifier("@drawable/delgado", null, getPackageName());
                            peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                            texto = "Estas bajo de peso. Eres un adulto, medio haces algo, " +
                                    "es importante saber que para que esta dieta resulte efectiva es recomendable," +
                                    " realizar actividad física 30 min, por" +
                                    " ejemplo cardio de 3 a 4 veces por semana y " +
                                    "de 2 a  3 veces por semana ejercicio para formación  y tonificación de masa muscular, como pilates o body pump.\n " +
                                    "Desayuno (7:00h): 1 Vaso de leche entera, 60 gr de muesli y una tostada de pan (60g.) con queso fresco y aguacate.\n" +
                                    "Desayuno II (10:00h): 2 mandarinas y un bocadillo (120 g. de pan) de jamón ibérico.\n" +
                                    "Media mañana (12:00h): 30 g. de nueces y un plátano\n" +
                                    "Comida (14:00h): Espagueti con verduras, bistec de buey a la plancha con berenjena, pimiento y patata asados al horno. Yogur natural.\n" +
                                    "Merienda (17:00h): Zumo de naranja natural, bocadillo (120g. De pan) de atún al natural\n" +
                                    "Cena (20:00h): Ensalada de lentejas con huevo cocido y salmón ahumado. Yogur natural.\n" +
                                    "Recena (22.00h): 2 biscotes de pan con jamó york, vaso de leche entera con canela." ;
                        }
                        else{
                            int imageResource = getResources().getIdentifier("@drawable/delgado", null, getPackageName());
                            peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                            texto = "Estas bajo de peso. Eres un adulto, eres deportista," +
                                    " Debes tener en cuenta que a menudo el objetivo no es solo engordar un número" +
                                    " determinado de kilos, sino que además, también se pretende una mejora de la tonificación muscular. Para ello, la ingesta calórica debe de " +
                                    "ir acompañada de ejercicio físico y entrenamiento adecuado.\n" +
                                    "Desayuno (7:00h): 1 Vaso de leche entera, 60 gr de muesli y una tostada de pan (60g.) con queso fresco y aguacate.\n" +
                                    "Desayuno II (10:00h): 2 mandarinas y un bocadillo (120 g. de pan) de jamón ibérico.\n" +
                                    "Media mañana (12:00h): 30 g. de nueces y un plátano\n" +
                                    "Comida (14:00h): Espagueti con verduras, bistec de buey a la plancha con berenjena, pimiento y patata asados al horno. Yogur natural.\n" +
                                    "Merienda (17:00h): Zumo de naranja natural, bocadillo (120g. De pan) de atún al natural\n" +
                                    "Cena (20:00h): Ensalada de lentejas con huevo cocido y salmón ahumado. Yogur natural.\n" +
                                    "Recena (22.00h): 2 biscotes de pan con jamó york, vaso de leche entera con canela." ;
                        }
                    }

                }

                //termina flaco adulto

                //inicia flaco viejito

                else {
                    if(estilo.equals("Sedentario")){
                        int imageResource = getResources().getIdentifier("@drawable/delgado", null, getPackageName());
                        peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                        texto = "Estas bajo de peso. Eres un mayor de edad, no haces nah " +
                                "Contar con cinco" +
                                " a seis comidas diarias repartidas en desayuno, media mañana, almuerzo, merienda y cena, todas ellas con porcentajes altos de calorías " +
                                "repartidas en 20, 5, 30, 15 y 30 % respectivamente.\n" +
                                "Desayuno (7:00h): 1 Vaso de leche entera, 60 gr de muesli y una tostada de pan (60g.) con queso fresco y aguacate.\n" +
                                "Desayuno II (10:00h): 2 mandarinas y un bocadillo (120 g. de pan) de jamón ibérico.\n" +
                                "Media mañana (12:00h): 30 g. de nueces y un plátano\n" +
                                "Comida (14:00h): Espagueti con verduras, bistec de buey a la plancha con berenjena, pimiento y patata asados al horno. Yogur natural.\n" +
                                "Merienda (17:00h): Zumo de naranja natural, bocadillo (120g. De pan) de atún al natural\n" +
                                "Cena (20:00h): Ensalada de lentejas con huevo cocido y salmón ahumado. Yogur natural.\n" +
                                "Recena (22.00h): 2 biscotes de pan con jamó york, vaso de leche entera con canela."
                        ;
                    }
                    else{
                        if(estilo.equals("Mixto")){
                            int imageResource = getResources().getIdentifier("@drawable/delgado", null, getPackageName());
                            peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                            texto = "Estas bajo de peso. Eres un mayor de edad, medio haces algo, " +
                                    "es importante saber que para que esta dieta resulte efectiva es recomendable," +
                                    " realizar actividad física 30 min, por" +
                                    " ejemplo cardio de 3 a 4 veces por semana y " +
                                    "de 2 a  3 veces por semana ejercicio para formación  y tonificación de masa muscular, como pilates o body pump.\n " +
                                    "Desayuno (7:00h): 1 Vaso de leche entera, 60 gr de muesli y una tostada de pan (60g.) con queso fresco y aguacate.\n" +
                                    "Desayuno II (10:00h): 2 mandarinas y un bocadillo (120 g. de pan) de jamón ibérico.\n" +
                                    "Media mañana (12:00h): 30 g. de nueces y un plátano\n" +
                                    "Comida (14:00h): Espagueti con verduras, bistec de buey a la plancha con berenjena, pimiento y patata asados al horno. Yogur natural.\n" +
                                    "Merienda (17:00h): Zumo de naranja natural, bocadillo (120g. De pan) de atún al natural\n" +
                                    "Cena (20:00h): Ensalada de lentejas con huevo cocido y salmón ahumado. Yogur natural.\n" +
                                    "Recena (22.00h): 2 biscotes de pan con jamó york, vaso de leche entera con canela." ;
                        }
                        else{
                            int imageResource = getResources().getIdentifier("@drawable/delgado", null, getPackageName());
                            peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                            texto = "Estas bajo de peso. Eres un mayor de edad, eres deportista, " +
                                    " Debes tener en cuenta que a menudo el objetivo no es solo engordar un número" +
                                    " determinado de kilos, sino que además, también se pretende una mejora de la tonificación muscular. Para ello, la ingesta calórica debe de " +
                                    "ir acompañada de ejercicio físico y entrenamiento adecuado.\n" +
                                    "Desayuno (7:00h): 1 Vaso de leche entera, 60 gr de muesli y una tostada de pan (60g.) con queso fresco y aguacate.\n" +
                                    "Desayuno II (10:00h): 2 mandarinas y un bocadillo (120 g. de pan) de jamón ibérico.\n" +
                                    "Media mañana (12:00h): 30 g. de nueces y un plátano\n" +
                                    "Comida (14:00h): Espagueti con verduras, bistec de buey a la plancha con berenjena, pimiento y patata asados al horno. Yogur natural.\n" +
                                    "Merienda (17:00h): Zumo de naranja natural, bocadillo (120g. De pan) de atún al natural\n" +
                                    "Cena (20:00h): Ensalada de lentejas con huevo cocido y salmón ahumado. Yogur natural.\n" +
                                    "Recena (22.00h): 2 biscotes de pan con jamó york, vaso de leche entera con canela." ;
                        }
                    }
                }
                //termina flaco viejito
            }



        }else {
            if (lImc > 25) {

                //inicia obeso menor de edad

                if (edad < 18) {
                    if(estilo.equals("Sedentario")){
                        int imageResource = getResources().getIdentifier("@drawable/obeso", null, getPackageName());
                        peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                        texto = "Estas arriba de peso. Eres un menor, no haces nah contar con cinco a seis comidas diarias repartidas en desayuno, media mañana, almuerzo, merienda y" +
                                " cena, todas ellas con porcentajes bajos de calorías repartidas en 20, 5, 30, 15 y 30 % respectivamente.\n" +
                                "Desayuno\n" +
                                "1 taza de té con leche desnatada\n" +
                                "1 rodaja de pan integral con mermelada dietética\n" +
                                "\n" +
                                "Media Mañana\n" +
                                "1 fruta fresca\n" +
                                "\n" +
                                "Almuerzo\n" +
                                "1 taza de caldo dietético con salvado de avena.\n" +
                                "1 porción de pollo sin piel.\n" +
                                "1 porción de ensalada de lechuga y tomate.\n" +
                                "1 fruta fresca.\n" +
                                "\n" +
                                "Media Tarde\n" +
                                "1 yogur natural.\n" +
                                "\n" +
                                "Cena\n" +
                                "1 porción de verduras cocidas al vapor con aceite de oliva.\n" +
                                "1 yogur natural.";
                    }
                    else{
                        if(estilo.equals("Mixto")){
                            int imageResource = getResources().getIdentifier("@drawable/obeso", null, getPackageName());
                            peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                            texto = "Estas arriba de peso. Eres un menor, medio haces algo," +
                                    " es importante saber que para que esta dieta resulte efectiva es recomendable," +
                                    " realizar actividad física 30 min, por" +
                                    " ejemplo cardio de 3 a 4 veces por semana y " +
                                    "de 2 a  3 veces por semana ejercicio para formación  y tonificación de masa muscular, como pilates o body pump.\n" +
                                    "Desayuno: \n" +
                                    "Tostada integral con tomate, aceite y kiwi.\n" +
                                    "Media mañana:\n" +
                                    "Piña.\n" +
                                    "Comida:\n" +
                                    "Ensalada de canónigos con nueces, parmesano y vinagreta de limón.\n" +
                                    "Lubina al horno con eneldo.\n" +
                                    "Media tarde: \n" +
                                    "Yogur desnatado con chocolate negro.\n" +
                                    "Cena:\n" +
                                    "Verduras salteadas al estilo tailandés.\n" +
                                    "Pollo con champiñones.\n" +
                                    "Recena: Mandarina.";
                        }
                        else{
                            int imageResource = getResources().getIdentifier("@drawable/obeso", null, getPackageName());
                            peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                            texto = "Estas arriba de peso. Eres un menor, eres deportista, " +
                                    "La clave para perder peso (o más bien grasa corporal) es generar un balance energético negativo. Es decir, consumir -de forma controlada- menos calorías de las que " +
                                    "quemamos, y que dichas calorías provengan de alimentos de \"calidad\" nutricional.\n" +
                                    "Desayuno: \n" +
                                    "Tostada integral con tomate, aceite y kiwi.\n" +
                                    "Media mañana:\n" +
                                    "Piña.\n" +
                                    "Comida:\n" +
                                    "Ensalada de canónigos con nueces, parmesano y vinagreta de limón.\n" +
                                    "Lubina al horno con eneldo.\n" +
                                    "Media tarde: \n" +
                                    "Yogur desnatado con chocolate negro.\n" +
                                    "Cena:\n" +
                                    "Verduras salteadas al estilo tailandés.\n" +
                                    "Pollo con champiñones.\n" +
                                    "Recena: Mandarina.";
                        }
                    }
                }
                //Termina obeso menor de edad


                else {

                    //Inicia obeso adulto

                    if (edad > 18 && edad < 58) {
                        if(estilo.equals("Sedentario")){
                            int imageResource = getResources().getIdentifier("@drawable/obeso", null, getPackageName());
                            peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                            texto = "Estas arriba de peso. Eres un adulto, no haces nah contar con cinco a seis comidas diarias repartidas en desayuno, media mañana, almuerzo, merienda y" +
                                    " cena, todas ellas con porcentajes bajos de calorías repartidas en 20, 5, 30, 15 y 30 % respectivamente.\n" +
                                    "Desayuno\n" +
                                    "1 taza de té con leche desnatada\n" +
                                    "1 rodaja de pan integral con mermelada dietética\n" +
                                    "\n" +
                                    "Media Mañana\n" +
                                    "1 fruta fresca\n" +
                                    "\n" +
                                    "Almuerzo\n" +
                                    "1 taza de caldo dietético con salvado de avena.\n" +
                                    "1 porción de pollo sin piel.\n" +
                                    "1 porción de ensalada de lechuga y tomate.\n" +
                                    "1 fruta fresca.\n" +
                                    "\n" +
                                    "Media Tarde\n" +
                                    "1 yogur natural.\n" +
                                    "\n" +
                                    "Cena\n" +
                                    "1 porción de verduras cocidas al vapor con aceite de oliva.\n" +
                                    "1 yogur natural.";
                        }
                        else{
                            if(estilo.equals("Mixto")){
                                int imageResource = getResources().getIdentifier("@drawable/obeso", null, getPackageName());
                                peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                                texto = "Estas arriba de peso. Eres un adulto, medio haces algo, " +
                                        " es importante saber que para que esta dieta resulte efectiva es recomendable," +
                                        " realizar actividad física 30 min, por" +
                                        " ejemplo cardio de 3 a 4 veces por semana y " +
                                        "de 2 a  3 veces por semana ejercicio para formación  y tonificación de masa muscular, como pilates o body pump.\n" +
                                        "Desayuno: \n" +
                                        "Tostada integral con tomate, aceite y kiwi.\n" +
                                        "Media mañana:\n" +
                                        "Piña.\n" +
                                        "Comida:\n" +
                                        "Ensalada de canónigos con nueces, parmesano y vinagreta de limón.\n" +
                                        "Lubina al horno con eneldo.\n" +
                                        "Media tarde: \n" +
                                        "Yogur desnatado con chocolate negro.\n" +
                                        "Cena:\n" +
                                        "Verduras salteadas al estilo tailandés.\n" +
                                        "Pollo con champiñones.\n" +
                                        "Recena: Mandarina.";
                            }
                            else{
                                int imageResource = getResources().getIdentifier("@drawable/obeso", null, getPackageName());
                                peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                                texto = "Estas arriba de peso. Eres un adulto, eres deportista, " +
                                        "La clave para perder peso (o más bien grasa corporal) es generar un balance energético negativo. Es decir, consumir -de forma controlada- menos calorías de las que " +
                                        "quemamos, y que dichas calorías provengan de alimentos de \"calidad\" nutricional.\n" +
                                        "Desayuno: \n" +
                                        "Tostada integral con tomate, aceite y kiwi.\n" +
                                        "Media mañana:\n" +
                                        "Piña.\n" +
                                        "Comida:\n" +
                                        "Ensalada de canónigos con nueces, parmesano y vinagreta de limón.\n" +
                                        "Lubina al horno con eneldo.\n" +
                                        "Media tarde: \n" +
                                        "Yogur desnatado con chocolate negro.\n" +
                                        "Cena:\n" +
                                        "Verduras salteadas al estilo tailandés.\n" +
                                        "Pollo con champiñones.\n" +
                                        "Recena: Mandarina.";
                            }
                        }
                    }

                    //termina obeso adulto

                    //Inicia obeso viejito

                    else {

                        if(estilo.equals("Sedentario")){
                            int imageResource = getResources().getIdentifier("@drawable/obeso", null, getPackageName());
                            peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                            texto = "Estas normal de peso. Eres un menor de edad, no haces nah contar con cinco a seis comidas diarias repartidas en desayuno, media mañana, almuerzo, merienda y" +
                                    " cena, todas ellas con porcentajes bajos de calorías repartidas en 20, 5, 30, 15 y 30 % respectivamente.\n" +
                                    "Desayuno\n" +
                                    "1 taza de té con leche desnatada\n" +
                                    "1 rodaja de pan integral con mermelada dietética\n" +
                                    "\n" +
                                    "Media Mañana\n" +
                                    "1 fruta fresca\n" +
                                    "\n" +
                                    "Almuerzo\n" +
                                    "1 taza de caldo dietético con salvado de avena.\n" +
                                    "1 porción de pollo sin piel.\n" +
                                    "1 porción de ensalada de lechuga y tomate.\n" +
                                    "1 fruta fresca.\n" +
                                    "\n" +
                                    "Media Tarde\n" +
                                    "1 yogur natural.\n" +
                                    "\n" +
                                    "Cena\n" +
                                    "1 porción de verduras cocidas al vapor con aceite de oliva.\n" +
                                    "1 yogur natural.";
                        }
                        else{
                            if(estilo.equals("Mixto")){
                                int imageResource = getResources().getIdentifier("@drawable/obeso", null, getPackageName());
                                peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                                texto = "Estas arriba de peso. eres un señor de edad mayor, medio haces algo, " +
                                        " es importante saber que para que esta dieta resulte efectiva es recomendable," +
                                        " realizar actividad física 30 min, por" +
                                        " ejemplo cardio de 3 a 4 veces por semana y " +
                                        "de 2 a  3 veces por semana ejercicio para formación  y tonificación de masa muscular, como pilates o body pump.\n" +
                                        "Desayuno: \n" +
                                        "Tostada integral con tomate, aceite y kiwi.\n" +
                                        "Media mañana:\n" +
                                        "Piña.\n" +
                                        "Comida:\n" +
                                        "Ensalada de canónigos con nueces, parmesano y vinagreta de limón.\n" +
                                        "Lubina al horno con eneldo.\n" +
                                        "Media tarde: \n" +
                                        "Yogur desnatado con chocolate negro.\n" +
                                        "Cena:\n" +
                                        "Verduras salteadas al estilo tailandés.\n" +
                                        "Pollo con champiñones.\n" +
                                        "Recena: Mandarina.";
                            }
                            else{
                                int imageResource = getResources().getIdentifier("@drawable/obeso", null, getPackageName());
                                peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                                texto = "Estas arriba de peso. eres un señor de edad mayor, eres deportista, " +
                                        "La clave para perder peso (o más bien grasa corporal) es generar un balance energético negativo. Es decir, consumir -de forma controlada- menos calorías de las que " +
                                        "quemamos, y que dichas calorías provengan de alimentos de \"calidad\" nutricional.\n" +
                                        "Desayuno: \n" +
                                        "Tostada integral con tomate, aceite y kiwi.\n" +
                                        "Media mañana:\n" +
                                        "Piña.\n" +
                                        "Comida:\n" +
                                        "Ensalada de canónigos con nueces, parmesano y vinagreta de limón.\n" +
                                        "Lubina al horno con eneldo.\n" +
                                        "Media tarde: \n" +
                                        "Yogur desnatado con chocolate negro.\n" +
                                        "Cena:\n" +
                                        "Verduras salteadas al estilo tailandés.\n" +
                                        "Pollo con champiñones.\n" +
                                        "Recena: Mandarina.";
                            }
                        }
                    }
                    //termina obeso viejito
                }


            } else {
                //inicia normal menor de edad

                if (edad < 18) {
                    if(estilo.equals("Sedentario")){
                        int imageResource = getResources().getIdentifier("@drawable/delgado", null, getPackageName());
                        peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                        texto = "Estas normal de peso. Eres un menor de edad, no haces nah contar con cinco a seis comidas diarias repartidas en desayuno, media mañana, almuerzo, merienda y" +
                                " cena, todas ellas con porcentajes bajos de calorías repartidas en 20, 5, 30, 15 y 30 % respectivamente.\n" +
                                "Desayuno\n" +
                                "1 taza de té con leche desnatada\n" +
                                "1 rodaja de pan integral con mermelada dietética\n" +
                                "\n" +
                                "Media Mañana\n" +
                                "1 fruta fresca\n" +
                                "\n" +
                                "Almuerzo\n" +
                                "1 taza de caldo dietético con salvado de avena.\n" +
                                "1 porción de pollo sin piel.\n" +
                                "1 porción de ensalada de lechuga y tomate.\n" +
                                "1 fruta fresca.\n" +
                                "\n" +
                                "Media Tarde\n" +
                                "1 yogur natural.\n" +
                                "\n" +
                                "Cena\n" +
                                "1 porción de verduras cocidas al vapor con aceite de oliva.\n" +
                                "1 yogur natural.";
                    }
                    else{
                        if(estilo.equals("Mixto")){
                            int imageResource = getResources().getIdentifier("@drawable/delgado", null, getPackageName());
                            peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                            texto = "Estas normal de peso. Eres un menor de edad, medio haces algo, " +
                                    " es importante saber que para que esta dieta resulte efectiva es recomendable," +
                                    " realizar actividad física 30 min, por" +
                                    " ejemplo cardio de 3 a 4 veces por semana y " +
                                    "de 2 a  3 veces por semana ejercicio para formación  y tonificación de masa muscular, como pilates o body pump.\n" +
                                    "Desayuno: \n" +
                                    "Tostada integral con tomate, aceite y kiwi.\n" +
                                    "Media mañana:\n" +
                                    "Piña.\n" +
                                    "Comida:\n" +
                                    "Ensalada de canónigos con nueces, parmesano y vinagreta de limón.\n" +
                                    "Lubina al horno con eneldo.\n" +
                                    "Media tarde: \n" +
                                    "Yogur desnatado con chocolate negro.\n" +
                                    "Cena:\n" +
                                    "Verduras salteadas al estilo tailandés.\n" +
                                    "Pollo con champiñones.\n" +
                                    "Recena: Mandarina.";
                        }
                        else{
                            int imageResource = getResources().getIdentifier("@drawable/delgado", null, getPackageName());
                            peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                            texto = "Estas normal de peso. Eres un menor de edad, eres deportista, " +
                                    "La clave para perder peso (o más bien grasa corporal) es generar un balance energético negativo. Es decir, consumir -de forma controlada- menos calorías de las que " +
                                    "quemamos, y que dichas calorías provengan de alimentos de \"calidad\" nutricional.\n" +
                                    "Desayuno: \n" +
                                    "Tostada integral con tomate, aceite y kiwi.\n" +
                                    "Media mañana:\n" +
                                    "Piña.\n" +
                                    "Comida:\n" +
                                    "Ensalada de canónigos con nueces, parmesano y vinagreta de limón.\n" +
                                    "Lubina al horno con eneldo.\n" +
                                    "Media tarde: \n" +
                                    "Yogur desnatado con chocolate negro.\n" +
                                    "Cena:\n" +
                                    "Verduras salteadas al estilo tailandés.\n" +
                                    "Pollo con champiñones.\n" +
                                    "Recena: Mandarina.";
                        }
                    }
                }

                //Termina normal menor de edad

                else {

                    //inicia normal adulto

                    if (edad > 18 && edad < 58) {
                        if(estilo.equals("Sedentario")){
                            int imageResource = getResources().getIdentifier("@drawable/delgado", null, getPackageName());
                            peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                            texto = "Estas normal de peso. Eres un adulto, no haces nah contar con cinco a seis comidas diarias repartidas en desayuno, media mañana, almuerzo, merienda y" +
                                    " cena, todas ellas con porcentajes bajos de calorías repartidas en 20, 5, 30, 15 y 30 % respectivamente.\n" +
                                    "Desayuno\n" +
                                    "1 taza de té con leche desnatada\n" +
                                    "1 rodaja de pan integral con mermelada dietética\n" +
                                    "\n" +
                                    "Media Mañana\n" +
                                    "1 fruta fresca\n" +
                                    "\n" +
                                    "Almuerzo\n" +
                                    "1 taza de caldo dietético con salvado de avena.\n" +
                                    "1 porción de pollo sin piel.\n" +
                                    "1 porción de ensalada de lechuga y tomate.\n" +
                                    "1 fruta fresca.\n" +
                                    "\n" +
                                    "Media Tarde\n" +
                                    "1 yogur natural.\n" +
                                    "\n" +
                                    "Cena\n" +
                                    "1 porción de verduras cocidas al vapor con aceite de oliva.\n" +
                                    "1 yogur natural.";
                        }
                        else{
                            if(estilo.equals("Mixto")){
                                int imageResource = getResources().getIdentifier("@drawable/delgado", null, getPackageName());
                                peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                                texto = "Estas normal de peso. Eres un  adulto, medio haces algo, " +
                                        " es importante saber que para que esta dieta resulte efectiva es recomendable," +
                                        " realizar actividad física 30 min, por" +
                                        " ejemplo cardio de 3 a 4 veces por semana y " +
                                        "de 2 a  3 veces por semana ejercicio para formación  y tonificación de masa muscular, como pilates o body pump.\n" +
                                        "Desayuno: \n" +
                                        "Tostada integral con tomate, aceite y kiwi.\n" +
                                        "Media mañana:\n" +
                                        "Piña.\n" +
                                        "Comida:\n" +
                                        "Ensalada de canónigos con nueces, parmesano y vinagreta de limón.\n" +
                                        "Lubina al horno con eneldo.\n" +
                                        "Media tarde: \n" +
                                        "Yogur desnatado con chocolate negro.\n" +
                                        "Cena:\n" +
                                        "Verduras salteadas al estilo tailandés.\n" +
                                        "Pollo con champiñones.\n" +
                                        "Recena: Mandarina.";
                            }
                            else{
                                int imageResource = getResources().getIdentifier("@drawable/delgado", null, getPackageName());
                                peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                                texto = "Estas normal de peso. Eres un adulto, eres deportista, " +
                                        "La clave para perder peso (o más bien grasa corporal) es generar un balance energético negativo. Es decir, consumir -de forma controlada- menos calorías de las que " +
                                        "quemamos, y que dichas calorías provengan de alimentos de \"calidad\" nutricional.\n" +
                                        "Desayuno: \n" +
                                        "Tostada integral con tomate, aceite y kiwi.\n" +
                                        "Media mañana:\n" +
                                        "Piña.\n" +
                                        "Comida:\n" +
                                        "Ensalada de canónigos con nueces, parmesano y vinagreta de limón.\n" +
                                        "Lubina al horno con eneldo.\n" +
                                        "Media tarde: \n" +
                                        "Yogur desnatado con chocolate negro.\n" +
                                        "Cena:\n" +
                                        "Verduras salteadas al estilo tailandés.\n" +
                                        "Pollo con champiñones.\n" +
                                        "Recena: Mandarina.";
                            }
                        }
                    }

                    //termina normal adulto

                    //inicia normal viejito

                    else {
                        if(estilo.equals("Sedentario")){
                            int imageResource = getResources().getIdentifier("@drawable/normal", null, getPackageName());
                            peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                            texto = "Estas normal de peso. Eres un mayor de edad, no haces nah contar con cinco a seis comidas diarias repartidas en desayuno, media mañana, almuerzo, merienda y " +
                                    "cena, todas ellas con porcentajes bajos de calorías repartidas en 20, 5, 30, 15 y 30 % respectivamente.\n" +
                                    "Desayuno\n" +
                                    "1 taza de té con leche desnatada\n" +
                                    "1 rodaja de pan integral con mermelada dietética\n" +
                                    "\n" +
                                    "Media Mañana\n" +
                                    "1 fruta fresca\n" +
                                    "\n" +
                                    "Almuerzo\n" +
                                    "1 taza de caldo dietético con salvado de avena.\n" +
                                    "1 porción de pollo sin piel.\n" +
                                    "1 porción de ensalada de lechuga y tomate.\n" +
                                    "1 fruta fresca.\n" +
                                    "\n" +
                                    "Media Tarde\n" +
                                    "1 yogur natural.\n" +
                                    "\n" +
                                    "Cena\n" +
                                    "1 porción de verduras cocidas al vapor con aceite de oliva.\n" +
                                    "1 yogur natural.";
                        }
                        else{
                            if(estilo.equals("Mixto")){
                                int imageResource = getResources().getIdentifier("@drawable/normal", null, getPackageName());
                                peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                                texto = "Estas normal de peso. Eres un mayor de edad, medio haces algo, " +
                                        " es importante saber que para que esta dieta resulte efectiva es recomendable," +
                                        " realizar actividad física 30 min, por" +
                                        " ejemplo cardio de 3 a 4 veces por semana y " +
                                        "de 2 a  3 veces por semana ejercicio para formación  y tonificación de masa muscular, como pilates o body pump.\n" +
                                        "Desayuno: \n" +
                                        "Tostada integral con tomate, aceite y kiwi.\n" +
                                        "Media mañana:\n" +
                                        "Piña.\n" +
                                        "Comida:\n" +
                                        "Ensalada de canónigos con nueces, parmesano y vinagreta de limón.\n" +
                                        "Lubina al horno con eneldo.\n" +
                                        "Media tarde: \n" +
                                        "Yogur desnatado con chocolate negro.\n" +
                                        "Cena:\n" +
                                        "Verduras salteadas al estilo tailandés.\n" +
                                        "Pollo con champiñones.\n" +
                                        "Recena: Mandarina.";
                            }
                            else{
                                int imageResource = getResources().getIdentifier("@drawable/normal", null, getPackageName());
                                peso = ContextCompat.getDrawable(getApplicationContext(), imageResource);
                                texto = "Estas normal de peso. Eres un mayor de edad, eres deportista, " +
                                        "La clave para perder peso (o más bien grasa corporal) es generar un balance energético negativo. Es decir, consumir -de forma controlada- menos calorías de las que " +
                                        "quemamos, y que dichas calorías provengan de alimentos de \"calidad\" nutricional.\n" +
                                        "Desayuno: \n" +
                                        "Tostada integral con tomate, aceite y kiwi.\n" +
                                        "Media mañana:\n" +
                                        "Piña.\n" +
                                        "Comida:\n" +
                                        "Ensalada de canónigos con nueces, parmesano y vinagreta de limón.\n" +
                                        "Lubina al horno con eneldo.\n" +
                                        "Media tarde: \n" +
                                        "Yogur desnatado con chocolate negro.\n" +
                                        "Cena:\n" +
                                        "Verduras salteadas al estilo tailandés.\n" +
                                        "Pollo con champiñones.\n" +
                                        "Recena: Mandarina.";
                            }
                        }
                    }

                    //termina normal viejito
                }
            }
        }
        viewImagen.setImageDrawable(peso);
        txtIMC.setText(texto);

    }

    public void enviarCorreo (View view){
        Intent mandarmail = new Intent(Intent.ACTION_SEND);
        mandarmail.setData(Uri.parse("mailto:"));
        mandarmail.setType("text/plain");
        mandarmail.putExtra(Intent.EXTRA_EMAIL  , new String[]{""+mail+""});
        mandarmail.putExtra(Intent.EXTRA_SUBJECT, nombre+" "+paterno+" "+materno+". Su dieta es");
        mandarmail.putExtra(Intent.EXTRA_TEXT   , texto);
        startActivity(mandarmail);

        Intent screen = new Intent(this, MainActivity.class);
        startActivity(screen);
        //elimm2000@live.com.mx
    }

}