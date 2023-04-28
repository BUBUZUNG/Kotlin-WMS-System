package com.example.mytools

import android.graphics.Color
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Space
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.skydoves.powerspinner.*


class LoginActivity : AppCompatActivity() {

    private val mThaiClub = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        createThaiClubData()

        val mySpinnerView= findViewById<PowerSpinnerView>(R.id.device_name)

        mySpinnerView.apply {
            setSpinnerAdapter(IconSpinnerAdapter(this))
            setItems(
                arrayListOf(
                    IconSpinnerItem(text = "Item1"),
                    IconSpinnerItem(text = "Item2",),
                    IconSpinnerItem(text = "Item3",),
                    IconSpinnerItem(text = "Item4",),
                ))
            getSpinnerRecyclerView().layoutManager = GridLayoutManager(context, 1)
//            selectItemByIndex(0) // select a default item.
            lifecycleOwner = this@LoginActivity
        }

    }
    private fun createThaiClubData() {
        mThaiClub.add("Air Force Central")
        mThaiClub.add("Army United")
        mThaiClub.add("Bangkok Glass")
        mThaiClub.add("Bangkok United")



    }
}