package com.deepak.sample.emojicompatbundled

import android.os.Bundle
import android.support.text.emoji.EmojiCompat
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.apache.commons.lang3.StringEscapeUtils
import org.apache.commons.lang3.StringUtils


class MainActivity : AppCompatActivity() {

    private val emojiContent: String = "Hey \uD83D\uDc83\ud83c\udffb"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView2.text = StringEscapeUtils.unescapeJava(emojiContent)

        EmojiCompat.get().registerInitCallback(object : EmojiCompat.InitCallback() {
            override fun onInitialized() {
                super.onInitialized()
                println("EmojiCompat initialized successfully")
                val processed = EmojiCompat.get().process(emojiContent)
                textView4.text = processed
            }

            override fun onFailed(throwable: Throwable?) {
                super.onFailed(throwable)
                Toast.makeText(this@MainActivity, throwable?.message ?: "", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
