package utils;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class BrowserConfig {

    public static Browser initBrowser(Browser browser, Playwright playwright) {

        String browserName = System.getenv("BROWSER");
        String headlessMode = System.getenv("HEADLESS");
        if (browserName.equals("chromium") & headlessMode.equals("true")) {
            browser = playwright.chromium().launch();
        } else if (browserName.equals("chromium") & headlessMode.equals("false")) {
            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        } else if (browserName.equals("firefox") & headlessMode.equals("true")) {
            browser = playwright.firefox().launch();
        } else if (browserName.equals("firefox") & headlessMode.equals("false")) {
            browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
        } else if (browserName.equals("webkit") & headlessMode.equals("true")) {
            browser = playwright.webkit().launch();
        } else if (browserName.equals("webkit") & headlessMode.equals("false")) {
            browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
        }
        return browser;
    }

}
