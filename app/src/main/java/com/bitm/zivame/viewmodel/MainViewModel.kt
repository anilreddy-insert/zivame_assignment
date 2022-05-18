package com.bitm.zivame.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bitm.zivame.model.Gadgets
import com.bitm.zivame.repository.MainRepository

class MainViewModel():ViewModel(){
    var gadgetsLiveData: MutableLiveData<Gadgets>? = null

    fun getGadgets() : LiveData<Gadgets>? {
        gadgetsLiveData = MainRepository.getGadgetsApiCall()
        return gadgetsLiveData
    }

}