package com.example.techieshub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val messageButton = findViewById<ImageButton>(R.id.messagebutton)
        val callButton = findViewById<ImageButton>(R.id.callbutton)

        messageButton.setOnClickListener {
            // Handle the message button click event here
            val email = Intent(Intent.ACTION_SENDTO)
            email.setData(Uri.parse("mailto:your.email@gmail.com"))
            email.putExtra(Intent.EXTRA_SUBJECT, "Subject")
            email.putExtra(Intent.EXTRA_TEXT, "My Email message")
            startActivity(email)
        }

        callButton.setOnClickListener {
            // Handle the call button click event here
            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.setData(Uri.parse("tel:1234567890"))
            startActivity(callIntent)
        }

        val appDevCardView = findViewById<androidx.cardview.widget.CardView>(R.id.appdevcardView)
        appDevCardView.setOnClickListener {
            val intent = Intent(this, AndroidAppDevActivity::class.java)
            startActivity(intent)
        }

        val webDevCardView = findViewById<androidx.cardview.widget.CardView>(R.id.webdevcardView)
        webDevCardView.setOnClickListener {
            val intent = Intent(this, WebDevActivity::class.java)
            startActivity(intent)
        }

        val iosDevCardView = findViewById<androidx.cardview.widget.CardView>(R.id.iosappdevcardView)
        iosDevCardView.setOnClickListener {
            val intent = Intent(this, IOSAppDevActivity::class.java)
            startActivity(intent)
        }

        val mlCardView = findViewById<androidx.cardview.widget.CardView>(R.id.mlcardView)
        mlCardView.setOnClickListener {
            val intent = Intent(this, MlActivity::class.java)
            startActivity(intent)
        }

        val blockchainCardView = findViewById<androidx.cardview.widget.CardView>(R.id.blockchaincardView)
        blockchainCardView.setOnClickListener {
            val intent = Intent(this, BlockchainActivity::class.java)
            startActivity(intent)
        }

        val cyberSecurityCardView = findViewById<androidx.cardview.widget.CardView>(R.id.cybersecuritycardView)
        cyberSecurityCardView.setOnClickListener {
            val intent = Intent(this, CyberSecurityActivity::class.java)
            startActivity(intent)
        }
    }
}