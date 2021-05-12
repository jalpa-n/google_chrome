import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class WatfordCommunity {

    public static void main(String[] args) {

        String baseurl = "https://www.wcht.org.uk";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());
        boolean verifytitle = title.equals(("Watford Community Housing homepage | Watford Community Housing"));
        boolean verifycontains = title.contains("Community Homepage");
        System.out.println(verifycontains);
        System.out.println(verifytitle);
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.close();

    }
}
