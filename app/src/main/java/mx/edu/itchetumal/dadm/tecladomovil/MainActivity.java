package mx.edu.itchetumal.dadm.tecladomovil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;

    EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt = (EditText) findViewById(R.id.editText);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn0 = (Button) findViewById(R.id.button11);

    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (edt.getText().toString().compareTo("0")==0)
            edt.setText("1");
            else
                edt.setText(edt.getText()+"1");
        }
    }
    );

    btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            /*if (edt.getText().toString().compareTo("0")==0) {
                edt.setText("2");
            }
            else{edt.setText(edt.getText()+"2");
            }*/
            char abc[] = {'a','b','c'};
            for (char i = 0; i < abc.length;i++){
                    if (edt.getText().toString().compareTo("")==2){
                        edt.setText(abc[i]);
                    }

            }

           

        }
    }
    );





    }
}
