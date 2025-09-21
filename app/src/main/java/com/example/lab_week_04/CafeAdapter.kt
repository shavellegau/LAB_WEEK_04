package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

// List tab judul (pakai string dari strings.xml)
val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title
)

class CafeAdapter(
    private val parentFragment: Fragment,  // simpan fragment sebagai sumber context
    fm: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fm, lifecycle) {

    override fun getItemCount(): Int = TABS_FIXED.size

    override fun createFragment(position: Int): Fragment {
        val context = parentFragment.requireContext()
        val desc = when (position) {
            0 -> context.getString(R.string.starbucks_desc)
            1 -> context.getString(R.string.janjijiwa_desc)
            2 -> context.getString(R.string.kopikenangan_desc)
            else -> "No description available"
        }
        return CafeDetailFragment.newInstance(desc)
    }
}
