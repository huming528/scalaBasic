package com.es

import com.es.dataFrame.DataFrameAPI

/**
  * Created by Administrator on 2019/4/8.
  */
object TestGroupbyDataFrame {
  def main(args: Array[String]): Unit = {
    println("start test groupbyDataFrame!")

    //针对DataFrame数据进行group by操作
    DataFrameAPI.groupbyDataFrame()
  }
}
