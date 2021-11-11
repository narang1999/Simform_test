package com.example.simform_test.view.main

import android.annotation.SuppressLint
import android.util.Log
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.simform_test.R
import com.example.simform_test.databinding.UserItemBinding
import com.example.simform_test.extention.inflateChild
import com.example.simform_test.extention.loadFromURL
import com.example.simform_test.models.Example

class UsersAdapter : ListAdapter<Example, RecyclerView.ViewHolder>(diffCallback) {
    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<Example>() {
            override fun areItemsTheSame(oldItem: Example, newItem: Example): Boolean =
                oldItem == newItem

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(oldItem: Example, newItem: Example): Boolean =
                oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        PostViewHolder(UserItemBinding.bind(parent.inflateChild(R.layout.user_item)))


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is PostViewHolder) {
            holder.bind(getItem(position))
        }
    }


    private inner class PostViewHolder(val binding: UserItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bind(item: Example) {
            Log.i("mani", "" + item.name)
            binding.categoryGroupIcon.loadFromURL(item.picture.thumbnail)
            binding.name.text = item.name.title + item.name.last
            binding.email.text = item.email
            binding.phone.text = item.phone
            binding.root.setOnClickListener {
              it.findNavController().navigate( UsersDirections.actionUsersToUserDetail(item))
            }
        }
    }
}