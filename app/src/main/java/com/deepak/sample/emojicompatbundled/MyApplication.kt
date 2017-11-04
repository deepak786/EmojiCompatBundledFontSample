package com.deepak.sample.emojicompatbundled

import android.app.Application
import android.graphics.Color
import android.support.text.emoji.EmojiCompat
import android.support.text.emoji.bundled.BundledEmojiCompatConfig



/**
 * Created by root on 5/11/17.
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val config = BundledEmojiCompatConfig(this)
        config.setEmojiSpanIndicatorEnabled(true)
        config.setEmojiSpanIndicatorColor(Color.YELLOW)
        EmojiCompat.init(config)
    }
}