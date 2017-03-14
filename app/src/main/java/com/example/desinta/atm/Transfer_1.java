package com.example.desinta.atm;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Desinta on 23-Feb-17.
 */

public class Transfer_1 extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btndel, btnok;
    EditText editRekening;
    String transfer = "";
    AlertDialog sukses;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer1);

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
        editRekening = (EditText) findViewById(R.id.editRekening);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "0";
                editRekening.setText(transfer);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "1";
                editRekening.setText(transfer);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "2";
                editRekening.setText(transfer);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "3";
                editRekening.setText(transfer);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "4";
                editRekening.setText(transfer);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "5";
                editRekening.setText(transfer);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "6";
                editRekening.setText(transfer);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "7";
                editRekening.setText(transfer);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "8";
                editRekening.setText(transfer);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "9";
                editRekening.setText(transfer);
            }
        });
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer = "";
                editRekening.setText(transfer);
            }
        });
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean valid;
                if (transfer.equals("")) {
                    editRekening.setError("Masukkan No. Rekening dengan Benar!");
                    valid = (false);
                } else {
                    int e = Integer.parseInt(transfer);
                    if (editRekening.length() != 9) {
                        editRekening.setError("No Rekening Harus 9 Digit!");
                        valid = (false);
                    } else {
                        AlertDialog ad = new AlertDialog.Builder(Transfer_1.this).create();
                        ad.setCancelable(false); // This blocks the 'BACK' button
                        ad.setMessage("Transfer Sukses!!");
                        ad.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Intent i = new Intent(Transfer_1.this, Pilihanbank.class);
                                startActivity(i);
                            }
                        }, 10000);
                    }
                }
            }
        });
    }

    public void onBackPressed() {

    }
}

