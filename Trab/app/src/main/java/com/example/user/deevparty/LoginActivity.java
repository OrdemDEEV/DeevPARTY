package com.example.user.deevparty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Pegar elementos do front end;
        btnEntrar = (Button)findViewById(R.id.btnEntrar);

        // Eventos Botoes;
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RedirecionaMain();
            }
        });

    }

    private  void RedirecionaMain(){
        Intent it = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(it);
    }

    public void CadastroUsuarioClick(View view) {
        Intent it = new Intent(LoginActivity.this, CadastroActivity.class);
        startActivity(it);
    }
}
