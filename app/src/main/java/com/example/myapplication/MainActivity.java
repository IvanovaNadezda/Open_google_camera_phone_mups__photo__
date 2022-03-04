package com.example.myapplication;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(this);
        btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.button:
                //Открываем гугл
                String url = "https://google.com";
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
                break;
            case R.id.button2:
                //Открываем камеру
                intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
                break;
            case R.id.button3:
                //Открываем телефон
                intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
                break;
            case R.id.button4:
                //Открываем гугл карты
                Uri locate = Uri.parse("google.streetview:cbll=46.414382,10.013988");
                intent = new Intent(Intent.ACTION_VIEW, locate);
                startActivity(intent);
                break;
            }
        }
}