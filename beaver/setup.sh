#!/bin/sh
cd /home/motao/mt
stop-all.sh
sudo rm -rf /tmp/hadoop-*
sudo rm -rf /tmp/hive*
sudo rm -rf /tmp/hsperfdata_*
hadoop namenode -format
start-dfs.sh
hadoop fs -chmod -R 777 hdfs://localhost:9000/
sudo ${SPARK_HOME}/bin/spark-shell

