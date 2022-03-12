package com.se7enlike.listview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.se7enlike.listview_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private  lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.jian, R.drawable.kspksp, R.drawable.roieee, R.drawable.uzra, R.drawable.yuniko
        )

        val numPeople = arrayOf(
            "65465","21325","12124","21313","45210"
        )

        val area = arrayOf(
            "Taiwan","Taiwan","Taiwan","Taiwan","Taiwan"
        )

        val channel = arrayOf(
            "jian","kspksp","roieee","uzra","yuniko"
        )

        userArrayList = ArrayList()

        for (i in numPeople.indices){
            val user = User(numPeople[i],area[i],channel[i],imageId[i])
            userArrayList.add(user)

        }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this, userArrayList)

    }
}