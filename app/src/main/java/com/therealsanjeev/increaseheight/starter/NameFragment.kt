package com.therealsanjeev.increaseheight.starter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.therealsanjeev.increaseheight.R
import com.therealsanjeev.increaseheight.databinding.FragmentNameBinding

class NameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding:FragmentNameBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_name, container,false
        )

        binding.nextBtnName.setOnClickListener {
            Toast.makeText(context, "This is Gender Fragment", Toast.LENGTH_SHORT).show()
        }

        // Inflate the layout for this fragment
        return binding.root
    }

}