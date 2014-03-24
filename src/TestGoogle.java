
public class TestGoogle{
	static TestGoogle12 Test;
	public static void main(String[] argv) throws InterruptedException
	{
		Test = new TestGoogle12();
		Test.setUp();
		Test.testGooglepipline();
		Test.tearDown();
	}
}

