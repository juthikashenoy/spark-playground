Apache Spark Batch
==================
Spark Batch examples.

* WordCount
* WordCount


### Build

```bash
gradle spark-batch:installShadowApp
```

### Run

```bash
gradle spark-batch:run
```

#### Run on Spark Standalone

Execute in Spark, Kotlin maven coordinates must be passed so its classes can be used:
```
$SPARK_HOME/bin/spark-submit \
    --class com.sumo.experiments.WordCount \
    --master local[4] \
    --packages "org.jetbrains.kotlin:kotlin-stdlib:1.0.2" \
    spark-batch/build/installShadow/spark-batch/lib/spark-batch-0.1.0-SNAPSHOT-all.jar
```

#### Run on Spark Cluster
