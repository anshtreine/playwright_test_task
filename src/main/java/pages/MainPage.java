package pages;

import com.microsoft.playwright.Page;
import io.qameta.allure.Step;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class MainPage {
    private static final String URL = System.getenv("MAIN_URL");
    private final Page mainPage;

    public MainPage(Page page){
        this.mainPage = page;
    }

    @Step("Открыть главную страницу")
    public MainPage openMainPage() {
        mainPage.navigate(URL);
        return this;
    }

    @Step("Проверяем наличие строки поиска на главной странице")
    public void checkSearchInputIsDisplayed() {
        assertThat(mainPage.locator("xpath=//*[@title = 'Поиск']")).isVisible();
    }

    @Step("Нажимаем на кнопку 'Мне повезет!'")
    public void clickOnDoodleOpenButton() {
        mainPage
                .locator("xpath=(//center//input[@value='Мне повезёт!'])[2]")
                .click();
    }

    @Step("Нажимаем на кнопку 'Войти'")
    public void clickOnAuthorizationButton() {
        mainPage
                .locator("xpath=//a[@aria-label = 'Войти']")
                .click();
    }

}
