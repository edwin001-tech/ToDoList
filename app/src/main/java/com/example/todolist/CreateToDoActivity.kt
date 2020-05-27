package com.example.todolist

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_to_do.*

class CreateToDoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_to_do)

        //create a lambda expression for the save button
        saveButton.setOnClickListener{
            var title = ""
            if(importantCheckBox.isChecked){
                title = "!" +titleEditText.text.toString()
            }
            else{
                title = titleEditText.text.toString()
            }
            var prefs = getSharedPreferences( "com.example.todolist.sharedprefs", Context.MODE_PRIVATE)
            var todos = prefs.getStringSet( "todostrings", setOf())!!.toMutableSet()
            todos.add(title)

            prefs.edit().putStringSet( "todostrings",todos).apply()
            finish()
        }
    }
}
