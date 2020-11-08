package com.example.utsmobile2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.webkit.JsResult
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FacultyWeb : AppCompatActivity() {

@SuppressLint("SetJavaScriptEnabled")
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.faculty_website)
    val webView = findViewById<WebView>(R.id.web_view)
    val intentFromFac = intent
    if (intentFromFac.hasExtra(Intent.ACTION_VIEW)) {
        val partWeb = intentFromFac.getStringExtra(Intent.ACTION_VIEW)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                view.loadUrl("javascript:alert('Load Website Success!')")
    }
}
webView.webChromeClient = object : WebChromeClient() {
    override fun onJsAlert(
        view: WebView,
        url: String,
        message: String,
        result: JsResult
        ): Boolean {
        Toast.makeText(this@FacultyWeb, message, Toast.LENGTH_LONG).show()
        result.confirm()
        return true
    }
}
        if (partWeb != null) {
            webView.loadUrl(partWeb)
        }
    }
}
}