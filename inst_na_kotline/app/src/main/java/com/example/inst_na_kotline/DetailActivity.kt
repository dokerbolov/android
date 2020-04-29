package com.example.inst_na_kotline

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class DetailActivity : AppCompatActivity() {
    var imageDetail: ImageView? = null
    var imageAvatarDetail: ImageView? = null
    var nameDetail: TextView? = null
    var descriptionDetail: TextView? = null
    var detail_like_state: TextView? = null
    var detail_like_count: TextView? = null
    var detail_like: ImageButton? = null
    var name: String? = null
    var description: String? = null
    var like_state: String? = null
    var imagesOfContext = 0
    var imagesOfAvatar = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        imageAvatarDetail = findViewById(R.id.imageAvatarDetail)
        imageDetail = findViewById(R.id.imageDetail)
        nameDetail = findViewById(R.id.nameDetail)
        descriptionDetail = findViewById(R.id.descriptionDetail)
        detail_like_state = findViewById(R.id.detail_like_state)
        detail_like = findViewById(R.id.detail_like)
        detail_like_count = findViewById(R.id.detail_like_count)
        data
        setData()
    }

    fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private val data: Unit
        private get() {
            if (intent.hasExtra("name") && intent.hasExtra("description") && intent.hasExtra(
                    "imageInContext"
                )
                && intent.hasExtra("imageInAvatar")
            ) {
                name = intent.getStringExtra("name")
                description = intent.getStringExtra("description")
                imagesOfAvatar = intent.getIntExtra("imageInAvatar", 1)
                imagesOfContext = intent.getIntExtra("imageInContext", 1)
                like_state = intent.getStringExtra("like_state")
            } else {
                Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show()
            }
        }

    private fun setData() {
        nameDetail!!.text = name
        descriptionDetail!!.text = description
        imageDetail!!.setImageResource(imagesOfContext)
        imageAvatarDetail!!.setImageResource(imagesOfAvatar)
        detail_like_state!!.text = like_state
        detail_like!!.setOnClickListener {
            if (detail_like_state!!.text.toString() == "0") {
                val toast =
                    Toast.makeText(applicationContext, "liked", Toast.LENGTH_SHORT)
                toast.show()
                detail_like_count!!.text = "101"
                detail_like_state!!.text = "1"
            } else {
                val toast =
                    Toast.makeText(applicationContext, "unliked", Toast.LENGTH_SHORT)
                toast.show()
                detail_like_count!!.text = "100"
                detail_like_state!!.text = "0"
            }
        }
    }
}

