# ETL Code Refactoring Challenge (45 mins)

<b>EXPECTATIONS</b>
- Download this code repository and import in Eclipse/IntelliJ/IDE.
- Create a folder of your name in D:/HR location and make it as your workspace.
- Refactor/enhance this existing code so that it works on the sample input and generates output as shown in the Input-Output section.
- Think on its design issues and look at code smells, and refactor accordingly.
- Use <b>JUnit</b> or any other testing framework or the main() program for testing.
- Maturity of your solution will be judged on your <br>
<b>object oriented programming (or functional programming),</b> <br>
<b>modelling and flexible design, </b> <br>
<b>clean code practices, </b> <br>
<b>suitable for further enhancements</b> as mentioned in future stories.  
<br>

<b>NOT EXPECTED in this assignment</b>
<li>Usage of relational/NoSQL database or OS / platform underlying. 
<li>Usage of additional libraries or frameworks (like Spring).




<br><br>
## Story 

As the ETL process engineer, I want a program, which does 
-	Read a text file from a given file path,  
-	Transform first letter of each word into capital and
-	Write output of file into new output file in the destination file path.
So that all contents of the file are in INITCAP style. 
<br>
<b>Sample Input File: </b>

<pre>I am a great coder who loves to solve real world problems</pre>

<b>Sample Output File: </b>

<pre>I Am A Great Coder Who Loves To Solve Real World Problems</pre>




<br><br>
## Future Stories (Optional)
Future stories may include features like
- Reading and writing into XML or JSON file.
- Add multiple transformations to contents instead of 1.
- Scaling-up the program to handle multiple files (example: all files in a directory).
