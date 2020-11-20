package com.example.garage.view

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.appcompat.widget.AppCompatImageView
import com.example.garage.utils.AnimationUtils


//class для кастмоной верстки кнопки (button , чтоб увеличивалась кнопка и уменьшалась )
class AnimatedPressImageView(context: Context, attributeSet: AttributeSet):
        AppCompatImageView(context, attributeSet) {

    init {
        isClickable = true
        isFocusable = true
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {

        when(event?.action){
            MotionEvent.ACTION_DOWN  -> AnimationUtils.animatePress(this)  //  событие когда нажимаем кнопку
            MotionEvent.ACTION_UP -> AnimationUtils.animateRelease(this)   //событие когда отпускаем кнопку
            // AnimationUtils.animatePress из class AnimationUtilss помощника
        }
        return super.onTouchEvent(event)
    }
}