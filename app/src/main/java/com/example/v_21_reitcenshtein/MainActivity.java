package com.example.v_21_reitcenshtein;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnCreat;
    private ImageView Im;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCreat = (Button) findViewById(R.id.btnCreat);

        btnCreat = (Button) findViewById(R.id.btnCreat);
    }

    @Override
    public void onClick (View view) {
        switch (view.getId()){
            case R.id.btnCreat:
                Im = findViewById(R.id.imagv);
                Im.setVisibility(ImageView.VISIBLE);
                break;
        }
    }
}