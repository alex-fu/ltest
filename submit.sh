SPARK_HOME="/opt/spark-2.0.2-bin-hadoop2.6"
$SPARK_HOME/bin/spark-submit --class SMSClassifier ./target/scala-2.11/ltest-assembly-1.0.jar ./SMSSpamCollection
