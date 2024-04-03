import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import utils.BrowserConfig;

public class BaseTest {

    private static final Playwright playwright = Playwright.create();
    private static Browser browser = null;

    public static Browser getBrowser() {
        return browser;
    }

    @BeforeAll
    public static void before() {
        browser = BrowserConfig.initBrowser(browser, playwright);
    }

    @AfterAll
    public static void tearDown(){
        playwright.close();
    }

}
