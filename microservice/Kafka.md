
# Kafka

## Broker
1. Always a Number is id

Does
1. Recieve
1. Assign Offsets 
1. Commits message to disk
Consumer
1. Responds to fetch
1. 

## Cluster
1. Group of Broker is called cluster
1. 

## Zookeeper

## Topics

## Partition
1. Topics are split
1. Each partition was independent offset starting from Zero
1. Order is only guaranteed within Partition
1. Random assigned if Partion key is not specified

## Producers
Which broker and partition to write to taken by Cluster

1. 0
1. 1
1. all
## Consumer
Consumer knows how to get data
1. Client keeps track of Offset
1. Offset stored in Topic
1. One Consumer consumes one Partition of Topic

## Consumer Group
1. One or More Consumer
1. Withing ConsumerGroup only one consumer talks to on partition



## Reference
https://www.linkedin.com/learning/learn-apache-kafka-for-beginners/topic-replication
