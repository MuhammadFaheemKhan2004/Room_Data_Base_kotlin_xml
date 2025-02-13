package com.example.room_database.fragments.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.room_database.R
import com.example.room_database.fragments.add.AddFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class LeafFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_leaf, container, false)

        val floatButton = view.findViewById<FloatingActionButton>(R.id.floatingActionButton)
        floatButton.setOnClickListener {
            loadFragment(AddFragment())  // Load AddFragment when clicked
        }

        return view
    }

    private fun loadFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, fragment)
            .addToBackStack(null)  // Allows back navigation
            .commit()
    }
}
