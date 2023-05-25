package com.example.navegacionweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PagsActivity extends AppCompatActivity {

    private Button HRACbutton;
    private Button casafebutton;
    private Button aapresidbutton;

    private final static String HRAC = "https://hrac-argentina.org/";
    private final static String casafe = "https://www.casafe.org/?gclid=CjwKCAjwgqejBhBAEiwAuWHioIQCmokdpqcUGrfde6rYXEEybL0CCF8AZSiE_arVzxD3aekp-GVTyxoCq4sQAvD_BwE";
    private final static String aapresid = "https://www.aapresid.org.ar/rem/malezas";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pags);

        HRACbutton = findViewById(R.id.BotonHRAC);
        casafebutton = findViewById(R.id.BotonCasafe);
        aapresidbutton = findViewById(R.id.BotonAapresid);
    }

    public void visitarHRAC (View view){
        Intent i = new Intent(this,WebActivity.class);
        i.putExtra("SitioWeb",HRAC);
        startActivity(i);
    }
    public void visitarcasafe (View view){
        Intent i = new Intent(this,WebActivity.class);
        i.putExtra("SitioWeb",casafe);
        startActivity(i);
    }public void visitaraapresid (View view){
        Intent i = new Intent(this,WebActivity.class);
        i.putExtra("SitioWeb",aapresid);
        startActivity(i);
    }
}