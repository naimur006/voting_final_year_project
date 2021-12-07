package com.example.voting_final_year_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class votingpanel extends AppCompatActivity implements View.OnClickListener {
    private Button forget_password, create_account;
    private ImageView login_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_votingpanel );

        forget_password = findViewById ( R.id.forget_password );
        create_account = findViewById ( R.id.create_account );
        login_back = findViewById ( R.id.login_back_button );

        forget_password.setOnClickListener ( this );
        create_account.setOnClickListener ( this );
        login_back.setOnClickListener ( this );


    }

    @Override
    public void onClick(View v) {
        Intent i;
        //use switch case
        switch (v.getId ()) {
            case R.id.forget_password:
                i = new Intent ( this , forgetpassword.class );
                startActivity ( i );
                break;
            case R.id.create_account:
                i = new Intent ( this , signup_activity.class );
                startActivity ( i );
                break;

            case R.id.login_back_button:
                i = new Intent ( this , mainscreen.class );
                startActivity ( i );
                break;

        }
    }
}





