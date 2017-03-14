package com.example.desinta.atm;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Desinta on 23-Feb-17.
 */

public class Ceksaldo extends AppCompatActivity {
    Button btn1;
    TextView txtView;
    String saldo = "";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceksaldo);

        btn1 = (Button) findViewById(R.id.btn1);
        txtView = (TextView) findViewById(R.id.txtView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Ceksaldo.this);
                builder.setMessage("Apakah Anda Ingin Melakukan Transaksi Lagi?")
                        .setCancelable(false)
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Ceksaldo.this, Pilihanbank.class);
                                startActivity(i);
                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            //methode ini hasil dari create metod pada OnClickListener
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                moveTaskToBack(true);
                                Ceksaldo.this.finish();
                            }
                        }).show();
            }
        });
    }

    public void onBackPressed() {

    }
}




