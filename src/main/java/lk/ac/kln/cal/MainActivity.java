package lk.ac.kln.cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   int numberOne = 0;
   int numberTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void  addnumbers(View view){
        final EditText firstnumber = findViewById(R.id.editText);
        final EditText secondnumber = findViewById(R.id.editText3);
        numberOne = Integer.parseInt(firstnumber.getText().toString());
        numberTwo = Integer.parseInt(secondnumber.getText().toString());
        final TextView resultView = findViewById(R.id.textView);
        int sum = numberOne + numberTwo ;
        resultView.setText(Integer.toString(sum));
    }
}
