package com.example.garage.utils

import android.view.View
import android.view.animation.Animation
import android.view.animation.Interpolator
import android.view.animation.LinearInterpolator
import android.view.animation.ScaleAnimation

object AnimationUtils {

    //помощник анимации class CustomImageView

    private const val  DURATION = 300L

    fun animatePress(view: View){
        val objectAnimation = ScaleAnimation(
                1f,
                0.8f,
                1f,
                0.8f,
                Animation.RELATIVE_TO_SELF,
                0.5F,
                Animation.RELATIVE_TO_SELF,
                0.5F
        )
        objectAnimation.duration = DURATION
        objectAnimation.interpolator = LinearInterpolator()
        objectAnimation.fillAfter = true
        view.startAnimation(objectAnimation)

    }

    fun animateRelease(view: View){
        val objectAnimation = ScaleAnimation(
                0.8f,
                1f,
                0.8f,
                1f,
                Animation.RELATIVE_TO_SELF,
                0.5F,
                Animation.RELATIVE_TO_SELF,
                0.5F
        )
        objectAnimation.duration = DURATION
        objectAnimation.interpolator = LinearInterpolator()
        objectAnimation.fillAfter = true
        view.startAnimation(objectAnimation)

    }
}