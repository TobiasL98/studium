@echo off
if "%1"=="testTool" java -cp antlr-4.11.1-complete.jar org.antlr.v4.Tool
if "%1"=="generate"	java -cp antlr-4.11.1-complete.jar org.antlr.v4.Tool Expr.g4
if "%1"=="compile"	javac -cp antlr-4.11.1-complete.jar Expr.java
if "%1"=="test"		java -cp .;antlr-4.11.1-complete.jar org.antlr.v4.gui.TestRig Expr tokens -tokens %2
