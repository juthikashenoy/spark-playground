Spark Playground
================
Sumo Apache Spark playground

###  Examples
1. Spark Batch
2. Spark Streaming
3. Spark Machine Learning

###  Setup

#### Manual Installation (Windows)

1. Install Scala via [SDK](http://sdkman.io/)
    `sdk install scala 2.11.8`
2. Install Apache Spark
    Install spark e.g., *spark-1.6.2-bin-hadoop2.6*
    `export SPARK_HOME=/Developer/Applications/spark-1.6.2-bin-hadoop2.6`

#### Install via brew (Mac)
```bash
brew update
brew install scala
brew install apache-spark
```

### Build All

```bash
gradle installShadowApp
```

### Run

> To run locally, change dependencies in `{sub-project}/build.gradle` from *compileOnly* to *compile*
> Remove *output* directory before re-run

#### Run Local

```
gradle {sub-project}:run
gradle spark-batch:run
```

In IDEs like IntelliJ, you can right-click the file and run directly.

#### Run on Spark Standalone

> Execute on Spark Cluster, Kotlin maven coordinates must be passed so its classes can be used
```bash
$SPARK_HOME/bin/spark-submit \
    --class com.sumo.experiments.WordCount \
    --master local[4] \
    --packages "org.jetbrains.kotlin:kotlin-stdlib:1.0.2" \
    {sub-project}/build/installShadow/{sub-project}/lib/{sub-project}-0.1.0-SNAPSHOT-all.jar
```


#### Run on Spark Cluster
