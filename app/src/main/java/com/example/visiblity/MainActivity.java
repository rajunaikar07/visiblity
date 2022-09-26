package com.example.visiblity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout l11,l22;
    Button login,signup;
    View v1,v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l11=findViewById(R.id.l11);
        l22=findViewById(R.id.l22);
        login=findViewById(R.id.signin_btn);
        signup=findViewById(R.id.singup_btn);


        v1=findViewById(R.id.v1);
        v2=findViewById(R.id.v2);

//        login.setBackgroundColor(getResources().getColor(R.color.purple_200));
//        signup.setBackgroundColor(getResources().getColor(R.color.teal_700));
//        l11.setVisibility(View.VISIBLE);
//        l22.setVisibility(View.GONE);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login.setBackgroundColor(getResources().getColor(R.color.blue));

                login.setTextColor(getResources().getColor(R.color.black));
                signup.setTextColor(getResources().getColor(R.color.white));
                signup.setBackgroundColor(getResources().getColor(R.color.yellow));
                l11.setVisibility(View.VISIBLE);
                l22.setVisibility(View.GONE);


                v1.setBackgroundColor(getResources().getColor(R.color.gray));

                v1.setVisibility(View.VISIBLE);
                v2.setVisibility(View.GONE);
            }

        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signup.setBackgroundColor(getResources().getColor(R.color.blue));

                signup.setTextColor(getResources().getColor(R.color.black));

                login.setTextColor(getResources().getColor(R.color.white));


                login.setBackgroundColor(getResources().getColor(R.color.yellow));
                l22.setVisibility(View.VISIBLE);
                l11.setVisibility(View.GONE);

                v2.setBackgroundColor(getResources().getColor(R.color.gray));

                v2.setVisibility(View.VISIBLE);
                v1.setVisibility(View.GONE);

            }
        });

    }
}