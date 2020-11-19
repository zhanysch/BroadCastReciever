package com.example.garage.ui.inputname

import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.TextView.OnEditorActionListener
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.garage.R
import com.example.garage.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_onboardsecond.*


class InputNameFragment: BaseFragment() {
    override fun getViewId() = R.layout.fragment_onboardsecond

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
        title_desc.animateText(getString(R.string.word_pagetwo) , 15) // анимация textview (from class WriterTextView)

    }

    private fun setupListeners() {  // с помощью edittext переходим на след фрагмент
        editName.setOnEditorActionListener(OnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                Toast.makeText(requireContext(), editName.getText(), Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_inputNameFragment_to_ageFragment)
                return@OnEditorActionListener true
            }
            false
            // функция внутри клавиатуры в телефона при нажатии на кнопку галочка , дает возможность
            // переходить на следующ активити , не создаваем при этом button а внутри edittext
            // помимо нужно добавить в edit text след
            //  android:imeOptions="actionDone"
            //        android:lines="1"
            //        android:inputType="text"
        })
    }
}