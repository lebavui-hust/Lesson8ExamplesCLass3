package vn.edu.hust.lesson8examples

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import vn.edu.hust.lesson8examples.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBlankBinding.inflate(inflater)
        return binding.root
    }
}