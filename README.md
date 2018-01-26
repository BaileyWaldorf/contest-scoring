# contest-scoring
This program will calculate ACM contest score based on correct/wrong answers.

Input:
Standard input containing list of contest entries in format - number (submission time), letter (question), string (right/wrong)
Followed by a terminating condition: -1

E.g.
5 A wrong
10 A right
18 B wrong
25 B wrong
35 B right
-1

Output:
Number of questions they got correct and time it took to complete, including time penalties (+20 minutes per wrong answer)

E.g.
2 95

Run command:
java contest-scoring                  (for outputting to the screen)
java contest-scoring > results.txt    (for outputting into a file)
