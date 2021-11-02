package com.example.kolveniershofapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kolveniershofapp.databinding.FragmentBusPlannerBinding
import androidx.databinding.DataBindingUtil.inflate

class BusPlannerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentBusPlannerBinding = inflate(inflater, R.layout.fragment_bus_planner, container, false)
        return binding.root
    }
}