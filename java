#!/data/data/com.termux/files/usr/bin/sh

export LD_PRELOAD=
export LD_LIBRARY_PATH=/data/data/com.termux/files/home/java/openjdk/lib/arm:$LD_LIBRARY_PATH

exec /data/data/com.termux/files/home/java/openjdk/bin/java -Xmx1024m "$@"
