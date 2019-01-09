package econs.org.observatoriosar.appteste;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    // criar tag para categorizar eventos do ciclo de vida da Activity
    private String TAG = "Main2Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "On Create Call");
        setContentView(R.layout.activity_main2);

        // atribuir o valor de hello a test, uma variavel tipo String
        // getResources acessa os arquivos e getString os arquivos tipo string
        // String test = getResources().getString(R.string.hello);

        // acessar espaco de memoria
        final EditText editTextA = findViewById(R.id.inputA);
        final EditText editTextB = findViewById(R.id.inputB);
        final TextView textView = findViewById(R.id.txtHello);

        // objeto listener 'escutando alguma coisa pra executar determinada acao'
        // evento de clique

        Button buttonA = findViewById(R.id.buttonSoma);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer obA = Integer.valueOf(editTextA.getEditableText().toString());
                Integer obB = Integer.valueOf(editTextB.getEditableText().toString());

                Integer resultado = obA + obB;

                textView.setText(resultado.toString());

            }
        });

        Button buttonB = findViewById(R.id.buttonDividir);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double obA = Double.valueOf(editTextA.getEditableText().toString());
                Double obB = Double.valueOf(editTextB.getEditableText().toString());

                Double resultado = obA / obB;

                textView.setText(resultado.toString());

            }
        });

        Button buttonC = findViewById(R.id.buttonSubtracao);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer obA = Integer.valueOf(editTextA.getEditableText().toString());
                Integer obB = Integer.valueOf(editTextB.getEditableText().toString());

                Integer resultado = obA - obB;

                textView.setText(resultado.toString());

            }
        });

        Button buttonD = findViewById(R.id.buttonMultiplica);
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer obA = Integer.valueOf(editTextA.getEditableText().toString());
                Integer obB = Integer.valueOf(editTextB.getEditableText().toString());

                Integer resultado = obA * obB;

                textView.setText(resultado.toString());

            }
        });

        //Button buttonHide = findViewById(R.id.buttonHided);
        //buttonHide.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {


        //    }
        //});

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
