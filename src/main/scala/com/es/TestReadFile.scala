package com.es

import com.es.file.ScalaFileReader

/**
  * Created by Administrator on 2019/4/8.
  */
object TestReadFile {

  def main(args: Array[String]): Unit = {
    println("start test !")
    //读取文件内容
    ScalaFileReader.readFile()
  }
}
