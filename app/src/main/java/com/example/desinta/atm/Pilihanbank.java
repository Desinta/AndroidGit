package com.example.desinta.atm;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Desinta on 23-Feb-17.
 */

public class Pilihanbank extends AppCompatActivity {
    Button btnceksaldo, btntarik, btnsetor, btntransfer, btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihanbank);

        btnceksaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pilihanbank.this, Ceksaldo.class);
                startActivity(i);
            }
        });

        btntarik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pilihanbank.this, Penarikan.class);

                startActivity(i);
            }

        });
        btnsetor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pilihanbank.this, Penyetoran.class);
                startActivity(i);
            }
        });
        btntransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pilihanbank.this, Transfer.class);
                startActivity(i);
            }
        });

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Pilihanbank.this);
                builder.setMessage("Apakah Anda Ingin keluar?")
                        .setCancelable(false)
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                moveTaskToBack(true);
                                Pilihanbank.this.finish();
                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            //methode ini hasil dari create metod pada OnClickListener
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }).show();
            }
        });
    }

    public void onBackPressed() {

    }
}

