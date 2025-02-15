package com.example.room_database.fragments.list

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.room_database.R
import com.example.room_database.data.viewModel
import com.example.room_database.fragments.add.AddFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class LeafFragment : Fragment() {
    private lateinit var userviewModel: viewModel

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {







        val view = inflater.inflate(R.layout.fragment_leaf, container, false)

        val adapter=Listadapter()
        val recyclerView=view.findViewById<RecyclerView>(R.id.U_recyclerView)
        recyclerView.adapter=adapter
        recyclerView.layoutManager= LinearLayoutManager(requireContext())
      //  userviewModel= ViewModelProvider(this).get(viewModel ::class.java)
        userviewModel = ViewModelProvider(this)[viewModel::class.java]
        userviewModel.readAllData.observe(viewLifecycleOwner, Observer {    user ->
            Log.d("LeafFragment", "Received ${user.size} users")
           adapter.setData(user)

       })

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
