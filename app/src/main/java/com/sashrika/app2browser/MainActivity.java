package com.sashrika.app2browser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eturl;
    Button bt;
    String url;
    String url2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eturl = findViewById(R.id.edittext);
        bt = findViewById(R.id.bt);

        if(getIntent().getData()!=null){
          url2= String.valueOf(getIntent().getData());
            eturl.setText(url2);
        }

//         url = "https://" + eturl.getText().toString();



       // final Intent i = new Intent(this, NewActivity.class);;
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Uri uritoView = Uri.parse(url);
//                i.setAction(Intent.ACTION_VIEW);

                url = "https://" + eturl.getText().toString();

                Intent i2=new Intent(MainActivity.this,NewActivity.class);
//                i.setData(uritoView);

                Log.e("TAG", "onCreate: Main Activity "+url );
                i2.putExtra("SEARCH",url);
                startActivity(i2);
            }
        });




//        bt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                WebView myWebView = findViewById(R.id.webview);
//                myWebView.loadUrl("https://"+eturl.getText().toString());
//            }
//        });
    }
}
