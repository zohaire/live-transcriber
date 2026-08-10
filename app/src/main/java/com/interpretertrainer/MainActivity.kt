package com.interpretertrainer

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL

        val title = TextView(this)
        title.text = "Interpreter Trainer"

        val modes = listOf(
            "Sight Translation",
            "Shadowing",
            "Consecutive Interpretation",
            "Training Dashboard"
        )

        layout.addView(title)

        modes.forEach {
            val button = Button(this)
            button.text = it
            layout.addView(button)
        }

        setContentView(layout)
    }
}