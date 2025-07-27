package com.example.movielister.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.movielister.R
import com.example.movielister.databinding.FragmentSignupBinding

class SignupFragment : Fragment(R.layout.fragment_signup) {

    private lateinit var binding: FragmentSignupBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSignupBinding.bind(view)

        binding.signupButton.setOnClickListener{
            val username = binding.usernameInput.editText?.text.toString()
            val password = binding.passwordInput.editText?.text.toString()
            // Add user with username and password into firebase
                view.findNavController().navigate(R.id.action_signupFragment_to_LoginFragment)

        }
    }
}