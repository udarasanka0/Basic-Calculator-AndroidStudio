package com.example.ramstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //decalaring varraibles

    Button b1,b2,b3,b4;
    TextView rs;
    EditText N1,N2;

    int numb1,numb2;
    float result;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




      //ASsigning variables to id

            //buttons

        b1=findViewById(R.id.btnplus);
        b2=findViewById(R.id.btnmin);
        b3=findViewById(R.id.btnmulti);
        b4=findViewById(R.id.btndiv);

            //TectView

        rs=findViewById(R.id.result);
        N1=findViewById(R.id.number1);
        N2=findViewById(R.id.number2);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numb1=Integer.parseInt(N1.getText().toString());
                numb2 = Integer.parseInt(N2.getText().toString());
                result=numb1+numb2;

                rs.setText(String.valueOf(result));

            }
        });



    }
}