package com.example.garage.ui.onboard

import android.content.res.ColorStateList
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView
import com.example.garage.R
import com.example.garage.base.BaseFragment
import com.example.garage.utils.AnimationUtils
import com.example.garage.utils.setSeekbarChangeListener
import kotlinx.android.synthetic.main.age_fragment.*
import kotlinx.android.synthetic.main.age_fragment.view.*


class AgeFragment : BaseFragment() {
    override fun getViewId() = R.layout.age_fragment
    private var lastScale = 0f
    private var progress  = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textage.animateText(getString(R.string.old_you), 15)
        setupListeners()


    }

    private fun setupListeners() {
        seekbar.setSeekbarChangeListener{
            AnimationUtils.animateScale(redMan, lastScale, it.toFloat())
            lastScale = it.toFloat()
            number.text = it.toString()
            progress = it
            if (it == 15){
                number.text = "16+"
            } else if ( it == 0){
                number.text = "1"
            }
            if (textage != null){
                if(progress >= 3 && progress < 4)
                    textage.text = context?.getString(R.string.wfsf)
                else if(progress >= 4 && progress < 14)
                    textage.text = context?.getString(R.string.ggdgr)
                else if(progress >= 15 && progress <= 17)
                    textage.text = context?.getString(R.string.ggdfghj)
            }

        }

    }
}