package pnj.tugas.ti.lafyuu

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class favoractivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_favoractivity)

    }

    fun backtoHome(view: View) {
        Intent(this, HomeActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }
}