package com.example.myapp4_calculadora_simple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_valor1);
        et2 = (EditText)findViewById(R.id.txt_valor2);
        rb1 = (RadioButton)findViewById(R.id.rb_sumar);
        rb2 = (RadioButton)findViewById(R.id.rb_restar);
        rb3 = (RadioButton)findViewById(R.id.rb_multiplicar);
        rb4 = (RadioButton)findViewById(R.id.rb_dividir);
        tv1 = (TextView)findViewById(R.id.txt_calcular);
    }

    //metodo para calcular

    public void calcular(View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        if(rb1.isChecked() == true){
            int suma = valor1_int + valor2_int;
            String total = String.valueOf(suma);
            tv1.setText(total);
        }else if (rb2.isChecked() == true){
            int resta = valor1_int - valor2_int;
            String total = String.valueOf(resta);
            tv1.setText(total);
        }else if(rb3.isChecked() == true){
            int multiplicacion = valor1_int * valor2_int;
            String total = String.valueOf(multiplicacion);
            tv1.setText(total);
        }else if (rb4.isChecked() == true){
            if (valor2_int != 0){
                int dividir = valor1_int / valor2_int;
                String total = String.valueOf(dividir);
                tv1.setText(total);
            }else {
                Toast.makeText(this,"No se puede dividir por 0",Toast.LENGTH_LONG).show();

            }


        }





    }




}