package prime.projects.allforone.model

import androidx.lifecycle.ViewModel
import prime.projects.allforone.adapters.data.AllForOneCall
import prime.projects.allforone.adapters.data.AllForOneChat
import prime.projects.allforone.adapters.data.AllForOneLaunch
import prime.projects.allforone.adapters.repos.AllForOneCallRepo
import prime.projects.allforone.adapters.repos.AllForOneChatRepo
import prime.projects.allforone.adapters.repos.AllForOneLaunchRepo

class AllForOneViewModel: ViewModel() {

    var launchRepo = AllForOneLaunchRepo()
    var callRepo = AllForOneCallRepo()
    var chatRepo = AllForOneChatRepo()

    var launchArray = launchRepo.getLaunchData()
    var callArray = callRepo.getCallInfo()
    var chatArray = chatRepo.getChatInfo()

    fun getLaunchItems(position: Int): AllForOneLaunch {
        return launchArray[position]
    }

    fun getLaunchItemCount() : Int {
        return launchArray.size
    }

    fun getCallItems(position: Int): AllForOneCall {
        return callArray[position]
    }

    fun getCallItemSize() : Int {
        return chatArray.size
    }

    fun getChatItems(position: Int) : AllForOneChat {
        return chatArray[position]
    }

    fun getChatItemSize(): Int {
        return chatArray.size
    }

}