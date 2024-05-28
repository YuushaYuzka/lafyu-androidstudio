package pnj.tugas.ti.lafyuu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var button1 = findViewById<Button>(R.id.buttonReg)
        button1.setOnClickListener({
            val intent1 = Intent(this,RegistActivity2::class.java)
            startActivity(intent1)
        })
        var buttonhome = findViewById<Button>(R.id.button)
        buttonhome.setOnClickListener({
            val intent1 = Intent(this,HomeActivity::class.java)
            startActivity(intent1)
        })
    }
}