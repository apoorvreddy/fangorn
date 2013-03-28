#!/bin/bash
fileprefix=`date +"%m%d%H%M%S"`;
for mem in 6144 5120 4096 3072 2048 1024; do
file=`echo "$fileprefix$mem"`;
for query in `seq 0 28`; do
for join in 'MPMG1' 'MPMG2' 'STACKTREE' 'MPMG3' 'STAIRCASE' 'TWIGSTACK' 'PATHSTACK'; do
sudo sh clearcache.sh;
java -Xmx${mem}m -cp .:./fangornL4.jar:./lib/lucene-core-4.0-SNAPSHOT.jar:./lib/lucene-analyzers-common-4.0-SNAPSHOT.jar -Xmx6144m au.edu.unimelb.csse.exp.CacheEffectTest $join $query | tee -a $file;
done;
done;
done;

