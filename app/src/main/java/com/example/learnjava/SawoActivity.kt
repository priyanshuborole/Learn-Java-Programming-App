package com.example.learnjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.sawolabs.androidsdk.Sawo;
class SawoActivity : AppCompatActivity() {
    private lateinit var loginEmail: Button
    lateinit var loginPhone: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sawo)
        loginEmail = findViewById(R.id.btnLoginEmail)
        loginEmail.setOnClickListener {
            Sawo(
                this,
                // "your api key"
                // "your api key secret"
            ).login(
                "email", // can be one of 'email' or 'phone_number_sms'
                MainActivity::class.java.name // Callback class name
            )
            loginPhone = findViewById(R.id.btnLoginPhone)
            loginPhone.setOnClickListener {
                Sawo(
                    this,
                    // "your api key"
                    // "your api key secret"
                ).login(
                    "phone_number_sms", // can be one of 'email' or 'phone_number_sms'
                    MainActivity::class.java.name // Callback class name
                )

            }

        }
    }
}
