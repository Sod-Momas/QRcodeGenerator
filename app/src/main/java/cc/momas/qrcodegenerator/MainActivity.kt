package cc.momas.qrcodegenerator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editText)
        val qrcode = findViewById<ImageView>(R.id.qrcode)

        button.setOnClickListener {
            Toast.makeText(this@MainActivity, "click me!", Toast.LENGTH_SHORT).show()
            val bitmap = QRCodeUtil.createQRCodeBitmap(editText.text.toString(), 480, 480)
            qrcode.setImageBitmap(bitmap)
        }
    }
}
