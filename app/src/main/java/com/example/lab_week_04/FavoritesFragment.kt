package com.example.lab_week_04

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class FavoritesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate fragment_favorite.xml
        return inflater.inflate(R.layout.fragment_favorites, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Ambil TextView favorite latte dari XML
        val latteTextView: TextView = view.findViewById(R.id.latte)

        // Kalau diklik, navigasi ke DetailFragment
        latteTextView.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("COFFEE_ID", R.id.latte)
            Navigation.findNavController(view)
                .navigate(R.id.action_favoritesFragment_to_detailFragment, bundle)
        }
    }
}