package com.example.odev3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Bitmap
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.odev3.R
class Blog : AppCompatActivity() {

    lateinit var detailWebView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        detailWebView = findViewById(R.id.detailWebView)

        // WebView Url open page
        val url = "https://github.com/mtaltindas";
        detailWebView.settings.javaScriptEnabled = true
        detailWebView.webViewClient = customWebViewClient()
        detailWebView.loadUrl(url)


    }

    class customWebViewClient : WebViewClient() {

        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            Log.d("shouldOverrideUrlLoading", "Loading")
            return super.shouldOverrideUrlLoading(view, request)
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            Log.d("onPageFinished", "Finish")
            super.onPageFinished(view, url)
        }

        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            Log.d("onPageStarted", "Start")
            super.onPageStarted(view, url, favicon)
        }

    }

}