package com.example.butooncustom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast = new Toast(getApplication());
                View view = getLayoutInflater().inflate(R.layout.custon_toast,(ViewGroup) findViewById(R.id.lineLayout));
                toast.setView(view);
                TextView txt = view.findViewById(R.id.txtView);
                txt.setText("I LOVE YOU DEAR");

               toast.setGravity(Gravity.TOP,0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();

                String tag = "neww";
                Log.d(tag, "THIS IS FIRST LOG ");

            }
        });
    }
}