package com.example.a561kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        data_1()
        data_2()
        data_3()
    }

    private fun data_1() {
        main_recyclerview_id.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val list = ArrayList<H_views>()
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        val adapterH = Adapter_H(this, list)
        main_recyclerview_id.adapter = adapterH
    }

    private fun data_2() {
        main_recyclerview_2_id.layoutManager = GridLayoutManager(this, 2)
        val list = ArrayList<grid_1>()
        list.add(grid_1(R.drawable.s1))
        list.add(grid_1(R.drawable.s1))
        list.add(grid_1(R.drawable.s2))
        list.add(grid_1(R.drawable.s2))
        list.add(grid_1(R.drawable.c_3))
        list.add(grid_1(R.drawable.c_3))
        list.add(grid_1(R.drawable.c_4))
        list.add(grid_1(R.drawable.c_4))
        val adapter = Adapter_grid_1(this, list)
        main_recyclerview_2_id.adapter = adapter
    }

    private fun data_3() {
        main_recyclerview_3_id.layoutManager = GridLayoutManager(this, 2)
        val list = ArrayList<grid_2>()
        list.add(grid_2(R.drawable.c4))
        list.add(grid_2(R.drawable.c4))
        list.add(grid_2(R.drawable.c2))
        list.add(grid_2(R.drawable.c2))
        list.add(grid_2(R.drawable.c3))
        list.add(grid_2(R.drawable.c3))
        val adapter = Adapter_grid_2(this, list)
        main_recyclerview_3_id.adapter = adapter
    }
}