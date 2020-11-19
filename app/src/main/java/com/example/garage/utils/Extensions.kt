package com.example.garage.utils

import android.widget.SeekBar
import kotlinx.android.synthetic.main.age_fragment.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

// class helper WriterTextView

fun startCoroutinesTimer(
        delayMillis: Long,
        repeatCount: Long,
        scope: CoroutineScope,
        action: () -> Unit
){


    scope.launch {
        delay(delayMillis)
        if (repeatCount > 0){
            while (true){
                action()
                delay(delayMillis)
            }
        } else {
            action()
        }
    }


}


fun SeekBar.setSeekbarChangeListener(action: (Int) -> Unit){ //progress от 0 -100
    setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
        override fun onProgressChanged(p0: SeekBar?, progress: Int, p2: Boolean) {
            action(progress)

        }

        override fun onStartTrackingTouch(p0: SeekBar?) {}

        override fun onStopTrackingTouch(p0: SeekBar?) {}

    })

}