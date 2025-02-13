package com.example.room_database.fragments.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
///import com.example.room_database.ARG_PARAM1
//import com.example.room_database.ARG_PARAM2
import com.example.room_database.R

/**
 * A simple [Fragment] subclass.
 * Use the [addFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddFragment : Fragment() {
    // TODO: Rename and change types of parameters
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private val ARG_PARAM1 = "param1"
    private  val ARG_PARAM2 = "param2"
    private var param1: String? = null
    private var param2: String? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add, container, false)
    }


}