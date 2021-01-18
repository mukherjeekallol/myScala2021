package com.learning.myScala.kallol

import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession

object helloSpark extends  App{

  val spark = SparkSession
    .builder
    .appName(name="helloSpark")
    .config("spark.master","local")
    .getOrCreate()

  val sampleSeq = Seq((1,"spark"),(2,"Bigdata"))
  val df = spark.createDataFrame(sampleSeq).toDF()
  df.show()
}
