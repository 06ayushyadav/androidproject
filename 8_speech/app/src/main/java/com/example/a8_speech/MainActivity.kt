package com.example.a8_speech

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.annotations.ApiStatus
import java.util.*


class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
    private lateinit var tts: TextToSpeech
    private lateinit var editText: EditText
    private lateinit var btnSpeak: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        editText = findViewById(R.id.etText)
        btnSpeak = findViewById(R.id.btnSpeak)




        //initialize TTS


        tts = TextToSpeech(this, this)
        btnSpeak.setOnClickListener {
            val text = editText.text.toString()
            if (text.isNotEmpty()) {
                tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, "")


            }
        }
    }


    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val result = tts.setLanguage(Locale.US)
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED){


                //Handle unsupported language
            }
        }
    }
}
