package com.example.kolveniershofapp

import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        view?.findNavController()?.navigate(R.id.action_LoginFragment_To_AdminFragment)

        return inflater.inflate(R.layout.fragment_login, container, false)
    }

}