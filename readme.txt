req: jdk


javac -d build src/lib/hmap/MiniHashMap.java
jar cf lib/MiniHashMap.jar -C build .

javac -cp lib/MiniHashMap.jar -d build src/Main.java
java -cp build Main