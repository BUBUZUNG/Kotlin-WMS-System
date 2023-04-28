package com.example.retrofitapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        callServer(
            networkCallbackListener
        )
    }


//    interface GitHubService {
//        @GET("today-cases-all")
//        open fun getUser(): Call<List<TitleForRetrofitData?>>?
//    }
//    interface OnNetworkCallbackListener {
//        fun onResponse(user: List<TitleForRetrofitData?>?, retrofit: Retrofit?)
//        fun onFailure(t: Throwable?)
//    }
//    var networkCallbackListener: OnNetworkCallbackListener = object : OnNetworkCallbackListener {
//        override fun onResponse(user: List<TitleForRetrofitData?>?, retrofit: Retrofit?) {
//            Log.e("BUBU", "เชื่อมต่อเรียบร้อยแล้ว \n ${user!![0]?.newCase} \n Data Size ${user?.size}")
//
//        }
//        override fun onFailure(t: Throwable?) {
//            Log.e("BUBU", t.toString())
//        }
//    }
//    fun callServer(listener: OnNetworkCallbackListener?) {
//        val retrofit = Retrofit.Builder()
//            .baseUrl("https://covid19.ddc.moph.go.th/api/Cases/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//        val git = retrofit.create(GitHubService::class.java)
//        val call = git.getUser()
//        call?.enqueue(object : Callback<List<TitleForRetrofitData?>> {
//            fun onResponse(response: Response <TitleForRetrofitData>, retrofit: Retrofit?) {}
//            fun onFailure(t: Throwable?) {}
//
//            override fun onResponse(
//                call: Call<List<TitleForRetrofitData?>>,
//                response: Response<List<TitleForRetrofitData?>>
//            ) {
//                val user: List<TitleForRetrofitData?>? = response.body()
//
//                if (user != null) {
//                    listener!!.onResponse(user, retrofit)
//                }
//            }
//            override fun onFailure(call: Call<List<TitleForRetrofitData?>>, t: Throwable) {
//                listener?.onFailure(t)
//            }
//        })
//    }

}