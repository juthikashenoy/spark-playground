Spark Playground
================
Sumo Apache Spark playground

###  Examples
1. Spark Batch
2. Spark Streaming
3. Spark Machine Learning

###  Setup


### Run

#### Run Local

#### Run on Cluster

> Execute on Spark Cluster, Kotlin maven coordinates must be passed so its classes can be used
```bash
$SPARK_HOME/bin/spark-submit \
    --class com.sumo.experiments.WordCount \
    --master local[4] \
    --packages "org.jetbrains.kotlin:kotlin-stdlib:1.0.2" \
    target/spark-batch-0.1.0-SNAPSHOT-all.jar
```


