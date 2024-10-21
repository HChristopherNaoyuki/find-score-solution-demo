Here's a structured README for your `FindScoreSolution` project, including an overview, setup instructions, and testing details.

---

# Find Score Solution

## Overview
The `Find Score Solution` is a Java application that calculates a total score based on an input array of integers. The score is determined by selecting values from the array while adhering to specific rules about adjacency. The program uses a priority queue to efficiently compute the maximum possible score.

## Features
- Calculates the score by selecting non-adjacent values from the input array.
- Utilizes a priority queue for optimal selection of elements based on their values.
- Includes thorough unit tests to validate the implementation.

## How It Works
1. **Input**: The user provides an array of integers.
2. **Processing**: The program processes the array, ensuring that no two adjacent elements are selected for the score calculation.
3. **Output**: The program returns the calculated score.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed on your machine.

### Running the Application
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/find-score-solution-demo.git
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd find-score-solution
   ```
3. **Compile the Java Files**:
   ```bash
   javac FindScoreSolution/Solution.java FindScoreSolution/SolutionTest.java
   ```
4. **Run the Application**:
   ```bash
   java FindScoreSolution.Solution
   ```

### Example Usage
The application runs several test cases in the `main` method, providing output for different scenarios:
```
Test Case 1: 8
Test Case 2: 6
Test Case 3: 30
Test Case 4: 0
Test Case 5: 7
```

## Testing
The application includes a test suite in `SolutionTest.java` using JUnit. To run the tests:

1. **Make sure you have JUnit in your classpath**.
2. **Run the tests**:
   ```bash
   java -cp .:junit-4.x.x.jar:hamcrest-core-1.x.x.jar org.junit.runner.JUnitCore FindScoreSolution.SolutionTest
   ```

### Test Cases Included
- **testFindScore_case1**: Validates score for a typical input.
- **testFindScore_case2**: Validates score for an input with repeated elements.
- **testFindScore_case3**: Validates score for an increasing sequence of numbers.
- **testFindScore_emptyArray**: Validates output for an empty array.
- **testFindScore_singleElement**: Validates output for an array with a single element.
