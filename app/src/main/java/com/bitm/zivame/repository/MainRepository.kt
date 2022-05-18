package com.bitm.zivame.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.bitm.zivame.model.Gadgets
import com.bitm.zivame.network.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object MainRepository {

    val gadgetsData = MutableLiveData<Gadgets>()

    fun getGadgetsApiCall(): MutableLiveData<Gadgets> {

        val call = RetrofitService.getInstance().fetchGadgets()

        call.enqueue(object : Callback<Gadgets> {
            override fun onFailure(call: Call<Gadgets>, t: Throwable) {
                Log.v("DEBUG : ", t.message.toString())
            }

            override fun onResponse(
                call: Call<Gadgets>,
                response: Response<Gadgets>
            ) {
                Log.v("DEBUG : ", response.body().toString())

                val data = response.body()

                gadgetsData.value = Gadgets(data!!.products)
            }
        })

        return gadgetsData
    }
}