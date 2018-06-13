package com.mtw.juancarlos.todolistapp.database

import java.util.*

// TODO (2) Annotate the class with Entity. Use "task" for the table name
data class TaskEntry (var id:Long = 0 ,var description:String, var priority:Int, var updatedAt:Date)
// TODO (3) Annotate the id as PrimaryKey. Set autoGenerate to true.