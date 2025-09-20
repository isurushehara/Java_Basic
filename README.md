# Java Basic ☕️

A collection of simple Java examples and mini-programs to learn and practice core Java concepts. This repository is ideal for beginners who want hands-on practice with Java syntax and fundamentals.

Repository: https://github.com/isurushehara/Java_Basic

## What you’ll find here

Examples and exercises that illustrate concepts such as:
- Variables and data types
- Control flow (if/else, switch, loops)
- Methods and parameters
- Arrays and collections
- Object-oriented programming (classes, objects, inheritance, interfaces)
- Exceptions and basic error handling
- Basic I/O

Note: The exact topics and structure depend on the files in this repo; the instructions below will help you run any example.

---

## Prerequisites

- Java Development Kit (JDK) 11 or newer (JDK 17+ recommended)
- A terminal/command prompt
- Optional: An IDE like IntelliJ IDEA, VS Code, or Eclipse

Check your Java version:
```bash
java -version
```

---

## Getting started

### 1) Clone the repository
```bash
git clone https://github.com/isurushehara/Java_Basic.git
cd Java_Basic
```

### 2) Choose how you want to run the code

You can run the examples using:
- An IDE (easiest for beginners)
- Plain Java (javac/java) from the terminal
- Maven or Gradle (if you see a pom.xml or build.gradle in the repo)

---

## Run with an IDE

- IntelliJ IDEA:
  1. File → Open → select the `Java_Basic` folder.
  2. Let IntelliJ index the project.
  3. In the Project view, locate any class with a `public static void main(String[] args)` method.
  4. Right-click → Run.

- VS Code:
  1. Install the “Extension Pack for Java”.
  2. Open the `Java_Basic` folder.
  3. VS Code will detect main classes; click “Run” above the `main` method or use the Run and Debug panel.

---

## Run from the terminal (plain Java)

If the project does NOT use Maven/Gradle, you can compile and run with the JDK tools.

Assume your sources are under one of these:
- `src/`
- `src/main/java/`
- or the root folder with `.java` files

Replace `<SRC_DIR>` below with the correct folder (e.g., `src` or `src/main/java`).

### Compile all sources to an output folder

macOS/Linux:
```bash
mkdir -p out
find <SRC_DIR> -name "*.java" > sources.txt
javac -d out @sources.txt
```

Windows (PowerShell):
```powershell
New-Item -ItemType Directory -Force -Path out | Out-Null
Get-ChildItem -Recurse <SRC_DIR> -Filter *.java | Select-Object -ExpandProperty FullName > sources.txt
javac -d out @sources.txt
```

### Run a specific example

1) Find a class with `public static void main(String[] args)`.  
2) Determine its fully qualified name (FQN): `package.name.ClassName`

For example, if a file looks like:
```java
package com.example.basics;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```
Then the FQN is `com.example.basics.HelloWorld`.

Run it:
```bash
java -cp out com.example.basics.HelloWorld
```

Tip: To discover runnable classes, search for `public static void main`:
- macOS/Linux:
  ```bash
  grep -R --line-number "public static void main" <SRC_DIR>
  ```
- Windows (PowerShell):
  ```powershell
  Select-String -Path "<SRC_DIR>\**\*.java" -Pattern "public static void main" -CaseSensitive:$false
  ```

---

## Run with Maven (if pom.xml exists)

If the repo contains a `pom.xml`, it likely uses Maven.

- Compile:
  ```bash
  mvn -q -DskipTests package
  ```
- Run a class (replace with your main class):
  ```bash
  mvn -q exec:java -Dexec.mainClass="com.example.basics.HelloWorld"
  ```

If the exec plugin isn’t configured, you can still run after compiling:
```bash
java -cp target/classes com.example.basics.HelloWorld
```

---

## Run with Gradle (if build.gradle or build.gradle.kts exists)

If the repo contains a Gradle build file:

- Build:
  ```bash
  ./gradlew build     # macOS/Linux
  gradlew.bat build   # Windows
  ```
- Run a class (if the Application plugin is used):
  ```bash
  ./gradlew run -PmainClass=com.example.basics.HelloWorld
  ```

Otherwise, run directly after building:
```bash
java -cp build/classes/java/main com.example.basics.HelloWorld
```

---

## Project structure

Typical layouts you might see:

- Plain src:
  ```
  Java_Basic/
    src/
      <packages>/
        Example.java
  ```

- Maven:
  ```
  Java_Basic/
    src/
      main/
        java/
          <packages>/
            Example.java
      test/
        java/
  ```

- Gradle:
  ```
  Java_Basic/
    src/
      main/
        java/
      test/
        java/
  ```

If your structure differs, adjust the `<SRC_DIR>` in the commands above accordingly.

---

## Contributing

Contributions, examples, and improvements are welcome!
- Fork the repo
- Create a feature branch: `git checkout -b feature/your-feature`
- Commit your changes: `git commit -m "Add: your feature"`
- Push to the branch: `git push origin feature/your-feature`
- Open a Pull Request

When adding a new example:
- Keep it self-contained and readable
- Include comments explaining the concept
- Use clear package names (e.g., `com.example.loops`, `com.example.oop`)
