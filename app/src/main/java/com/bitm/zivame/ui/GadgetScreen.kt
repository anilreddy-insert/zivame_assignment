package com.bitm.zivame.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bitm.zivame.adapter.GadgetsAdapter
import com.bitm.zivame.databinding.ActivityGadgetScreenBinding
import com.bitm.zivame.viewmodel.MainViewModel
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class GadgetScreen : AppCompatActivity() {
    private lateinit var binding: ActivityGadgetScreenBinding
    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGadgetScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        mainViewModel.getGadgets()!!.observe(this, { gadgetsData ->
            binding.rvGadgets.apply {
                val gadgetsAdapter: GadgetsAdapter by inject { parametersOf(gadgetsData.products) }
                layoutManager = LinearLayoutManager(this@GadgetScreen)
                adapter = gadgetsAdapter
            }
        })


    }
}