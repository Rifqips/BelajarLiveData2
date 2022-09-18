package com.rifqipadisiliwangi.belajarlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelProduct : ViewModel(){
    val list = arrayListOf(
        DataProduct("Kue", R.drawable.ic_berita,"$2","qwerty"),
        DataProduct("Kue", R.drawable.ic_berita,"$2","qwerty"),
        DataProduct("Kue", R.drawable.ic_berita,"$2","qwerty"),
        DataProduct("Kue", R.drawable.ic_berita,"$2","qwerty"),
        DataProduct("Kue", R.drawable.ic_berita,"$2","qwerty")
    )

    val product : MutableLiveData<List<DataProduct>> = MutableLiveData()

    fun getProduct(){
        product.value = list
    }
}