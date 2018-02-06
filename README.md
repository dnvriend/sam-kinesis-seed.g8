![Logo image](img/sbtscalasamlogo_small.png)

# sam-kinesis-seed.g8
A template project for quickly creating serverless applications that publish to Amazon Kinesis. For more information see [sbt-sam](https://github.com/dnvriend/sbt-sam)

## Usage
Create a new template project by typing:

```
sbt new dnvriend/sam-kinesis-seed.g8
```

## Deploy
- To deploy the project type `samDeploy`
- To remove the project type `samRemove`
- To get deployment information like available endpoints and stack information, type `samInfo`

## Kinesis Limits
Lambda only pulls Kinesis records every 200 ms. Kinesis limits read requests to five per second on each shard.
Batch size: Valid Range: Minimum value of 1. Maximum value of 10000, default: 100
TRIM_HORIZON - Start reading at the last untrimmed record in the shard in the system, which is the oldest data record in the shard.
LATEST - Start reading just after the most recent record in the shard, so that you always read the most recent data in the shard.
