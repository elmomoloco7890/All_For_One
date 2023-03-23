package prime.projects.allforone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import prime.projects.allforone.R
import prime.projects.allforone.databinding.FragmentCallBinding
import prime.projects.allforone.model.AllForOneViewModel


class CallFragment : Fragment() {

    private val binding: FragmentCallBinding ?= null

    private val sharedViewModel: AllForOneViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_call, container, false)
    }


}