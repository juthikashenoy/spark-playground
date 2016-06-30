package com.sumo.experiments

import org.apache.spark.SparkConf
import org.apache.spark.api.java.JavaSparkContext
import scala.Tuple2
import java.util.*

object WordCount {

    lateinit var inputFile : String;

    @JvmStatic fun main(args: Array<String>) {

        if (args.size < 1) {
            System.err.println("Please provide the input file full path as argument")
//            System.exit(0)
        }

        inputFile = if (args.size >=1) args[0] else "README.md"

        val conf = SparkConf().setAppName("com.sumo.experiments.WordCount").setMaster("local")
        val context = JavaSparkContext(conf)

        context.textFile(inputFile).flatMap { elem -> Arrays.asList(elem.split(" ")) }
            .mapToPair { elem -> Tuple2(elem, 1) }  // Create Tuple of form (word, 1)
            .reduceByKey { a, b -> a!! + b!! }      // Sum up identical words (word, n)
            .mapToPair { it.swap() }                // Swap tuple (n, word)
            .sortByKey()                            // Sort by n (default = ascending)
            .saveAsTextFile("output")               // Save output in folder "output"
    }
}
