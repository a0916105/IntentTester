package tw.idv.jew.intenttester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //28-2_ACTION_A
        /*val intent = Intent()
        intent.setAction("tw.idv.jew.ACTION_A")
        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent)
        }else{
            Log.d("DEBUG", "null")
        }*/
        //28-2_ACTION_DIAL
        /*val dial = Intent(Intent.ACTION_DIAL)
        startActivity(dial)*/
        //28-3_Broadcast
        Intent().apply {
            setAction("tw.idv.jew.CHAT_INCOMING")
        }.also {
            sendBroadcast(it)
        }
    }
}