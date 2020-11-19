package com.example.garage.ui.onboard

import android.content.res.ColorStateList
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView
import com.example.garage.R
import com.example.garage.base.BaseFragment
import com.example.garage.utils.setSeekbarChangeListener
import kotlinx.android.synthetic.main.age_fragment.*


class AgeFragment : BaseFragment() {
    override fun getViewId() = R.layout.age_fragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textage.animateText(getString(R.string.old_you), 15)
        setupListeners()


    }

    private fun setupListeners() {
        seekbar.setSeekbarChangeListener{
            number.text = it.toString()


        }

    }
}