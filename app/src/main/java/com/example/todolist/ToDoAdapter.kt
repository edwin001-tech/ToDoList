package com.example.todolist

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.todo_row.view.*

class ToDoAdapter (val todos: List<String>) : RecyclerView.Adapter<ToDoAdapter.ToDoHolder>(){
    class ToDoHolder(v:View) :RecyclerView.ViewHolder(v), View.OnClickListener {
        var view : View = v
        var title: String = ""

        init{
            v.setOnClickListener(this)
        }
        fun bindTodo(title:String) {
            this.title = title
            view.textView.text =title
        }
        override fun onClick(v: View?) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return todos.count()
    }

    override fun onBindViewHolder(holder: ToDoHolder, position: Int) {
        TODO("Not yet implemented")
    }

}