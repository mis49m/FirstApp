package tr.com.mis49m.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static String KEY_RESULT = "result";

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Initialize components
        tvResult = (TextView) findViewById(R.id.tvResult);

        // Get intent
        Intent intent = (Intent) getIntent();

        // Read attached value from intent
        String strResult = intent.getStringExtra(KEY_RESULT);

        // Set value to screen
        tvResult.setText(strResult);

    }
}
