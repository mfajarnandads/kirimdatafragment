package com.example.kirimdatafragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [datafragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class datafragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_datafragment, container, false)
        val tvData = v.findViewById<TextView>(R.id.tvData)
        if (arguments != null) {
            val nim = requireArguments().getString("nim")
            val nama = requireArguments().getString("nama")
            val prodi = requireArguments().getString("prodi")
            tvData.text = """"
                NIM: $nim
                Nama: $nama
                Program Studi: $prodi
                """.trimIndent()
        }
        return v
    }
}