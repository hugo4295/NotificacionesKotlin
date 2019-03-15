package mx.edu.tesoem.hugo4295.itics.notificacioneskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nombre = txtnombre.text

        btnsaluda.setOnClickListener{
            Toast.makeText(this, "Bienvenido ${nombre.toString()}", Toast.LENGTH_LONG).show()
        }
    }
}
