package com.example.garage.view

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.example.garage.utils.startCoroutinesTimer
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel


// class анимации textview
class WriterTextView (context: Context, attributeSet: AttributeSet)
    : AppCompatTextView(context , attributeSet) {


    private val scope = MainScope()
    private var text = ""
    private var position = 0


    fun animateText (text: String , delay : Long = 40L){
        startCoroutinesTimer(delay, text.length.toLong(),scope ){
            if (position < text.length){
                val newText = "${this.text}${text[position]}"
                position++
                this.text = newText
                setText(this.text)
            } else {
                scope.cancel()
            }

        }
    }

    override fun onDetachedFromWindow() { // эта функц после завершен работы корутин , останавливало корутины
        scope.cancel()
        super.onDetachedFromWindow()
    }
}