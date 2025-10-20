
## 📄 Description - Exercise Statement

The following exercises require implementing tests using the **AssertJ** fluent assertion style.

### Exercise 1: Asserting Integer Values

An assertion that demonstrates that the value of two integer objects is **equal**, and another one that indicates that it is **not** equal.
*(e.g., `assertThat(a).isEqualTo(b);`)*

### Exercise 2: Asserting Object References

An assertion that demonstrates that the **reference** to one object is the **same** as another, and another one that indicates that it is **different**.
*(e.g., `assertThat(a).isSameAs(b);`)*

### Exercise 3: Asserting Array Identity

An assertion that indicates that two integer arrays are **identical** (i.e., contain the same elements in the same order).
*(e.g., `assertThat(array1).isEqualTo(array2);`)*

### Exercise 4: Asserting List Content and Order

Create an `ArrayList` containing several types of objects (create them as well). Write assertions to verify:

1.  The **order** of the objects as inserted.
2.  The presence of the objects in **any order**.
3.  That one object has been added **only once**.
4.  That a specific object is **not** contained in the list.

### Exercise 5: Asserting Map Keys

Create a map and verify that it contains one of the **keys** you add to it.
*(e.g., `assertThat(myMap).containsKey("myKey");`)*

### Exercise 6: Asserting Exception Throwing

Trigger an `ArrayIndexOutOfBoundsException` in any class. Create an assertion that validates that the exception is thrown when appropriate.
*(e.g., `assertThatThrownBy(() -> method()).isInstanceOf(Exception.class);`)*

### Exercise 7: Asserting Optional Status

Create an empty `Optional` object. Write the correct assertion to verify that it is indeed empty.
*(e.g., `assertThat(optionalObject).isEmpty();`)*

-----

## 💻 Used Technologies

| Technology | Version | Description |
| :--- | :--- | :--- |
| **Java** | 24 (OpenJDK) | Language and environment for development. |
| **JUnit 5** | 5.10.2 (or higher) | Testing framework. |
| **AssertJ Core** | 3.25.3 (or higher) | **Fluent assertion library.** |
| **Apache Maven** | 3.9.6 (or higher) | Build automation and project management tool. |

-----

## 📋 Requirements

- Operating System: Windows/macOS/Linux.

- **Java Development Kit (JDK):** Version **24.0.1** (or higher). Using an **OpenJDK** distribution is recommended.

- **Apache Maven:** Installed and configured in the system PATH.

- Integrated Development Environment (IDE): **IntelliJ IDEA** (recommended) or any other IDE with Maven support.

-----

## 🛠️ Installation

1.  **Clone the Repository:**

    ```bash
    git clone https://github.com/Rafadicandia/Tasca-S1.04-Testing-Nivell2.git

    ```

2.  **IDE Configuration:**

    Open the folder as a **Maven project** in your IDE. The IDE will automatically download the necessary dependencies (`junit-jupiter-api` and `assertj-core`) defined in the `pom.xml` file.

3.  **Build the Project:**

    To ensure all dependencies are resolved and the project compiles correctly, you can run the following command in the terminal from the project root:

    ```bash
    mvn clean install
    ```

-----

## ▶️ Execution

### ⚙️ Execute from the IDE

- **Run Tests:** Locate the JUnit test classes (e.g., in the `src/test/java` folder), right-click on the test class or method, and select "Run '...Test'".

-----

## 🤝 Contributions

Contributions are welcome. Please report any bugs by opening an issue or suggest improvements via a clear and concise Pull Request.