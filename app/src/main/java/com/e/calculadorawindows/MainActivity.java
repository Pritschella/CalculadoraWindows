package com.e.calculadorawindows;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText entrada, lectura;
    public Button btnMenos, btnPorcentaje, btnRaiz, btnPotencia, btnDivisionx, btnCE, btnC, btnBorrar, btnDivision,
    btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0, btnMultiplicacion, btnResta, btnSuma, btnPunto, btnIgual;

    byte botonPulsado=0;
    double memoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // lectura=findViewById(R.id.lectura);
        //entrada=findViewById(R.id.entrada);

        btn1 = findViewById(R.id.btn_1);
        btn1.setOnClickListener((View.OnClickListener) this);
        btn2 = findViewById(R.id.btn_2);
        btn2.setOnClickListener((View.OnClickListener) this);
        btn3 = findViewById(R.id.btn_3);
        btn3.setOnClickListener((View.OnClickListener) this);
        btn4 = findViewById(R.id.btn_4);
        btn4.setOnClickListener((View.OnClickListener) this);
        btn5 = findViewById(R.id.btn_5);
        btn5.setOnClickListener((View.OnClickListener) this);
        btn6 = findViewById(R.id.btn_6);
        btn6.setOnClickListener((View.OnClickListener) this);
        btn7 = findViewById(R.id.btn_7);
        btn7.setOnClickListener((View.OnClickListener) this);
        btn8 = findViewById(R.id.btn_8);
        btn8.setOnClickListener((View.OnClickListener) this);
        btn9 = findViewById(R.id.btn_9);
        btn9.setOnClickListener((View.OnClickListener) this);
        btn0 = findViewById(R.id.btn_cero);
        btn0.setOnClickListener((View.OnClickListener) this);

        btnBorrar = findViewById(R.id.btn_borrar);
        btnBorrar.setOnClickListener((View.OnClickListener)this);
        btnSuma=findViewById(R.id.btn_mas);
        btnSuma.setOnClickListener((View.OnClickListener)this);
        btnResta=findViewById(R.id.btn_menos);
        btnResta.setOnClickListener((View.OnClickListener)this);

        //btnM=findViewById(R.id.btn_m*);
        //btnM.setOnClickListener((View.OnClickListener)this);

        btnPorcentaje=findViewById(R.id.btn_porcentaje);
        btnPorcentaje.setOnClickListener((View.OnClickListener)this);
        btnRaiz=findViewById(R.id.btn_raiz);
        btnRaiz.setOnClickListener((View.OnClickListener)this);
        btnPotencia=findViewById(R.id.btn_x_cuadrada);
        btnPotencia.setOnClickListener((View.OnClickListener)this);
        btnDivisionx=findViewById(R.id.btn_1_entre_x);
        btnDivisionx.setOnClickListener((View.OnClickListener)this);

        btnCE=findViewById(R.id.btn_ce);
        btnCE.setOnClickListener((View.OnClickListener)this);
        btnC=findViewById(R.id.btn_c);
        btnC.setOnClickListener((View.OnClickListener)this);
        btnBorrar=findViewById(R.id.btn_borrar);
        btnBorrar.setOnClickListener((View.OnClickListener)this);
        btnDivision=findViewById(R.id.btn_division);
        btnDivision.setOnClickListener((View.OnClickListener)this);
        btnMultiplicacion=findViewById(R.id.btn_multiplicacion);
        btnMultiplicacion.setOnClickListener((View.OnClickListener)this);
        btnMenos.setOnClickListener((View.OnClickListener)this);
       //btnMas=findViewById(R.id.btnM+);
        btnPunto=findViewById(R.id.btn_punto);
        btnPunto.setOnClickListener((View.OnClickListener)this);
        btnIgual=findViewById(R.id.btn_igual);
        btnIgual.setOnClickListener((View.OnClickListener)this);

    }

    public void onClick(View v){
        int click = v.getId();

        if (click== R.id.btn_1){
            entrada.setText(entrada.getText()+"1");
        }

        if (click== R.id.btn_2){
            entrada.setText(entrada.getText()+"1");
        }

        if (click== R.id.btn_3){
            entrada.setText(entrada.getText()+"1");
        }

        if (click== R.id.btn_4){
            entrada.setText(entrada.getText()+"1");
        }
        if (click== R.id.btn_5){
            entrada.setText(entrada.getText()+"1");
        }
        if (click== R.id.btn_6){
            entrada.setText(entrada.getText()+"1");
        }
        if (click== R.id.btn_7){
            entrada.setText(entrada.getText()+"1");
        }
        if (click== R.id.btn_8){
            entrada.setText(entrada.getText()+"1");
        }        if (click== R.id.btn_1){
            entrada.setText(entrada.getText()+"1");
        }
        if (click== R.id.btn_9){
            entrada.setText(entrada.getText()+"1");
        }
        if (click== R.id.btn_cero){
            entrada.setText(entrada.getText()+"1");
        }

        if (click== R.id.btn_punto){
            int cont=0;
            for (int i=0; i < entrada.getText().length();i++){
                if (entrada.getText().toString().substring(i, i+1).equals(".")){cont++;}

            }

            if (cont==0){
                entrada.setText(entrada.getText()+".");
            }
        }

        double num1, num2;
        if (click==R.id.btn_mas){

            botonPulsado=1;
            if (lectura.getText().toString().equals("")) {
                num2 = 0;
            } else {
                num2 = Double.parseDouble(lectura.getText().toString());
            }

            num1 = Double.parseDouble(entrada.getText().toString());
            double resp = num2 + num1;
            entrada.setText("");
            lectura.setText(String.valueOf(resp));

        }

        if (click == R.id.btn_menos) {
            botonPulsado=2;
            if (lectura.getText().toString().equals("")) {
                num2 = 0;
            } else {
                num2 = Double.parseDouble(lectura.getText().toString());
            }

            num1 = Double.parseDouble(entrada.getText().toString());
            double resp = num1 - num2;
            entrada.setText("");
            lectura.setText(String.valueOf(resp));
        }

        if (click == R.id.btn_multiplicacion) {
            botonPulsado=3;
            if(lectura.getText().toString().equals("")) {
                num1=1;
            }else {
                num1=Double.parseDouble(lectura.getText().toString());
            }
            if(entrada.getText().toString().equals("")) {
                num2=1;
            }else {
                num2=Double.parseDouble(entrada.getText().toString());
            }
            double res= num1*num2;
            lectura.setText(String.valueOf(res));
            entrada.setText("");
        }

        if (click == R.id.btn_division) {
            botonPulsado=4;
            if(lectura.getText().toString().equals("")) {
                double x=Double.parseDouble(entrada.getText().toString())*Double.parseDouble(entrada.getText().toString());
                lectura.setText(String.valueOf(x));
                entrada.setText(entrada.getText().toString());
            }

            num1=Double.parseDouble(lectura.getText().toString());
            num2=Double.parseDouble(entrada.getText().toString());
            double res=num1/num2;
            lectura.setText(String.valueOf(res));
            entrada.setText("");

        }

        if (click == R.id.btn_raiz) {
            if(entrada.getText().toString().equals("")){
                entrada.setText("0");
            }else {
                num1 = Double.parseDouble(entrada.getText().toString());
                double resp = Math.sqrt(num1);
                entrada.setText(String.valueOf(resp));
            }
        }

        if(click==R.id.btn_1_entre_x){
            if(entrada.getText().toString().equals("")){
                entrada.setText("0");
            }else{
                num1 = Double.parseDouble(entrada.getText().toString());
                double res = 1 / num1;
                entrada.setText(String.valueOf(res));
            }
        }

        if(click==R.id.btn_porcentaje){
            botonPulsado=5;
            if(lectura.getText().toString().equals("")){
                lectura.setText(entrada.getText().toString());
                entrada.setText("");
            }else{
                num1 = Double.parseDouble(lectura.getText().toString());
                num2 = Double.parseDouble(entrada.getText().toString());
                double res = num1 % num2;
                entrada.setText(String.valueOf(res));
            }
        }

        if(click==R.id.btn_x_cuadrada){
            if(entrada.getText().toString().equals("")){
                entrada.setText("0");
            }else {
                num1 = Double.parseDouble(entrada.getText().toString());
                double res = num1 * num1;
                entrada.setText(String.valueOf(res));
            }
        }

        if(click==R.id.btn_igual){
            if(botonPulsado==1) {
                double n1=Double.parseDouble(lectura.getText().toString());
                double n2=Double.parseDouble(entrada.getText().toString());
                double res=n1+n2;
                entrada.setText(String.valueOf(res));
                lectura.setText("");
            }
            if(botonPulsado==2) {
                double n1=Double.parseDouble(lectura.getText().toString());
                double n2=Double.parseDouble(entrada.getText().toString());
                double res=n1-n2;
                entrada.setText(String.valueOf(res));
                lectura.setText("");
            }
            if(botonPulsado==3) {
                double n1=Double.parseDouble(lectura.getText().toString());
                double n2=Double.parseDouble(entrada.getText().toString());
                double res=n1*n2;
                entrada.setText(String.valueOf(res));
                lectura.setText("");
            }

            if(botonPulsado==4) {
                double n1=Double.parseDouble(lectura.getText().toString());
                double n2=Double.parseDouble(entrada.getText().toString());
                double res=n1/n2;
                entrada.setText(String.valueOf(res));
                lectura.setText("");
            }
            if(botonPulsado==5) {
                if(lectura.getText().toString().equals("")){
                    lectura.setText(entrada.getText().toString());
                    entrada.setText("");
                }else{
                    num1 = Double.parseDouble(lectura.getText().toString());
                    num2 = Double.parseDouble(entrada.getText().toString());
                    double res = num1 % num2;
                    entrada.setText(String.valueOf(res));
                }
            }
        }
        if(click==R.id.btn_mas_menos){
            double num=Double.parseDouble(entrada.getText().toString())*-1;
            entrada.setText(String.valueOf(num));
        }
        if(click==R.id.btn_c){
            lectura.setText("");
            entrada.setText("0");
        }
        if(click==R.id.btn_ce){
            entrada.setText("0");
        }
        if(click==R.id.btn_borrar){
            if(entrada.getText().toString().equals("") ){
                entrada.setText("0");
            }else {
                String cadena = entrada.getText().toString();
                cadena = cadena.substring(0, cadena.length() - 1);
                entrada.setText(cadena);
            }
        }



    }
}
