package com.example.imagebuttons;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnC =
                (ImageButton)findViewById(R.id.btnC);

        ImageButton btnCC =
                (ImageButton)findViewById(R.id.btnCC);

        ImageButton btnArduino =
                (ImageButton)findViewById(R.id.btnArduino);

        ImageButton btnPHP =
                (ImageButton)findViewById(R.id.btnPHP);

        ImageButton btnSQL =
                (ImageButton)findViewById(R.id.btnSQL);

        ImageButton btnRuby =
                (ImageButton)findViewById(R.id.btnRuby);

        ImageButton btnJS =
                (ImageButton)findViewById(R.id.btnJS);

        ImageButton btnJava =
                (ImageButton)findViewById(R.id.btnJava);


        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button C ",Toast.LENGTH_LONG).show();
            }
        });

        btnCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button C++ ",Toast.LENGTH_LONG).show();
            }
        });

        btnArduino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button Arduino",Toast.LENGTH_LONG).show();
            }
        });

        btnJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button Java ",Toast.LENGTH_LONG).show();
            }
        });

        btnJS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button Java Script ",Toast.LENGTH_LONG).show();
            }
        });

        btnRuby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button Ruby ",Toast.LENGTH_LONG).show();
            }
        });

        btnPHP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button PHP ",Toast.LENGTH_LONG).show();
            }
        });

        btnSQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button SQL ",Toast.LENGTH_LONG).show();
            }
        });




    }
}