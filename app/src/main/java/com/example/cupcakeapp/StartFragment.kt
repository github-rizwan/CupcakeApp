package com.example.cupcakeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.cupcakeapp.databinding.FragmentStartBinding


class StartFragment : Fragment() {

    private var binding: FragmentStartBinding?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentStartBinding.inflate(inflater,container,false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            orderOneCupcake.setOnClickListener { orderCupCake(1) }
            orderSixCupcakes.setOnClickListener { orderCupCake(6) }
            orderTwelveCupcakes.setOnClickListener { orderCupCake(12) }
        }
    }

    fun orderCupCake(quantity: Int)
    {
        Toast.makeText(activity,"Ordered $quantity cupcakes(s)",Toast.LENGTH_LONG).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}