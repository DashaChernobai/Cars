package com.example.pupil.myapplicationcars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnClose;
    Button btncreateCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView mark = findViewById(R.id.mark);
        final TextView type = findViewById(R.id.type);
        final TextView countofpeople = findViewById(R.id.countofpeople);

        btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btncreateCar = findViewById(R.id.btnCreateCar);
        btncreateCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Car car = createCar("BMW", "passeger car", "4");
                mark.setText(car.getMark());
                type.setText(car.getType());
                countofpeople.setText(car.getCountofpeople());
            }
        });

    }

    public Car createCar(String mark, String type, String countofpeople) {
        return new Car(mark,type,countofpeople);
    }

}
