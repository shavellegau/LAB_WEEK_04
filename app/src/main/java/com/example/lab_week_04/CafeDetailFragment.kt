package com.example.lab_week_04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CafeDetailFragment : Fragment() {

    companion object {
        private const val ARG_DESC = "cafe_desc"

        fun newInstance(desc: String): CafeDetailFragment {
            val fragment = CafeDetailFragment()
            val bundle = Bundle()
            bundle.putString(ARG_DESC, desc)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cafe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.text_cafe_desc)
        val desc = arguments?.getString(ARG_DESC)
        textView.text = desc
    }
}
