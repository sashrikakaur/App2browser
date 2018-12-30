package com.sashrika.app2browser;

import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;
import android.widget.Button;

public class NewActivity extends AppCompatActivity {
WebView myWebView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);
        String i = getIntent().getStringExtra("SEARCH");
        Log.e("TAG", "onCreate: New Activity "+i );
        myWebView = findViewById(R.id.webview2);
        myWebView.loadUrl(i);
    }
}
