package com.example.gameconstruct2;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    WebView webView;
    WebSettings webSettings;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webView);
        webSettings = webView.getSettings();
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://sekolahinformatikaa.blogspot.com/");
    }
}