import com.thoughtworks.selenium.*;

import junit.framework.*;

class TestGoogle12 extends TestCase {
    private Selenium browser;
    public void setUp() {
        browser = new DefaultSelenium("localhost",
            4444, "*firefox", "http://www.google.com");
        browser.start();
    }

    public void testGooglepipline() throws InterruptedException {
        browser.open("http://www.google.com/webhp?hl=en");
        browser.type("q", "hello world");
        browser.click("btnG");
        Thread.sleep(1000);
        if(browser.getTitle()=="hello world!!! - Google Search")
        {
        	System.out.println("It's the same!");
        }
        else
        {
        	System.out.println("It's not the same!");
        }
        //assertEquals("hello world!!! - Google Search", browser.getTitle());
    }

    public void tearDown() {
        browser.stop();
    }

}