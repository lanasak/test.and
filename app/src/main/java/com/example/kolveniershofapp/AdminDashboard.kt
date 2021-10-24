package com.example.kolveniershofapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.inflate
import androidx.navigation.findNavController

import com.example.kolveniershofapp.databinding.FragmentAdmindashboardBinding
import com.example.kolveniershofapp.databinding.FragmentCalendarBinding
import com.example.kolveniershofapp.databinding.FragmentLoginBinding

class AdminDashboard : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //val binding = DataBindingUtil.bind()

        val binding: FragmentAdmindashboardBinding = inflate(inflater, R.layout.fragment_admindashboard, container, false)

        binding.DagPlanning.setOnClickListener{
                v: View -> v.findNavController().navigate(R.id.action_dashBoardFragment_to_calendarFragment)
        }

        binding.Clienten.setOnClickListener{
                v: View -> v.findNavController().navigate(R.id.action_dashBoardFragment_to_clientFragment)
        }

        binding.BusPlanning.setOnClickListener{
                v: View -> v.findNavController().navigate(R.id.action_dashBoardFragment_to_busPlanning)
        }

        return binding.root
    }

}