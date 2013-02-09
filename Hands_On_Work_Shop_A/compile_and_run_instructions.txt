Please follow the next step in order to compile and run
the program

1) To compile the project please move to src folder and execute
the following command:

javac -d ../bin/ com/adacom/recruitingprocess/step2/*.java

2) To run the program with some samples please move to the bin folder and execute the
following command:

java -cp . com.adacom.recruitingprocess.step2.Main A.txt B.txt C.txt

NOTE: The bin folder has already 2 files for testing 
(A.txt, B.txt, the C.txt is created by the program).

3) The program also has test cases in order to help the CONTINUES SERVER INTEGRATION
process by running automatically the tests.
In order to compile the test case please move to the src folder and execute the following
command:

javac -cp ../libs/junit-4.5.jar:. -d ../bin/ com/adacom/recruitingprocess/tests/*.java

4) In order to run the test case please move to the bin folder and execute
the following command:

java -cp ../libs/junit-4.5.jar:. org.junit.runner.JUnitCore com.adacom.recruitingprocess.tests.TestStep2Case

NOTE: Apart from test automation for helping CONTINUES SERVER INTEGRATION, ant
or maven tools can be used for build. I din't add ant or maven functionality for 
simplicity purposes.

