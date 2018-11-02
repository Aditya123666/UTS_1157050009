package com.aditya.lenovo.kopigunungtilu.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aditya.lenovo.kopigunungtilu.MainActivity;
import com.aditya.lenovo.kopigunungtilu.R;

public class Login extends AppCompatActivity {
    Button loginnew,daftarnew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button loginnew = (Button) (findViewById(R.id.btnlogin));
        Button daftarnew = (Button) (findViewById(R.id.btndaftar));

        loginnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this,MainActivity.class);
                startActivity(i);
            }
        });
        daftarnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this,DaftarHarga.class);
                startActivity(i);
            }
        });
    }
}
