package com.example.educacionitanimaciones

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.btn_for_nav)
        val boton2 = findViewById<Button>(R.id.btn_new_animation)
        boton.setOnClickListener {

            animationTransition()

        }

        boton2.setOnClickListener {

            animationTransition2()

        }

    }

    private fun animationTransition2() {
        val intent = Intent(this, MainActivity2::class.java)

        val image = findViewById<ImageView>(R.id.image_view_persistent)

        val pair1: Pair<View, String> = Pair.create(image,"image_for_example")

        val option = ActivityOptionsCompat.makeSceneTransitionAnimation(this, pair1)

        startActivity(intent, option.toBundle())

    }

    private fun animationTransition() {

        //val intent = Intent(this,MainActivity2::class.java)
        //startActivity(intent)

        startActivity(Intent(this, MainActivity2::class.java))
        overridePendingTransition(R.anim.anim_right_in,R.anim.anim_left_out)
    }
}