package com.iriras.ieutehkotlin

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * contoh view snackbar
         * pada bahasa kotlin dapat langsung memanggil id view widget
         * tanpa harus mendefinisikan melalui findViewById
         */
        Snackbar.make(parent_view, Constan.TAG, Snackbar.LENGTH_SHORT).show()

        /**
         * contoh set text ke textView
         * properti .text bisa digunakan untuk getText() atau setText()
         */
        txt_lorem.text = Constan.TAG

        /**
         * contoh implementasi listener pada widget button
         * jadi hanya ada satu baris
         */
        mybtn.setOnClickListener { Toast.makeText(this, Constan.TAG, Toast.LENGTH_SHORT).show() }
    }

    /**
     * contoh pembuatan variable constant
     */
    object Constan {
        val TAG: String = javaClass.simpleName
    }
}

