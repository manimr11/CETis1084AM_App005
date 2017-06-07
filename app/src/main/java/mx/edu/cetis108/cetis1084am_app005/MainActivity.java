package mx.edu.cetis108.cetis1084am_app005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lstVwContenedor= (ListView)findViewById(R.id.lstVwContenedor);
        Button btnAgregar=(Button)findViewById(R.id.btnAgregar);
        TextView lblNombre=(TextView)findViewById(R.id.lblNombre);
        TextView lblFechaCreacion=(TextView)findViewById(R.id.lblFechaCreacion);
        TextView lblDescripcion=(TextView)findViewById(R.id.lblDescripcion);
        TextView lblArchivo=(TextView)findViewById(R.id.lblArchivo);
        Button  btnBorrar=(Button)findViewById(R.id.btnBorrar);
        EditText txtNuevoArchivo=(EditText)findViewById(R.id.txtNuevoArchivo);
        Button btnGuardar=(Button)findViewById(R.id.btnGuardar);
    }
    public void btnAgregar_onclick (View V)
    {

    }
    public void btnBorrar_onclick (View V)
    {

    }
    public void btnGuardar_onclick (View V)
    {

    }

}
