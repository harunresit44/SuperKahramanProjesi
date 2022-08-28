package com.harunkaraca.superkahramanprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(){
            val isim = isimText.text.toString()
            val yas = yasText.text.toString().toIntOrNull()
            val meslek = meslekText.text.toString()

            if (yas == null){
                sonucText.text = "Doğru yaşı giriniz"
            } else{
                val superkahraman = SuperKahraman(isim,yas,meslek)

                sonucText.text = "name: ${superkahraman.isim} age: ${superkahraman.yas} job: ${superkahraman.meslek}"

            }


        }
    }
}