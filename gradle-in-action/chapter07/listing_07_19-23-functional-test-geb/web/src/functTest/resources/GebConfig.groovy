import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver

waiting {
    timeout = 5
}

environments {
    firefox {
        driver = { new FirefoxDriver() }
    }
    chrome  {
        driver = { new ChromeDriver() }
    }
}