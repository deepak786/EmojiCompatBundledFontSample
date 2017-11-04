package com.deepak.sample.emojicompatbundled

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.text.emoji.EmojiCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val emojiContent: String = "neutral face \uD83D\uDE10"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val processed = EmojiCompat.get().process(emojiContent)
        textView.text = processed
    }
}
