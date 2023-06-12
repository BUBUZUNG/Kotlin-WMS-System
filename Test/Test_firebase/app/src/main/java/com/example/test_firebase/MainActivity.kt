package com.example.test_firebase

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://test-firebase-b487e-default-rtdb.firebaseio.com/")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btRegister.setOnClickListener(){
            val UserName = edUsername.text.toString()
            val FirstName = edFirstName.text.toString()
            val LastName = edLastName.text.toString()
            val Password = edPassword.text.toString()

            if (UserName.isEmpty() || FirstName.isEmpty() || LastName.isEmpty() || Password.isEmpty()){
                Toast.makeText( this@MainActivity,"Fill all fields", Toast.LENGTH_SHORT).show()
            }else{
                // insertion code here (add data code. This make data class file name Users
                val user = Users(UserName,FirstName,LastName, Password) // this code call data class
                databaseReference.child("tbl_user").child(UserName).setValue(user) // this code send data to fire base
                Toast.makeText( this@MainActivity,"Data inserted succssful", Toast.LENGTH_SHORT).show()

                edUsername.text = null
                edFirstName.text = null
                edLastName.text = null
                edPassword.text = null
            }
        }
    }
}