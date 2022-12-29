package com.example.dynamicworkscheduler

import java.util.*

class Task(
    var taskID: String? = null,
    var title: String? = null,
    var priority: Int? = null,
    var category: String? = null,
    var startDate: Date? = null,
    var deadlineDate: Date? = null,
    var description:String? = null,
    var duration:Int? = null,
    var startTime: String? = null,
    var endTime: String? = null,
    var status:String? = null,
    var weekNumber:Int? = null,
):java.io.Serializable {
//    var data:Int = 0
//    init{
//        print(data)
//    }
}