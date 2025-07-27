package com.example.movielister.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.movielister.R
import com.example.movielister.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login){

    private lateinit var binding:FragmentLoginBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)

        binding.submitButton.setOnClickListener{
            val username = binding.usernameInput.editText?.text.toString()
            val password = binding.passwordInput.editText?.text.toString()
            val authentication = true;

            // Check if the user exists in firebase
            // If true navigate them to mainFragment
            // If false navigate them back
            // change authentication to be based on firebase
            if(authentication)
            view.findNavController().navigate(R.id.action_LoginFragment_to_mainFragment)
            else
                view.findNavController().navigate(R.id.action_loginFragment_self)
        }
        binding.signupButton.setOnClickListener{
            view.findNavController().navigate(R.id.action_LoginFragment_to_signupFragment)
        }

    }
}