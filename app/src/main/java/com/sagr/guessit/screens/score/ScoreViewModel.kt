package com.sagr.guessit.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel() {

    private var _eventPlayAgain = MutableLiveData<Boolean>()

    val eventPlayAgain: LiveData<Boolean>
        get() = _eventPlayAgain


    init {
        _eventPlayAgain.value = false

    }


    fun onPlayAgain() {

        _eventPlayAgain.value = true
    }

    fun onPlayAgainComplete() {
        _eventPlayAgain.value = false

    }
}