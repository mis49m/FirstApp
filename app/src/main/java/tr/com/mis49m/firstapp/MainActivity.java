package tr.com.mis49m.firstapp;

import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirstNum, etSecondNum;
    Button btnCalculate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize components
        etFirstNum = (EditText) findViewById(R.id.etFirstNumber);
        etSecondNum = (EditText) findViewById(R.id.etSecondNumber);
        btnCalculate = (Button) findViewById(R.id.btnCalculate);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }

    public void onBtnCalculateClicked(View view){

        // Read values from edittext
        int num1 = Integer.valueOf(etFirstNum.getText().toString());
        int num2 = Integer.valueOf(etSecondNum.getText().toString());

        int result = num1 + num2;

        // Write calculated result to textview
        tvResult.setText(String.valueOf(result) );

        // Create intent in order to open second activity
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        // Attach result value to intent
        intent.putExtra(SecondActivity.KEY_RESULT, String.valueOf(result));
        // Open second activity
        startActivity(intent);
    }
}
