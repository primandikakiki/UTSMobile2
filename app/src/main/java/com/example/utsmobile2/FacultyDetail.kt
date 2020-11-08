package com.example.utsmobile2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.faculty_detail.*

class FacultyDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.faculty_detail)
        var intentThatStartedThisActivity = intent
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_INTENT)) {
            showContent (intentThatStartedThisActivity)
        }
    }
    private fun showContent (intentThatStartedThisActivity: Intent) {
        var nameF = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INTENT)
        var deskF = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
        var deskS = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
        var imgF = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
        var emailF = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_EMAIL)
        var webF = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_ORIGINATING_URI)

        tv_name_detail.text = nameF
        tv_desc_detail.text = deskF
        tv_short_detail.text = deskS
        image_detail.contentDescription = nameF
        image_detail.setImageResource(imgF)

        if (emailF == "") {
            tv_link_email.text = ""
            tv_email_detail.text = ""
        } else {
            tv_link_email.text = emailF
        }
        if (webF == "") {
            tv_link_web.text = ""
            tv_website_detail.text = ""
        } else {
            tv_link_web.text = webF
        }
        tv_link_email.setOnClickListener {
            if (emailF != null) {
                clickEmail(emailF)
            }
        }
        tv_link_web.setOnClickListener {
            if (webF != null) {
                clickWeb(webF)
            }
        }
    }
    private fun clickEmail(email: String) {
        val mailIntent = Intent(Intent.ACTION_SEND)
        mailIntent.data = Uri.parse("mailto:")
        mailIntent.type = "text/plain"
        mailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
        mailIntent.putExtra(Intent.EXTRA_SUBJECT, "From Primandika Hakiki")
        mailIntent.putExtra(Intent.EXTRA_TEXT, "Test 1 2 3")
        startActivity(Intent.createChooser(mailIntent, "Choose Email..."))
    }
    private fun clickWeb(url: String) {
        val showWebActivity = Intent(this, FacultyWeb::class.java)
        showWebActivity.putExtra(Intent.ACTION_VIEW, url)
        startActivity(showWebActivity)
    }
}