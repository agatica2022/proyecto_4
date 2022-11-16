package cl.gatica.radian1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editt1;
    private TextView textv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editt1=findViewById(R.id.editt1);
        textv1=findViewById(R.id.textv1);
    }
    public void Convertir(View v)
    {
        String s=editt1.getText().toString();
        int v1=Integer.parseInt(s);
        //int v2=Integer.parseInt("57.2957795");/// N° a Radianes: 180/Pi x N°
        double v2 = (Math.PI * v1) / 180;
        //double multiplicar=v1*v2;

        textv1.setText("La conversión a Radián es="+v2);
    }

}