package pe.edu.upeu.clase02_2018_ii;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvtitulo;
    private EditText txru, txtp;
    private Button btnenviar;
    private Typeface script;
    private String mensaje = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvtitulo = (TextView) findViewById(R.id.tvt);
        String fuente = "fuentes/Sweet.ttf";
        this.script = Typeface.createFromAsset(getAssets(),fuente);
        tvtitulo.setTypeface(script);
        txru = (EditText) findViewById(R.id.edtuser);
        txtp = (EditText) findViewById(R.id.edtpass);
        btnenviar = (Button) findViewById(R.id.btnenviar);
        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = txru.getText().toString();
                String pass = txtp.getText().toString();
                if(user.equals("dreyna") && pass.equals("123")){
                    mensaje = "Usuario Existe...!";
                    Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);
                }else{
                    mensaje = "Usuario no existe...!";
                }
                Toast.makeText(getApplicationContext(), mensaje,Toast.LENGTH_LONG).show();
            }
        });
    }
}
