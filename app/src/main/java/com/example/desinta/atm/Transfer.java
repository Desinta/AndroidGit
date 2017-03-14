package com.example.desinta.atm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Desinta on 23-Feb-17.
 */

public class Transfer extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btndel, btnok;
    EditText editTransfer;
    String transfer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btndel = (Button) findViewById(R.id.btndel);
        btnok = (Button) findViewById(R.id.btnok);
        editTransfer = (EditText) findViewById(R.id.editRekening);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "0";
                editTransfer.setText(transfer);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "1";
                editTransfer.setText(transfer);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "2";
                editTransfer.setText(transfer);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "3";
                editTransfer.setText(transfer);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "4";
                editTransfer.setText(transfer);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "5";
                editTransfer.setText(transfer);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "6";
                editTransfer.setText(transfer);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "7";
                editTransfer.setText(transfer);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "8";
                editTransfer.setText(transfer);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "9";
                editTransfer.setText(transfer);
            }
        });
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer = "";
                editTransfer.setText(transfer);
            }
        });
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean valid;
                if (transfer.equals("")) {
                    editTransfer.setError("Masukkan Jumlah Dengan Benar!");
                    valid = (false);
                } else {
                    int e = Integer.parseInt(transfer);
                    if (e < 50000) {
                        editTransfer.setError("Transfer Minimal Rp 50.000!");
                        valid = (false);
                    } else {
                        Intent i = new Intent(Transfer.this, Transfer_1.class);
                        startActivity(i);
                    }
                }
            }
        });
    }
}


