package los.workfreelosaaaaat.testcameramedia

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
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


        adPer(this)


        val ButtonStartIs = findViewById<Button>(R.id.but_start_video).setOnClickListener {

                   val intent = createIntent().apply {
            //putExtra(MediaStore.EXTRA_OUTPUT, "videoUri")
        }

        startActivity(intent)


        }

    }




     private fun createIntent(): Intent {
        return Intent(MediaStore.ACTION_VIDEO_CAPTURE)
    }


}