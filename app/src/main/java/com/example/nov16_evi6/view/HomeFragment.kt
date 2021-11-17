package com.example.nov16_evi6.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.nov16_evi6.R
import com.example.nov16_evi6.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var b:FragmentHomeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        b = FragmentHomeBinding.inflate(inflater,container,false)
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupButton(view)
    }

    private fun setupButton(view: View) {
            b.btn4.setOnClickListener {
                Navigation.findNavController(b.root).navigate(R.id.action_blankFragment2_to_blankFragment)
            }
    }
}