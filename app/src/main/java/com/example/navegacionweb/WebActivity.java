package com.example.navegacionweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {
    WebView WebView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView1 = (WebView)findViewById(R.id.WebView1);
        String URL = getIntent().getStringExtra("SitioWeb");

        WebSettings webSettings = WebView1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        WebView1.setWebViewClient(new WebViewClient());
        WebView1.loadUrl(URL);
    }
}