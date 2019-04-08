package com.es

import com.es.dataFrame.DataFrameAPI

/**
  * Created by Administrator on 2019/4/8.
  */
object TestQueryDataFrame {
  def main(args: Array[String]): Unit = {
    println("start test queryDataFrame!")

    //DataFrame对象上的条件查询操作
    DataFrameAPI.queryDataFrame()
  }
}
