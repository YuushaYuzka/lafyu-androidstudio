package pnj.tugas.ti.lafyuu

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.content.Intent

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    }
    fun favItems (view: View) {
        Intent(this, favoractivity::class.java).also {
            startActivity(it)
            finish()
        }
    }
    fun toSupersale (view: View) {
        Intent(this, superflashsale::class.java).also {
            startActivity(it)
            finish()
        }
    }
    fun toDetail (view: View) {
        Intent(this, detailbarang::class.java).also {
            startActivity(it)
            finish()
        }
    }
}
