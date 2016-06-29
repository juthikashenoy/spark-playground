Apache Spark Batch
==================
Spark Batch examples.

* TwitterLanguageAnalyzer
* TwitterSentimentAnalyzer


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
    build/installShadow/spark-batch/libs/spark-batch-0.1.0-SNAPSHOT-all.jar
```
