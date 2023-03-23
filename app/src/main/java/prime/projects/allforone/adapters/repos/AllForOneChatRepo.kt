package prime.projects.allforone.adapters.repos

import prime.projects.allforone.adapters.data.AllForOneChat

class AllForOneChatRepo {

    /*lateinit var callLabels: Array<String>
    lateinit var callPhNumbers: Array<String>*/

    lateinit var allForOneChatLabelId: Array<String>
    lateinit var allForOneChatNumberList: Array<String>

    fun getChatInfo(): ArrayList<AllForOneChat>{
        val chatInfoArray: ArrayList<AllForOneChat> = ArrayList()

            allForOneChatLabelId = arrayOf(
                "Teen Crisis Hotline",
                "Crisis hotline",
                "Test Number"
            )

            allForOneChatNumberList = arrayOf(
                "4808441212",
                "6022733300",
                "4806941047"
            )

        for (sent in allForOneChatLabelId.indices){
            chatInfoArray.add(AllForOneChat(allForOneChatLabelId[sent], allForOneChatNumberList[sent]))
        }

        return chatInfoArray
    }
}