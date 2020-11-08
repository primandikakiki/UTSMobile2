package com.example.utsmobile2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = CreateFac()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = FacultyAdapter(data) { onItem: FacultyData -> onItemClicked(onItem) }
    }
    private fun onItemClicked(onItem: FacultyData) {
        val showDetailActivityIntent = Intent(this, FacultyDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_INTENT, onItem.nameFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.descFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descDet)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, onItem.emailFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_ORIGINATING_URI, onItem.webFac)
        startActivity(showDetailActivityIntent)
    }
}