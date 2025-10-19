# java-rpg
A simple text-based Java RPG game.

# Prerequisites
- Java JDK 11 or newer with `javac` and `java` added to your PATH.

# How to run
1. Clone the repository:
    ```bash
    git clone https://github.com/jb-cheng/java-rpg.git
    ```
2. Change into the project directory:
    ```bash
    cd java-rpg
    ```
3. Create the output directory and compile the source files:
    ```bash
    mkdir -p bin
    javac -d bin src/*.java
    ```
4. Run the game:
    ```bash
    java -cp bin Main
    ```

# Alternate How to run
Just run the existing game.jar file after cloning the repository:
``` powershell
java -jar .\game.jar
```