package com.es

import com.es.dataFrame.DataFrameAPI

/**
  * Created by Administrator on 2019/4/8.
  */
object TestJoinDataFrame {

  def main(args: Array[String]): Unit = {
    println("start test joinDataFrame!")

    //DataFrame对象上的join操作
    DataFrameAPI.joinDataFrame()

  }
}