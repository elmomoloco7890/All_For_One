package prime.projects.allforone.adapters

import prime.projects.allforone.adapters.data.AllForOneCall

interface AllForOneCallListener {
    fun onAllForOneClicked(allForOneCall: AllForOneCall)
}