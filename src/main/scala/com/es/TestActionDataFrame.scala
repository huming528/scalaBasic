package com.es

import com.es.dataFrame.DataFrameAPI

/**
  * Created by Administrator on 2019/4/8.
  */
object TestActionDataFrame {

  def main(args: Array[String]): Unit = {
    println("start test actionDataFrame!")
    //DataFrame对象上Action操作
    DataFrameAPI.actionDataFrame()
  }
}
