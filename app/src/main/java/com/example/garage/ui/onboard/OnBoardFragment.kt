package com.example.garage.ui.onboard

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.garage.R
import com.example.garage.base.BaseFragment
import com.example.garage.data.MyFirstBroadcastReciver
import com.example.garage.data.SecondBroadcastReciver
import kotlinx.android.synthetic.main.fragment_onboard.*

class OnBoardFragment:BaseFragment() {
    override fun getViewId() = R.layout.fragment_onboard

    val reciever = SecondBroadcastReciver()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()

    }

    private fun setupListeners() {
        requireContext().registerReceiver(reciever, IntentFilter( "android.intent.action.TIME_TICK"))
        btnContin.setOnClickListener {  // просиходит переход из on BoardFragment в InputNameFragment,
            // с помощью navigate (res.xml main_navigation  )
           // findNavController().navigate(R.id.action_onBoardFragment_to_inputNameFragment) // для перехода в другой фрагмент
            sendBroadcast1()
        }
    }

    private  fun sendBroadcast1(){ // по теме Broad Cast
     // val intent = Intent(requireContext() , MyFirstBroadcastReciver:: class.java)
        //intent.action = "com.example.garage"
        val intent = Intent("com.example.garage.TEST")
        requireActivity().sendBroadcast(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        requireContext().unregisterReceiver(reciever)
    }
}