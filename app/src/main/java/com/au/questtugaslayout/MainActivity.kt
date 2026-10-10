package com.au.questtugaslayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.au.questtugaslayout.ui.theme.QuesttugaslayoutTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            QuesttugaslayoutTheme() {
                TugasLayout()
            }
        }
    }
}