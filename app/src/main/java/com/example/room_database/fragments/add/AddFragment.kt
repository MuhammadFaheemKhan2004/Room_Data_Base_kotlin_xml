package com.example.room_database.fragments.add

import android.annotation.SuppressLint
import android.health.connect.datatypes.units.Length
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
///import com.example.room_database.ARG_PARAM1
//import com.example.room_database.ARG_PARAM2
import com.example.room_database.R
import com.example.room_database.data.User
import com.example.room_database.data.viewModel
import com.example.room_database.data.user_dao
import com.google.android.material.floatingactionbutton.FloatingActionButton

/**
 * A simple [Fragment] subclass.
 * Use the [addFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddFragment : Fragment() {
    private lateinit var userviewModel: viewModel



    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add, container, false)
        val add_first_name= view.findViewById<EditText>(R.id.first_name)
        val add_last_name= view.findViewById<EditText>(R.id.last_name)
        val add_age= view.findViewById<EditText>(R.id.age)




           // userviewModel = ViewModelProvider(this)[viewModel ::class.java]


         val addButton = view.findViewById<Button>(R.id.a_button)

       addButton.setOnClickListener {
           Log.d("AddFragment", "Received  users")
Toast.makeText(requireContext(),"added",Toast.LENGTH_LONG).show()
           insertDataToDataBase(add_first_name.text.toString(), add_last_name.text.toString(),
               add_age.text.toString()
           )

        }
        return view
    }
   private fun insertDataToDataBase(
        f:String,  l:String, a:String
                             ){

        Log.d("AddFragment", "Received  users")
        Toast.makeText(requireContext(),"added",Toast.LENGTH_LONG).show()

        val user= User(0,f,l,a)
        userviewModel = ViewModelProvider(this)[viewModel::class.java]
       // val testUser = User(0, "John", "Doe", 25)
        userviewModel.adduser(user)


        //  findNavController().navigate(R.id.action_addFragment_to_leafFragment)

    }

}