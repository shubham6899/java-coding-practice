# IntegerSum

## Overview

The `IntegerSum` project is a simple Java program that prompts the user to input an integer between 0 and 1000, then calculates and prints the sum of its digits.

## Features

- Prompts the user to enter an integer between 0 and 1000.
- Calculates the sum of all digits in the given integer.
- Displays the result to the user.

## Requirements

- Java Development Kit (JDK) installed on your machine.
- A command-line interface or an Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or NetBeans.

## Usage

1. **Clone or Download:**
   - Clone the repository or download the project to your local machine.

2. **Navigate to Directory:**
   - Open a terminal or command prompt.
   - Navigate to the directory where the `IntegerSum` project is located.

3. **Compile the Java File:**
   ```sh
   javac Main.java```

4. **Run the Program:**
  ```sh
  java Main```

5. **Input an Integer**
  - Follow the on-screen prompt to input an integer between and 1000.
  - The program will output the sum of all digits in the entered integer.

## Example
  ```sh
  $ javac Main.java
  $ java Main
  Input an integer between 0 and 1000: 123
  The sum of all digits in 123 is 6```

## Code Explanation

The Java program 'IntegerSum.java' consists of the following key steps:

1. **Import Scanner Class:** Import the 'Scanner' class to read user input.
2. **Create Scanner Object:** Create a 'Scanner' object to capture the input from the user.
3. **Prompt for input:** Prompt the user to input an integer between 0 and 1000.
4. **Extract Digits:** Extract the digits from the input using modulo and division operations.
5. **Sum the Digits:** Sum the extracted digits.
6. **Print the sum:** Print the sum to the console.

## code
```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int secondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + secondDigit + firstDigit + fourthDigit;

        System.out.println("The sum of all digits in " + num + " is " + sum);
    }
}
```

##License

This project is licensed under the MIT License. See the LICENSE file for details.

##Acknowledgements

1. This project was created as a learning exersize for java programming.
2. Credits of all the problems go to W3resource.
3. Thanks to the Java documentation and community for their valuable resources and support.
```javascript
copy the above text (mainly it's general structure) and save it as `README.md` in your project directory. This will provide a decent structure to your README for your project.
``` 
