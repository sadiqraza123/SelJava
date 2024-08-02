package myPacakge;

public class Navigations extends LaunchBrowser {

    public static void navigations() throws InterruptedException {

        driver.get("https://snapdeal.com/");
        Thread.sleep(2000);
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().to("https://snapdeal.com/");



    }
}
