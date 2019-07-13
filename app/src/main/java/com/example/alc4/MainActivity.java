package com.example.alc4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button andela;
    private Button profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        andela = (Button) findViewById(R.id.andela);
        profile = (Button) findViewById(R.id.profile);

        andela.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivityB();

            }

        });
            };
    public void openActivityB(){
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);

        profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivityC();

            }

        });
    };
    public void openActivityC(){
        Intent intent = new Intent(this, ActivityC.class);
        startActivity(intent);
    }



}
