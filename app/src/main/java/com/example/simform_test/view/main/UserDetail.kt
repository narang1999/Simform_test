package com.example.simform_test.view.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.example.simform_test.R
import com.example.simform_test.databinding.UserDetailBinding
import com.example.simform_test.extention.viewBinding


class UserDetail : Fragment(R.layout.user_detail) {
    private val binding by viewBinding(UserDetailBinding::bind)
    private val args: UserDetailArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        context?.let {
            Glide.with(it)
                .load(args.userData.picture.large)
                .fitCenter()
                .transition(DrawableTransitionOptions.withCrossFade(300)).centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(binding.image)
        }
        binding.name.text = args.userData.toString()
    }
}