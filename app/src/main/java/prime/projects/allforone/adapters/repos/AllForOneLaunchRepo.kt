package prime.projects.allforone.adapters.repos

import prime.projects.allforone.R
import prime.projects.allforone.adapters.data.AllForOneLaunch

class AllForOneLaunchRepo {

    lateinit var allForOneLaunchLabel: Array<String>
    lateinit var allForOneLaunchIcons: Array<Int>

    fun getLaunchData(): ArrayList<AllForOneLaunch> {
        val allForOneLaunchArray: ArrayList<AllForOneLaunch> = ArrayList()

        allForOneLaunchLabel = arrayOf(
            "Call someone",
            "Chat with someone",
            "Submit a concern"
        )

        allForOneLaunchIcons = arrayOf(
            R.drawable.telephone50,
            R.drawable.messages50,
            R.drawable.collaboration50,
        )

        for (launch in allForOneLaunchIcons.indices){
            allForOneLaunchArray.add(AllForOneLaunch(allForOneLaunchIcons[launch], allForOneLaunchLabel[launch]))
        }

        return allForOneLaunchArray
    }
}