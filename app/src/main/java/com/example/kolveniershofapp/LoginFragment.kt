package com.example.kolveniershofapp

import android.os.Bundle
import android.text.Layout

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.kolveniershofapp.databinding.FragmentLoginBinding
import androidx.databinding.DataBindingUtil.inflate

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding:FragmentLoginBinding = inflate(inflater, R.layout.fragment_login, container, false)

        //onclick voor navigatie
        binding.AdminLogin.setOnClickListener{
                v: View -> v.findNavController().navigate(R.id.action_LoginFragment_To_AdminFragment)
        }


        return binding.root
    }

}