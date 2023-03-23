package prime.projects.allforone.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import prime.projects.allforone.adapters.data.AllForOneChat
import prime.projects.allforone.databinding.ChatRowItemsBinding
import prime.projects.allforone.model.AllForOneViewModel

class AllForOneChatAdapter(
    private val viewModel: AllForOneViewModel,
    private val chatListener: AllForOneChatListener
    ): RecyclerView.Adapter<AllForOneChatAdapter.ChatViewHolder>(){

        private lateinit var binding: ChatRowItemsBinding

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ChatViewHolder {
        val chatBinding = ChatRowItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        binding = chatBinding
        return ChatViewHolder(chatBinding)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) =
        holder.bind(viewModel.getChatItems(position), chatListener)

    override fun getItemCount(): Int = viewModel.getChatItemSize()

    class ChatViewHolder(var chatView: ChatRowItemsBinding):RecyclerView.ViewHolder(chatView.root){
        fun bind(currentChatItem: AllForOneChat, listener: AllForOneChatListener){
            chatView.allForOneChat = currentChatItem
            chatView.allForOneChatClicked = listener
            chatView.executePendingBindings()
        }
    }


}