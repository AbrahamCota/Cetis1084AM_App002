package mx.edu.cetis108.cetis1084am_app002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.FloatMath;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void BtnResta_onClick (View V)
    {
        EditText r1=(EditText) findViewById(R.id.edit1);
        EditText r2=(EditText) findViewById(R.id.edit2);
        TextView valor=(TextView) findViewById(R.id.textview1);

        float uno=Float.parseFloat(r1.getText().toString());
        float dos= Float.parseFloat(r2.getText().toString());
        float RestaResultado=uno-dos;
        valor.setText("resultado="+RestaResultado);



    }
        public void BtnSuma_onClick (View V)
        { EditText r1=(EditText) findViewById(R.id.edit1);
            EditText r2=(EditText) findViewById(R.id.edit2);
            TextView valor=(TextView) findViewById(R.id.textview1);
            float uno=Float.parseFloat(r1.getText().toString());
            float dos=Float.parseFloat(r2.getText().toString());
            float SumaResultado=uno+dos;
            valor.setText("resultado="+SumaResultado);
        }
    public void BtnMultiplicar_onClick (View V)
    {

        EditText r1=(EditText) findViewById(R.id.edit1);
        EditText r2=(EditText) findViewById(R.id.edit2);
        TextView valor=(TextView) findViewById(R.id.textview1);
        float uno=Float.parseFloat(r1.getText().toString());
        float dos=Float.parseFloat(r2.getText().toString());
        float MultiplicacionResultado=uno+dos;
        valor.setText("resultado="+MultiplicacionResultado);

    }
    public void BtnDivision_onClick (View V)
    { EditText r1=(EditText) findViewById(R.id.edit1);
        EditText r2=(EditText) findViewById(R.id.edit2);
        TextView valor=(TextView) findViewById(R.id.textview1);
        float uno=Float.parseFloat(r1.getText().toString());
        float dos=Float.parseFloat(r2.getText().toString());
        float DivisionResultado=uno+dos;
        valor.setText("resultado="+DivisionResultado);
    }



}
