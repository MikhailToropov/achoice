package com.example.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.myapplication.R;
import java.util.Random;

public class MainActivity extends Activity {
TextView txt, vl;
Button btn;


double summ = 0;
double res = 0;



    double getChoice(){
    Random r = new Random();
    int rnd = r.nextInt(4);
    if(rnd%2==0){
      return 1.0;
    }
    else{
      return 0.0;
    }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt);
        btn = findViewById(R.id.btn);
        vl = findViewById(R.id.vl);
        btn.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View v){

            res=0;
            for(int i=0;i<32000;i++){
              res += getChoice();
            }
            res = res/32000;
            if(getChoice()>0){
              txt.setText("Yes!");
              txt.setTextColor(Color.GREEN);
            }
            else{
              txt.setText("No!");
              txt.setTextColor(Color.RED);
            }
            vl.setText(Double.toString(res));
          }
        });

}
}
