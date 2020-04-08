package com.example.calcuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private Button cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, igual, mas, menos, por, dividir,clear,punto;
    private TextView textView, textview2;

    private double valor1 , valor2;
    private boolean suma, resta, multiplicacion, division;

    //@BindView(R.id.btn_cero) Button cero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ButterKnife.bind(this);

        setUIViews();


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(null);
            }
        });

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText().toString()+"0");
            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText()+"1");
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText()+"2");
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText()+"3");
            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText()+"4");
            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText()+"5");
            }
        });

        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText()+"6");
            }
        });

        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText()+"7");
            }
        });

        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText()+"8");
            }
        });

        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText()+"9");
            }
        });

        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textview2.setText(textView.getText()+"+");


            }
        });

//        mas.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (textview2 != null){
//
//                    valor1 = Float.parseFloat(textview2.getText() + "");
//                    suma = true;
//                    textView.setText(null);
//                } else {
//                    textView.setText("+");
//
//                }
//            }
//        });

        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    valor1 = Float.parseFloat(textview2.getText() + "");
                    suma = true;
                    textView.setText(null);

            }
        });



        por.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"*");
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"/");
            }
        });

        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+".");
            }
        });



        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor2 = Float.parseFloat(textView.getText()+"");

                if (suma == true){
                    textView.setText(valor1 + valor2 + "");
                    suma = false;



                }


            }
        });

    }

    private void setUIViews() {
            textView = findViewById(R.id.text_view);
            textview2 = findViewById(R.id.text_view2);
            clear = findViewById(R.id.clear);
            cero = findViewById(R.id.btn_cero);
            uno = findViewById(R.id.btn_uno);
            dos = findViewById(R.id.btn_dos);
            tres = findViewById(R.id.btn_tres);
            cuatro = findViewById(R.id.btn_cuatro);
            cinco = findViewById(R.id.btn_cinco);
            seis = findViewById(R.id.btn_seis);
            siete = findViewById(R.id.btn_siete);
            ocho = findViewById(R.id.btn_ocho);
            nueve = findViewById(R.id.btn_nueve);
            igual = findViewById(R.id.btn_igual);
            mas = findViewById(R.id.btn_mas);
            menos = findViewById(R.id.btn_menos);
            por = findViewById(R.id.btn_por);
            dividir = findViewById(R.id.btn_dividir);
            punto = findViewById(R.id.btn_punto);
    }

}
