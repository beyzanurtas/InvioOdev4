package com.beyzanurtas.invioodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.beyzanurtas.invioodev4.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)
        binding.buttontoa.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anasayfaFragment_to_AFragment)
        }
        binding.buttontox.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anasayfaFragment_to_XFragment)
        }
        return binding.root
    }
}