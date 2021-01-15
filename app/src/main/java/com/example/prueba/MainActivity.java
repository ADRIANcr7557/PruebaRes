package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {


   private double val1;
   private int tipo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtResult= findViewById(R.id.txtResult);;

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonsum = findViewById(R.id.buttonsum);
        Button buttonrest = findViewById(R.id.buttonrest);
        Button buttonmult = findViewById(R.id.buttonmult);
        Button buttondiv = findViewById(R.id.buttondiv);
        Button buttonresultado = findViewById(R.id.buttonresultado);
















        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Hola mundo", Toast.LENGTH_SHORT).show();
                txtResult.append("1");

            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this, "Hola mundo", Toast.LENGTH_SHORT).show();
                txtResult.append("2");

            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this, "Hola mundo", Toast.LENGTH_SHORT).show();
                txtResult.append("3");

            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this, "Hola mundo", Toast.LENGTH_SHORT).show();
                txtResult.append("4");

            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this, "Hola mundo", Toast.LENGTH_SHORT).show();
                txtResult.append("5");

            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this, "Hola mundo", Toast.LENGTH_SHORT).show();
                txtResult.append("6");

            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this, "Hola mundo", Toast.LENGTH_SHORT).show();
                txtResult.append("7");

            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this, "Hola mundo", Toast.LENGTH_SHORT).show();
                txtResult.append("8");

            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this, "Hola mundo", Toast.LENGTH_SHORT).show();
                txtResult.append("9");

            }
        });
        buttonsum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

               tipo = 1;
               String valor = txtResult.getText().toString();
               val1 = Double.parseDouble(valor);
               txtResult.setText("");
            }
        });
        buttonrest.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tipo = 2;
                String valor = txtResult.getText().toString();
                val1 = Double.parseDouble(valor);
                txtResult.setText("");
                //Toast.makeText(MainActivity.this, "Hola mundo", Toast.LENGTH_SHORT).show();


            }
        });
        buttonmult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                tipo 3;
                String valor = txtResult.getText().toString();
                val1 =  Double.parseDouble(valor);

                txtResult.setText("");
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this, "Hola mundo", Toast.LENGTH_SHORT).show();
                txtResult.append("/");

            }
        });
        buttonresultado.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String valor = txtResult.getText().toString();
                double val2 = Double.parseDouble(valor);
                double resultado = 0.0;
                if (tipo == 1){
                    resultado = val1 + val2;


                }else if (tipo ==2){
                    resultado = val1 - val2;
                }
                String rest = String.valueOf(resultado);
                txtResult.setText(rest);


                //Toast.makeText(MainActivity.this, "Hola mundo", Toast.LENGTH_SHORT).show();


            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }


}
