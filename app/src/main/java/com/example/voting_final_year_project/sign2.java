package com.example.voting_final_year_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class sign2 extends AppCompatActivity {

    //variables
    ImageView backBtn;
    Button next;
    TextView textTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_sign2 );


        //Hooks
        backBtn = findViewById ( R.id.signup_back_button );
        next = findViewById ( R.id.signup_next_button );
        textTitle = findViewById ( R.id.signup_title );
    }

    public void callNextSignupScreen(View view){

        Intent intent = new Intent (getApplicationContext (),sign2.class);

        //Add transition
        Pair[] pairs = new Pair[3];

        pairs[0] = new Pair<View,String>(backBtn,"transition_back_arrow_btn");
        pairs[1] = new Pair<View,String>(next,"transition_next_btn");
        pairs[2] = new Pair<View,String>(textTitle,"transition_title_text");

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation ( sign2.this,pairs );
        startActivity ( intent,options.toBundle () );

    }


}