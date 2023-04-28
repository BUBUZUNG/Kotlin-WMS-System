package com.example.retrofitapp

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface Service {
    @GET("today-cases-all")
    fun getDate(): Call<List<CovidData>>
}
interface OnNetworkCallbackListener {
        fun onResponse(user: List<CovidData>?, retrofit: Retrofit?)
        fun onFailure(t: Throwable?)


    }

    var networkCallbackListener: OnNetworkCallbackListener = object : OnNetworkCallbackListener {
        override fun onResponse(covid: List<CovidData>?, retrofit: Retrofit?) {

            Log.e("BUBU", "เชื่อมต่อเรียบร้อยแล้ว \n ยอดผู้ติดเชื้อประจำวันที่ ${covid!![0].txn_date} มีจำนวน" +
                    " ${covid!![0].new_case} คน")
            //textView.setText("${user}")
        }

        override fun onFailure(t: Throwable?) {
            Log.e("BUBU", t.toString())
        }
    }

    fun callServer(listener: OnNetworkCallbackListener?) {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://covid19.ddc.moph.go.th/api/Cases/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val git = retrofit.create(Service::class.java)
        val call = git.getDate()
        call?.enqueue(object : Callback<List<CovidData>> {

            override fun onResponse(
                call: Call<List<CovidData>>,
                response: Response<List<CovidData>>
            ) {
                val coviddata: List<CovidData>? = response.body()

                if (coviddata != null) {
                    listener!!.onResponse(coviddata, retrofit)
                }
            }

            override fun onFailure(call: Call<List<CovidData>>, t: Throwable) {
                listener?.onFailure(t)
            }
        })
    }