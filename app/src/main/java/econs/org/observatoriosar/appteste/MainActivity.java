package econs.org.observatoriosar.appteste;

import android.nfc.Tag;
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

        // atribuir o valor de hello a test, uma variavel tipo String
        // getResources acessa os arquivos e getString os arquivos tipo string
        // String test = getResources().getString(R.string.hello);

        //
        final TextView textView = findViewById(R.id.txtHello);

        //
        final EditText editTextA = findViewById(R.id.inputA);
        final EditText editTextB = findViewById(R.id.inputB);


        // objeto listener 'escutando alguma coisa pra executar determinada acao'
        // evento de clique

        Button button = findViewById(R.id.buttonDividir);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer obA = Integer.valueOf(editTextA.getEditableText().toString());
                Integer obB = Integer.valueOf(editTextB.getEditableText().toString());

                Integer resultado = obA + obB;

                textView.setText(resultado.toString());

            }
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "On Start Call");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "On Resume Call");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "On Pause Call");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "On Stop Call");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "On Destroy Call");

    }
}
