package com.example.practical_4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox check1, check2,check3,check4,check5;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick() {
        check1 = (CheckBox)findViewById(R.id.chocolate_syrup);
        check2 = (CheckBox)findViewById(R.id.Sprinkles);
        check3 = (CheckBox)findViewById(R.id.crushed_nuts);
        check4 = (CheckBox)findViewById(R.id.cherries);
        check5 = (CheckBox)findViewById(R.id.orio_cookie_crumbles);
        button = (Button)findViewById(R.id.show_toast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer result = new StringBuffer();
                result.append("Toppings: ");
                if(check1.isChecked()){
                    result.append(getString(R.string.chocolate_syrup) + " ");
                }
                if(check2.isChecked()){
                    result.append(getString(R.string.Sprinkles) + " ");
                }
                if(check3.isChecked()){
                    result.append(getString(R.string.crushed_nuts) + " ");
                }
                if(check4.isChecked()){
                    result.append(getString(R.string.cherries) + " ");
                }
                if(check5.isChecked()){
                    result.append(getString(R.string.orio_cookie_crumbles));
                }
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
