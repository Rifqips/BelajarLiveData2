package com.rifqipadisiliwangi.belajarlivedata

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rifqipadisiliwangi.belajarlivedata.databinding.ActivityMainBinding
import com.rifqipadisiliwangi.belajarlivedata.databinding.ItemProductBinding

class ProductAdapter (var listproduct : ArrayList<DataProduct>): RecyclerView.Adapter<ProductAdapter.ViewHolder>(){

    class ViewHolder(var binding: ItemProductBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(itemproduct : DataProduct){
            binding.product = itemproduct
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemProductBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listproduct[position])
    }

    override fun getItemCount(): Int {
        return listproduct.size
    }
    fun setProductData(product : ArrayList<DataProduct>){
        this.listproduct = product
    }

}