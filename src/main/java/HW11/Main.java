package HW11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.rmi.Remote;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        RemoteWebDriver browser = (RemoteWebDriver) getDriver(args[0]);
        browser.manage().timeouts().implicitlyWait(Duration.ofMillis(10));

        browser.get("https://ithillel.ua/courses/front-end-basic");

        browser.manage().window().maximize();
        System.out.println(browser.getTitle());

        FluentWait<RemoteWebDriver> wait = new FluentWait<>(browser)
                .pollingEvery(Duration.ofMillis(100))
                .withTimeout(Duration.ofSeconds(15))
                .ignoring(NoSuchElementException.class);

        WebElement coachSection = wait.until((driver) -> {
            driver.executeScript("window.scrollBy(0,200)");
            return driver.findElement(By.id("coachesSection"));
        });

        System.out.println(coachSection);

        List<WebElement> coachesNames = coachSection.findElements(By.className("coach-card_name"));
        coachesNames.stream()
                .map(WebElement::getText)
                .forEach(System.out::println);

//        WebElement coachesList = browser.findElement(By.cssSelector("section -reviews"));
//        WebElement getList = browser.findElement(By.cssSelector(".coach-list.coaches_list"));
//        String elementText = getList.getAttribute("innerHTML");
//
//        String regex = "<p class=\"coach-card_name\">(.*?)</p>";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(elementText);
//
//        while (matcher.find()) {
//            String name = matcher.group(1);
//            System.out.println("Name found: " + name);
//        }
//        browser.quit();
         }

    static RemoteWebDriver getDriver(String driverName) {
        switch (driverName) {
            case "chrome":
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            case "edge":
                return new EdgeDriver();
            default:
                throw new IllegalArgumentException("No such driver");
        }

    }
}


