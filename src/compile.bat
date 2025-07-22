@echo off
echo Compiling Java files...
if not exist out mkdir out
javac -d out src/*.java
echo Compilation complete.
pause
