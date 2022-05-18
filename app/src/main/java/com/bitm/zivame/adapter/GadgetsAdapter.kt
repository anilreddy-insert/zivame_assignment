package com.bitm.zivame.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bitm.zivame.databinding.ItemGadgetsBinding
import com.bitm.zivame.model.Gadgets

class GadgetsAdapter(private val products: List<Gadgets.Products>) : RecyclerView.Adapter<GadgetsViewHolder>(){
    private lateinit var binding: ItemGadgetsBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GadgetsViewHolder {
        binding= ItemGadgetsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return GadgetsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GadgetsViewHolder, position: Int) {
        holder.binding.data=products.get(position)


        holder.binding.buttonAddToCart.setOnClickListener {
            holder.binding.sparkButtonAddToCart.playAnimation()
        }
    }

    override fun getItemCount(): Int {
        return products.size
    }
}
class GadgetsViewHolder(val binding: ItemGadgetsBinding) : RecyclerView.ViewHolder(binding.root)