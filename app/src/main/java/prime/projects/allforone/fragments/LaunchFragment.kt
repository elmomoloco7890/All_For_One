package prime.projects.allforone.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import prime.projects.allforone.R
import prime.projects.allforone.adapters.AllForOneLaunchAdapter
import prime.projects.allforone.adapters.AllForOneLaunchClickListener
import prime.projects.allforone.adapters.data.AllForOneLaunch
import prime.projects.allforone.databinding.FragmentLaunchBinding
import prime.projects.allforone.model.AllForOneViewModel


class LaunchFragment : Fragment(), AllForOneLaunchClickListener  {


    private var binding: FragmentLaunchBinding ?= null

    private val sharedViewModel: AllForOneViewModel by activityViewModels()

    private lateinit var adapter: AllForOneLaunchAdapter

    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        val launchBinding = FragmentLaunchBinding.inflate(inflater, container, false)
        binding = launchBinding
        return launchBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = AllForOneLaunchAdapter(sharedViewModel, this)
        binding?.apply {
            launchFragment = this@LaunchFragment
            launchAdapter = adapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    override fun onAllForOneLaunchClicked(allForOneLaunch: AllForOneLaunch) {
        for (numbers in 1..3){
            if (numbers == 1){
                toasts(requireActivity(), allForOneLaunch.allForOneLabel)
                launchTo()
                break
            }
        }
    }



    private fun launchTo(){
        launchToChat()
        launchToCall()
    }

    private fun launchToChat() {
        navController = findNavController()
        val currentFragment = navController.currentDestination?.id
        when(navController.graph.startDestinationId == currentFragment){
            true -> navController.navigate(R.id.action_launchFragment_to_chatFragment)
            else -> toasts(requireActivity(), "Cannot find null")
        }
    }

    private fun launchToCall(){
        navController = findNavController()
        val currentFragment = navController.currentDestination?.id
        when(navController.graph.startDestinationId == currentFragment){
            true -> navController.navigate(R.id.action_launchFragment_to_callFragment)
            else -> toasts(requireActivity(), "Cannot find null")
        }
    }




    private fun toasts(activity: Context, message: String){
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
    }


}