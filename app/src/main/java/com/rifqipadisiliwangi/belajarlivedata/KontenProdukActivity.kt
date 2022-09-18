package com.rifqipadisiliwangi.belajarlivedata


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.rifqipadisiliwangi.belajarlivedata.databinding.ActivityKontenProdukBinding



class KontenProdukActivity : AppCompatActivity() {

    lateinit var binding: ActivityKontenProdukBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_konten_produk)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_konten_produk)
        getProduct()


    }

    private fun getProduct(){

        val bdl = Bundle()
        val imgProduct = bdl.getInt("imgProduct")
        val nameProduct = bdl.getString("nameProduct")
        val priceProduct = bdl.getString("priceProduct")
        val description = bdl.getString("description")

        binding.product = DataProduct(nameProduct!!, imgProduct,  priceProduct!!,description!!)
    }
}