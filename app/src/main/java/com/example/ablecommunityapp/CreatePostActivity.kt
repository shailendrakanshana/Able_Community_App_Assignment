package com.example.ablecommunityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.ablecommunityapp.daos.PostDao

class CreatePostActivity : AppCompatActivity() {
    private lateinit var postDao: PostDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)

        val postButton = findViewById<Button>(R.id.postButton)
        val postInput = findViewById<EditText>(R.id.postInput)

        postDao = PostDao()

        postButton.setOnClickListener {
            val input = postInput.text.toString().trim()

            if(input.isNotEmpty()){
                postDao.addPost(input)
                finish()
            }
        }

        setUpRecyclerView()


    }
    private fun setUpRecyclerView() {

    }
}