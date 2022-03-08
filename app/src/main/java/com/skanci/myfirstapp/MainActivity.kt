package com.skanci.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val validateBtn : MaterialButton? = findViewById(R.id.validate_btn);

        validateBtn?.setOnClickListener {
            val firstName : TextInputEditText = findViewById(R.id.firstName);
            val lastName : TextInputEditText = findViewById(R.id.lastName);

            if (firstName.text.toString().isNotEmpty() && lastName.text.toString().isNotEmpty()){
                val fullNameEnter : String = firstName.text.toString().plus(" ").plus(lastName.text);
                findViewById<MaterialTextView>(R.id.userName)?.setText(fullNameEnter);
            }
            else {
                 Toast.makeText(this,"Please put your fullName", Toast.LENGTH_SHORT).show();
                }
        }

    }
}