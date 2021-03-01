package tw.idv.jew.intenttester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent()
        intent.setAction("tw.idv.jew.ACTION_A")
        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent)
        }else{
            Log.d("DEBUG", "null")
        }
    }
}