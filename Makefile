run:
	java -cp build Main

build-lib:
	javac -d build src/lib/hmap/MiniHashMap.java
	jar cf lib/MiniHashMap.jar -C build .

build-main:
	javac -cp lib/MiniHashMap.jar -d build src/Main.java

build: build-lib build-main

rm:
	rm -rf build lib