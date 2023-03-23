package prime.projects.allforone.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import prime.projects.allforone.adapters.data.AllForOneLaunch
import prime.projects.allforone.databinding.LaunchRowItemsBinding
import prime.projects.allforone.model.AllForOneViewModel

class AllForOneLaunchAdapter(
    private val viewModel: AllForOneViewModel,
    private val clickListener: AllForOneLaunchClickListener
): RecyclerView.Adapter<AllForOneLaunchAdapter.LaunchViewHolder>() {

    private lateinit var binding: LaunchRowItemsBinding

    class LaunchViewHolder(var launchView: LaunchRowItemsBinding): RecyclerView.ViewHolder(launchView.root){
        fun bind(currentLaunchItem: AllForOneLaunch, listener: AllForOneLaunchClickListener){
            launchView.allForOneLaunch = currentLaunchItem
            launchView.allForOneLaunchedClicked = listener
            launchView.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int): LaunchViewHolder {
        val launchItemBinding = LaunchRowItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        binding = launchItemBinding
        return LaunchViewHolder(launchItemBinding)
    }

    override fun getItemCount(): Int =
        viewModel.getLaunchItemCount()

    override fun onBindViewHolder(holder: LaunchViewHolder, position: Int) =
        holder.bind(viewModel.getLaunchItems(position), clickListener)
}