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
                "0b5041a8-fa82-4fe5-bc8e-c11eee44fb2c", // your api key
                "614ed77eec39c0c001ec607bjiXwK34ApwmHPhVlSzSzXZH2"  // your api key secret
            ).login(
                "email", // can be one of 'email' or 'phone_number_sms'
                MainActivity::class.java.name // Callback class name
            )
            loginPhone = findViewById(R.id.btnLoginPhone)
            loginPhone.setOnClickListener {
                Sawo(
                    this,
                    "0b5041a8-fa82-4fe5-bc8e-c11eee44fb2c", // your api key
                    "614ed77eec39c0c001ec607bjiXwK34ApwmHPhVlSzSzXZH2"  // your api key secret
                ).login(
                    "phone_number_sms", // can be one of 'email' or 'phone_number_sms'
                    MainActivity::class.java.name // Callback class name
                )

            }

        }
    }
}