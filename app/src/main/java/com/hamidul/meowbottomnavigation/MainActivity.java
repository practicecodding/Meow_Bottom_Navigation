package com.hamidul.meowbottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MainActivity extends AppCompatActivity {

    private MeowBottomNavigation bottomNavigation;
    RelativeLayout bSetting,bHome,bPerson,mainLayout;
    EditText editText;
    Button button;
    TextView dp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setStatusBarColor(Color.parseColor("#009688"));
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottomNavigation);
        bSetting = findViewById(R.id.setting);
        bHome = findViewById(R.id.home);
        bPerson = findViewById(R.id.person);
        mainLayout = findViewById(R.id.mainLayout);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        dp = findViewById(R.id.dp);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String display = editText.getText().toString();
                dp.setText(""+display);

            }
        });

        bottomNavigation.show(2,true);


        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.setting));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.home));
        bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.person));


        bottomNavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {

                switch (model.getId()){

                    case 1:

                        bSetting.setVisibility(View.VISIBLE);
                        bHome.setVisibility(View.GONE);
                        bPerson.setVisibility(View.GONE);

                        getWindow().setNavigationBarColor(Color.parseColor("#673AB7"));
                        bottomNavigation.setBackgroundBottomColor(Color.parseColor("#673AB7"));
                        bottomNavigation.setSelectedIconColor(Color.parseColor("#673AB7"));
                        getWindow().setStatusBarColor(Color.parseColor("#673AB7"));
                        mainLayout.setBackgroundColor(Color.parseColor("#ffffff"));

                        break;

                    case 2:

                        bSetting.setVisibility(View.GONE);
                        bHome.setVisibility(View.VISIBLE);
                        bPerson.setVisibility(View.GONE);

                        getWindow().setNavigationBarColor(Color.parseColor("#009688"));
                        bottomNavigation.setBackgroundBottomColor(Color.parseColor("#009688"));
                        bottomNavigation.setSelectedIconColor(Color.parseColor("#009688"));
                        getWindow().setStatusBarColor(Color.parseColor("#009688"));
                        mainLayout.setBackgroundColor(Color.parseColor("#ffffff"));

                        break;

                    case 3:

                        bSetting.setVisibility(View.GONE);
                        bHome.setVisibility(View.GONE);
                        bPerson.setVisibility(View.VISIBLE);

                        getWindow().setNavigationBarColor(Color.parseColor("#00BCD4"));
                        bottomNavigation.setBackgroundBottomColor(Color.parseColor("#00BCD4"));
                        bottomNavigation.setSelectedIconColor(Color.parseColor("#00BCD4"));
                        getWindow().setStatusBarColor(Color.parseColor("#00BCD4"));
                        mainLayout.setBackgroundColor(Color.parseColor("#ffffff"));

                        break;

                }
                return null;
            }
        });

        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {

                switch (model.getId()){

                    case 1:

                        bSetting.setVisibility(View.VISIBLE);
                        bHome.setVisibility(View.GONE);
                        bPerson.setVisibility(View.GONE);

                        break;
                }

                return null;
            }
        });

        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {

                switch (model.getId()){

                    case 2:

                        bSetting.setVisibility(View.GONE);
                        bHome.setVisibility(View.VISIBLE);
                        bPerson.setVisibility(View.GONE);

                        break;
                }

                return null;
            }
        });

        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {

                switch (model.getId()){

                    case 3:

                        bSetting.setVisibility(View.GONE);
                        bHome.setVisibility(View.GONE);
                        bPerson.setVisibility(View.VISIBLE);

                        break;
                }

                return null;
            }
        });



    }
}