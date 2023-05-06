package com.example.medfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {

    lateinit var signup: Button
    lateinit var log:Button
    private lateinit var mAuth: FirebaseAuth

    private lateinit var getemail: EditText
    private lateinit var getpasssword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mAuth= FirebaseAuth.getInstance()
        getemail = findViewById(R.id.email)
        getpasssword = findViewById(R.id.password1)
        signup = findViewById(R.id.sign_up_btn)
        log = findViewById(R.id.log_btn)
    }

    fun signup_to_acc(view: View){
        val signuptoall = Intent(this,signups::class.java)
        startActivity(signuptoall)
        finish()
    }

    fun Login_to_acc(view: View){
        val email=getemail.text.toString()
        val password=getpasssword.text.toString()
        logindata(email,password)
    }


    private fun logindata(email:String,password:String){


        mAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val lgn = Intent(this,home::class.java)
                    startActivity(lgn)
                } else {
                    Toast.makeText(this,"some erroe" , Toast.LENGTH_SHORT).show()
                }
            }
    }
}