package vn.edu.hust.lesson8examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import vn.edu.hust.lesson8examples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.buttonAdd.setOnClickListener {
            viewModel.increaseCount()
        }
    }
}