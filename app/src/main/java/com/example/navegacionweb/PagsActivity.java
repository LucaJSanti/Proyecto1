package com.example.navegacionweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PagsActivity extends AppCompatActivity {

    private final static String HRAC = "https://hrac-argentina.org/";
    private final static String casafe = "https://www.casafe.org/?gclid=CjwKCAjwgqejBhBAEiwAuWHioIQCmokdpqcUGrfde6rYXEEybL0CCF8AZSiE_arVzxD3aekp-GVTyxoCq4sQAvD_BwE";
    private final static String aapresid = "https://www.aapresid.org.ar/rem/malezas";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pags);

        Button HRACbutton = findViewById(R.id.BotonHRAC);
        HRACbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                visitarHRAC();
            }
        });
        Button casafebutton = findViewById(R.id.BotonCasafe);
        casafebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visitarcasafe();
            }
        });
        Button aapresidbutton = findViewById(R.id.BotonAapresid);
        aapresidbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visitaraapresid();
            }
        });
    }

    private void visitarHRAC(){
        Intent i = new Intent(this,WebActivity.class);
        i.putExtra("SitioWeb",HRAC);
        startActivity(i);
    }
    private void visitarcasafe (){
        Intent i = new Intent(this,WebActivity.class);
        i.putExtra("SitioWeb",casafe);
        startActivity(i);
    }
    private void visitaraapresid (){
        Intent i = new Intent(this,WebActivity.class);
        i.putExtra("SitioWeb",aapresid);
        startActivity(i);
    }
}