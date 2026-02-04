# Monte Carlo Pi Estimation

This repository contains implementations of the Monte Carlo method to estimate the value of Pi in both Java and Python. This project was created for a programming languages homework assignment.

## Overview

The Monte Carlo method is a computational algorithm that relies on repeated random sampling to obtain numerical results. In this case, it's used to approximate Pi by simulating the process of throwing darts at a square board with an inscribed circle.

The core idea is:
1.  Inscribe a circle of radius `r` inside a square with side length `2r`.
2.  Generate a large number of random points within the square.
3.  Count the number of points that fall inside the circle.
4.  The ratio of the number of points inside the circle to the total number of points is an approximation of the ratio of the areas of the circle and the square.

The area of the circle is πr² and the area of the square is (2r)² = 4r². The ratio of the areas is (πr²) / (4r²) = π / 4.

Therefore, we can estimate Pi using the formula:
`Pi ≈ 4 * (number of points in circle) / (total number of points)`

For this implementation, we use a square that extends from (-1, -1) to (1, 1) and an inscribed circle with a radius of 1, both centered at the origin (0, 0).

## Implementations

### Java (`MonteCarloJava.java`)

This version uses `java.util.Random` to generate random coordinates. It runs the simulation for a total of `1,000 * 1,000 = 1,000,000` points. A fixed seed is used for reproducibility.

#### How to Run
1.  Compile the Java file:
    ```sh
    javac MonteCarloJava.java
    ```
2.  Run the compiled class:
    ```sh
    java MonteCarloJava
    ```
    **Output:**
    ```
    Final Estimation of Pi = 3.14138
    ```

### Python (`MonteCarloPython.py`)

This version uses Python's `random` module. It runs the simulation for a total of `10,000 * 10,000 = 100,000,000` points. A fixed seed is used for reproducibility.

#### How to Run
1.  Execute the Python script (Python 3 recommended):
    ```sh
    python3 MonteCarloPython.py
    ```
    **Output:**
    ```
    Final Estimation of Pi= 3.14159588
    ```

## Presentation

The repository also includes `Programming languages HW1.pptx`, which is a slide deck presentation that likely accompanies the code for the homework assignment.
