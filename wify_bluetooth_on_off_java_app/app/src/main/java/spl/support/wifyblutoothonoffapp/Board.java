package spl.support.wifyblutoothonoffapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Board extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnZero,btnDot,btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn7=(Button)findViewById(R.id.button7);
        btn8=(Button)findViewById(R.id.button8);
        btn9=(Button)findViewById(R.id.button9);
        btnZero=(Button)findViewById(R.id.buttonZero);
        btnDot=(Button)findViewById(R.id.buttonDot);
        btnOk=(Button)findViewById(R.id.buttonOk);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getValue("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getValue("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getValue("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getValue("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getValue("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getValue("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getValue("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getValue("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getValue("9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getValue("0");
            }
        });
        btnOk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getValue("OK");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getValue(".");
            }
        });
    }

   private void getValue(String clickValue){
       Toast.makeText(getApplicationContext(), "value is : "+clickValue, Toast.LENGTH_LONG).show();
   }

}