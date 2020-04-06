package com.example.nacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMercadoLivre(View view) {
        Intent intent = new Intent(this, MercadoLivreActivity.class);
        startActivity(intent);
    }

    public void onBuscape(View view) {
        Intent intent = new Intent(this, onBuscape.class);
        startActivity(intent);
    }

    public void onSubmarino(View view) {
        Intent intent = new Intent(this, SubmarinoActivity.class);
        startActivity(intent);
    }

    public void onMagalu(View view) {
        Intent intent = new Intent(this, Magalu.class);
        startActivity(intent);
    }

    public void onLojasAmericanas(View view) {
        Intent intent = new Intent(this, LojasAmericanas.class);
        startActivity(intent);
    }

    public void onSobre(View view) {
        Intent intent = new Intent(this, SobreActivity.class);
        startActivity(intent);
    }

}
