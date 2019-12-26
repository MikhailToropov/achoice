package com.example.achoice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txt, vl;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textView);
        btn = findViewById(R.id.button);
        vl = findViewById(R.id.textView2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double summ=0;
                double res;
                String sres;
                Random r = new Random();
                int rnd;
                for(int i=0; i<32000; i++) {
                    rnd =r.nextInt(4);
                    summ+=rnd;
                }
                res = summ/32000;
                rnd = r.nextInt(4);
                if (rnd%2==0){
                    txt.setText("Yes");
                    txt.setTextColor(Color.GREEN);
                }
                else{
                    txt.setText("No");
                    txt.setTextColor(Color.RED);
                }
                System.out.println(Double.toString(res));
                vl.setText("!!!");
            }
        });
    }
}
