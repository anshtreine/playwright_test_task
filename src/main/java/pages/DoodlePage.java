package pages;

import com.microsoft.playwright.Page;
import io.qameta.allure.Step;

public class DoodlePage {

    private final Page doodlePage;

    public DoodlePage(Page page) {
        this.doodlePage = page;
    }

    @Step("Проверяем, что страница 'Googles Doodles' открылась")
    public void checkDoodlePageIsOpened() {
        doodlePage
                .locator("xpath=//*[@class = 'mobile-header-wrapper']//a[@title = 'Google doodles']")
                .isVisible();
    }

}
