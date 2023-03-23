package prime.projects.allforone.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import prime.projects.allforone.adapters.data.AllForOneCall
import prime.projects.allforone.databinding.CallRowItemsBinding
import prime.projects.allforone.model.AllForOneViewModel

class AllForOneCallAdapter(
    private val viewModel: AllForOneViewModel,
    private val callListener: AllForOneCallListener
): RecyclerView.Adapter<AllForOneCallAdapter.CallViewHolder>() {

    private lateinit var binding: CallRowItemsBinding

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): CallViewHolder {
     val callItemBinding = CallRowItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
     binding = callItemBinding
     return CallViewHolder(callItemBinding)
    }

    override fun getItemCount(): Int =
        viewModel.getCallItemSize()

    override fun onBindViewHolder(holder: CallViewHolder, position: Int) =
        holder.bind(viewModel.getCallItems(position), callListener)

    class CallViewHolder(var callView: CallRowItemsBinding): RecyclerView.ViewHolder(callView.root){
        fun bind(currentCall: AllForOneCall, listener: AllForOneCallListener){
            callView.allForOneCall = currentCall
            callView.allForOneClicked = listener
            callView.executePendingBindings()
        }
    }

}