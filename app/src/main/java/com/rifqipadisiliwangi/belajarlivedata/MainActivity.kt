package com.rifqipadisiliwangi.belajarlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.rifqipadisiliwangi.belajarlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var vmProduct : ViewModelProduct
    lateinit var productAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

// init adapter
        productAdapter = ProductAdapter(ArrayList())
// init view model
        vmProduct = ViewModelProvider(this).get(ViewModelProduct::class.java)

        vmProduct.getProduct()
        vmProduct.product.observe(this, Observer {
            productAdapter.setProductData(it as ArrayList<DataProduct>)
        })

// set layout and data adapter to list recyclerview product
        binding.rvProduct.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvProduct.adapter = productAdapter

    }
}