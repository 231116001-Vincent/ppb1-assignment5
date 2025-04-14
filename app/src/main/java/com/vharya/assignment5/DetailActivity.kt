package com.vharya.assignment5

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.vharya.assignment5.data.MataKuliah

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)

        toolbar.setNavigationIcon(R.drawable.icon_arrow_left)
        toolbar.setNavigationOnClickListener { finish() }
        toolbar.title = null

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val iconView = findViewById<ImageView>(R.id.detail_icon)
        val coverView = findViewById<ImageView>(R.id.detail_cover)

        val nameView = findViewById<TextView>(R.id.detail_name)
        val descriptionView = findViewById<TextView>(R.id.detail_description)
        val roomView = findViewById<TextView>(R.id.detail_room)
        val scheduleView = findViewById<TextView>(R.id.detail_schedule)
        val lecturerView = findViewById<TextView>(R.id.detail_lecturer)
        val sksView = findViewById<TextView>(R.id.detail_sks)

        nameView.text = intent.getStringExtra("name")
        descriptionView.text = intent.getStringExtra("description")
        roomView.text = intent.getStringExtra("room")
        scheduleView.text = intent.getStringExtra("schedule")
        lecturerView.text = intent.getStringExtra("lecturer")
        sksView.text = intent.getIntExtra("sks", 0).toString()

        val icon = intent.getIntExtra("icon", 0)
        val cover = intent.getIntExtra("cover", 0)

        Glide.with(this)
            .load(icon)
            .centerInside()
            .into(iconView)

        Glide.with(this)
            .load(cover)
            .centerCrop()
            .into(coverView)
    }

    companion object {
        fun newIntent(context: Context, mataKuliah: MataKuliah): Intent {
            val intent = Intent(context, DetailActivity::class.java)

            intent.putExtra("name", mataKuliah.name)
            intent.putExtra("description", mataKuliah.description)
            intent.putExtra("room", mataKuliah.room)
            intent.putExtra("schedule", mataKuliah.schedule)
            intent.putExtra("lecturer", mataKuliah.lecturer)
            intent.putExtra("sks", mataKuliah.sks)
            intent.putExtra("cover", mataKuliah.cover)
            intent.putExtra("icon", mataKuliah.icon)

            return intent
        }
    }
}