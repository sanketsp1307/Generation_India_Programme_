
1. For Loop
The for loop is used when the number of iterations is known beforehand.

Syntax:


for (initialization; condition; update) {
    // code block to be executed
}
Example:

java
Copy code
for (int i = 0; i < 5; i++) {
    System.out.println("i = " + i);
}

2. While Loop
The while loop is used when the number of iterations is not known, and it continues until a specified condition becomes false.

Syntax:

while (condition) {
    // code block to be executed
}
Example:

int i = 0;
while (i < 5) {
    System.out.println("i = " + i);
    i++;
}
3. Do-While Loop
The do-while loop is similar to the while loop, but it guarantees that the code block will be executed at least once, as the condition is checked after the execution of the block.

Syntax:

java
Copy code
do {
    // code block to be executed
} while (condition);
Example:


int i = 0;
do {
    System.out.println("i = " + i);
    i++;
} while (i < 5);


In Java, break and continue are control flow statements that alter the normal flow of loops (for, while, or do-while).

4. break Statement
The break statement is used to exit a loop completely when a certain condition is met. When encountered inside a loop, it immediately terminates the loop, and the program control moves to the next statement after the loop.

Example:

for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;  // Exit the loop when i is 5
    }
    System.out.println("i = " + i);
}

6. continue Statement
The continue statement is used to skip the current iteration of a loop and jump to the next iteration. When encountered, it skips the rest of the code inside the loop for the current iteration and proceeds with the next iteration.

Example:

for (int i = 0; i < 10; i++) {
    if (i == 5) {
        continue;  // Skip the current iteration when i is 5
    }
    System.out.println("i = " + i);
}