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
//            라디오버튼 목록 대화상자
            var placeArr = arrayOf("맨체스터", "밴쿠버", "골드코스트")
            var selectArr = booleanArrayOf(false, false, false)

            var dialog = AlertDialog.Builder(this@MainActivity)

            dialog.setTitle("좋아하는 도시")
            dialog.setIcon(R.drawable.icon1)
            dialog.setSingleChoiceItems(placeArr, 1){ d1, which ->
                btnDialog.text = placeArr[which]
            }
            dialog.setPositiveButton("닫기", null)
            dialog.show()
        }
    }
}