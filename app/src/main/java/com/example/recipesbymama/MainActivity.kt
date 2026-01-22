package com.example.recipesbymama

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.recipesbymama.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding= ActivityMainBinding.inflate(layoutInflater);


        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setbBtnStart();

    }
    public fun setbBtnStart()
    {
        binding.btnMyRecipes.setOnClickListener {

            val intent: Intent = Intent(this, MyRecipes::class.java)
            startActivity(intent);

        };
        binding.btnNewRecipe.setOnClickListener {

            val intent: Intent = Intent(this, NewRecipe::class.java)
            startActivity(intent);

        };
        binding.btnWeeklyDiet.setOnClickListener {
            val intent: Intent = Intent(this, WeeklyDiet::class.java)
            startActivity(intent);

        }

    }

}