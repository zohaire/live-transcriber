package com.interpretertrainer

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  val text = TextView(this)
  text.text = "Interpreter Trainer\n\nSight Translation\nShadowing\nConsecutive Interpretation\nDashboard"
  setContentView(text)
 }
}
