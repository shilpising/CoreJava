package javaBestPractice;

public class ExceptionTest { 
    class TestException extends Exception {} 
    public void runTest() throws TestException {} 
    public void test() throws TestException /* Point X */ 
    { 
        runTest(); 
    } 
}
