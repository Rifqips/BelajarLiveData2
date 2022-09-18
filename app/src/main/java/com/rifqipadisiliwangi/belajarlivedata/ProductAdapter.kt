package com.rifqipadisiliwangi.belajarlivedata

import android.content.Intent
import android.content.Intent.EXTRA_INTENT
import android.content.Intent.parseIntent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.rifqipadisiliwangi.belajarlivedata.databinding.ActivityKontenProdukBinding
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

        var nameProduct = listproduct[position].nameProduct
        var imgProduct = listproduct[position].imgProduct
        var priceProduct = listproduct[position].priceProduct
        var description = listproduct[position].description
        holder.binding.cvProduk.setOnClickListener(object : View.OnClickListener{
            override fun onClick(view : View?){
                val bun = Bundle()
                bun.putString("nama",nameProduct)
                bun.putInt("foto",imgProduct)
                bun.putString("price",priceProduct)
                bun.putString("description",description)

                val intent = Intent(view?.context, ActivityKontenProdukBinding::class.java)
                intent.putExtra("data",bun)
                view?.context?.startActivity(intent)

//                val intent = Intent(this, ActivityKontenProdukBinding::class.java)
//                intent.putExtra("data",bun)
//                view?.context?.startActivity(intent)

//                val intent:Intent = Intent(this,ActivityKontenProdukBinding::class.java)
//                intent.putExtra("data",bun)
//                view?.context?.startActivity(intent)

//                val intent = Intent( context, ActivityKontenProdukBinding::class.java)
//                context.startActivity(intent)
            }
        })
    }

    override fun getItemCount(): Int {
        return listproduct.size
    }
    fun setProductData(product : ArrayList<DataProduct>){
        this.listproduct = product
    }

}