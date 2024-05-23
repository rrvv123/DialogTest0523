package kr.ac.kopo.dialogtest0523

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnDialog = findViewById<Button>(R.id.btnDialog)

        btnDialog.setOnClickListener {
            var dialog = AlertDialog.Builder(this@MainActivity)
            dialog.setTitle("안내 메세지")
            dialog.setMessage("오늘은 목요일입니다.")
            dialog.setIcon(R.drawable.icon1)
            dialog.setPositiveButton("확인"){ dialog, which ->
                Toast.makeText(this@MainActivity, "확인버튼을 클릭했습니다.",
                    Toast.LENGTH_SHORT).show()
            }
            dialog.show()
        }
    }
}