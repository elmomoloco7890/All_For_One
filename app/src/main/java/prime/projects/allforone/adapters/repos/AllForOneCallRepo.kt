package prime.projects.allforone.adapters.repos

import prime.projects.allforone.adapters.data.AllForOneCall


class AllForOneCallRepo {

    /*lateinit var callLabels: Array<String>
    lateinit var callPhNumbers: Array<String>*/

    lateinit var allForOneLabelIds: Array<String>
    lateinit var allForOneNumberList: Array<String>

    fun getCallInfo(): ArrayList<AllForOneCall> {
        val callInfoArray: ArrayList<AllForOneCall> = ArrayList()
            allForOneLabelIds = arrayOf(
                "Call 911 now",
                "Call the teen hotline",
                "Call the Crisis Hotline",
                "Test Number"
            )
            allForOneNumberList = arrayOf(
                "511",
                "4808441212",
                "6022733300",
                "4806941047"
            )

            for (dialed in allForOneLabelIds.indices){
                callInfoArray.add(AllForOneCall(allForOneLabelIds[dialed], allForOneNumberList[dialed]))
            }

        return callInfoArray
    }
}