package com.example.calcuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private Button cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, igual, mas, menos, por, dividir, clear, punto;
    private TextView textView, textview2;

    private double valor1, valor2;
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
                textview2.setText(null);
            }
        });

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText() + "0");
                textView.setText(null);
            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText() + "1");
                textView.setText(null);
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText() + "2");
                textView.setText(null);
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText() + "3");
                textView.setText(null);
            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText() + "4");
                textView.setText(null);
            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText() + "5");
                textView.setText(null);
            }
        });

        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText() + "6");
                textView.setText(null);
            }
        });

        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText() + "7");
                textView.setText(null);

            }
        });

        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText() + "8");
                textView.setText(null);
            }
        });

        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText() + "9");
                textView.setText(null);
            }
        });

        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textview2.setText(textView.getText() + "+");

            }
        });

        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(textview2.getText() + ".");
            }
        });

        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             if(textview2.getText().length() != 0){
                 valor1 = Float.parseFloat(textview2.getText().toString()+"");
                 suma = true;

                 textView.setText("+");
                 textview2.setText(null);
             }

                if(textView == null){
                    valor1 = Float.parseFloat(textView.getText() + "");
                    suma = true;

                    textView.setText("+");
                    textview2.setText(null);
                }


            }
        });

        por.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String signoMultiplicaciin = "*";

                if (textview2 == null) {
                    textview2.setText("");

                } else {
                    valor1 = Float.parseFloat(textview2.getText() + "");
                    multiplicacion = true;
                    textview2.setText(null);
                }
                textView.setText(signoMultiplicaciin);
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String signoMDivision = "/";

                if (textview2 == null) {
                    textview2.setText("");

                } else {
                    valor1 = Float.parseFloat(textview2.getText() + "");
                    division = true;
                    textview2.setText(null);
                }
                textView.setText(signoMDivision);

            }
        });

        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String signoMenos = "-";

                if (textview2 == null) {
                    textview2.setText("");

                } else {
                    valor1 = Float.parseFloat(textview2.getText() + "");
                    resta = true;
                    textview2.setText(null);
                }

                textView.setText(signoMenos);
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor2 = Float.parseFloat(textview2.getText()+"");

                if (suma == true) {
                    textView.setText(valor1 + valor2 + "");
                    suma = false;

                }
                if (multiplicacion == true) {
                    textView.setText(valor1 * valor2 + "");
                    multiplicacion = false;
                }

                if (division == true) {
                    textView.setText(valor1 / valor2 + "");
                    division = false;
                }

                if (resta == true) {
                    textView.setText(valor1 - valor2 + "");
                    resta = false;
                }

                textview2.setText("");
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
