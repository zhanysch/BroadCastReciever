package com.example.garage.ui.onboard

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.garage.R
import com.example.garage.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_onboard.*

class OnBoardFragment:BaseFragment() {
    override fun getViewId() = R.layout.fragment_onboard

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()

    }

    private fun setupListeners() {
        btnContin.setOnClickListener {  // просиходит переход из on BoardFragment в InputNameFragment,
            // с помощью navigate (res.xml main_navigation  )
            findNavController().navigate(R.id.action_onBoardFragment_to_inputNameFragment)
        }
    }
}