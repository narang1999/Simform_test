package com.example.simform_test.view.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import com.example.simform_test.R
import com.example.simform_test.databinding.UsersFragmentBinding
import com.example.simform_test.extention.viewBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import org.koin.android.ext.android.inject


class Users : Fragment(R.layout.users_fragment) {

    private val binding by viewBinding(UsersFragmentBinding::bind)
    private val viewModel: UsersViewModel by inject()
    private var mainAdapter: UsersAdapter? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainAdapter = UsersAdapter()
        binding.postData.adapter = mainAdapter
        subscribeUI()
    }

    private fun subscribeUI() {
        viewModel.postData.observe(viewLifecycleOwner) {
            mainAdapter?.submitList(it)
        }
        viewModel.error.observe(viewLifecycleOwner) {
            MaterialAlertDialogBuilder(requireContext(), R.style.AlertDialogMaterialTheme)
                .setTitle("Oops")
                .setMessage("Unfortunately, something went wrong. Please try again later.")
                .setPositiveButton(android.R.string.ok, null)
                .show()

        }
    }
}