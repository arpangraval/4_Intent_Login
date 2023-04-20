package com.example.a4_intent_login_simple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var id:EditText = findViewById(R.id.et_id)
        var pw:EditText = findViewById(R.id.et_pass)
        var btn_login:Button = findViewById(R.id.btn_login)

        btn_login.setOnClickListener {
            if(id.text.toString()=="Arpan" && pw.text.toString() == "Arpan")
            {
                var intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)
            }
            else
                Toast.makeText(this,"Enter valid credentials",Toast.LENGTH_LONG).show()


        }
    }
}