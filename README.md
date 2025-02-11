# 📜 BNF-Grammar-Processor-Java-Collections-Recursion

This project is a **Java-based Backus-Naur Form (BNF) grammar processor** that uses **Java Collections** and **Recursion** to store and expand structured BNF rules into all possible valid strings.

## 📌 Features
- **Parses and Stores BNF Rules**: Reads structured BNF grammar from an input file and stores it using Java Collections.
- **Recursively Expands BNF**: Generates all possible valid strings based on the given grammar rules.
- **Supports Non-Terminal and Terminal Symbols**:
  - **Non-Terminals**: Uppercase symbols (e.g., `S`, `A`, `B`).
  - **Terminals**: Lowercase symbols (e.g., `a`, `b`).
- **File-Based Input & Output**:
  - Reads **BNF grammar rules** from an input file.
  - Outputs **all possible valid strings** to an output file.

## 🎮 How It Works
1. The program reads a structured BNF grammar definition from `input.txt`.
2. It stores BNF production rules using **Java Collections**.
3. The program recursively expands the starting symbol (`S`) until only terminal symbols remain.
4. All possible valid strings are written to `output.txt`.


## 🚀 Running the Program
Compile and run the game using:
```bash
javac8 BNF.java
java8 BNF input.txt output.txt


