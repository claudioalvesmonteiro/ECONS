package econs.org.observatoriosar.appteste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // criar tag para categorizar eventos do ciclo de vida da Activity
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "On Create Call");
        setContentView(R.layout.activity_main);

        Button btnInit = findViewById(R.id.buttonInit);

        btnInit.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("KEYO1", "Teste");
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart Call");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume Call");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause Call");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop Call");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy Call");

    }
}
