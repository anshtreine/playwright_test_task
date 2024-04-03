package pages;

import com.microsoft.playwright.Page;
import io.qameta.allure.Step;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class GoogleAuthPage {

    private final Page authPage;

    public GoogleAuthPage(Page page) {
        this.authPage = page;
    }

    @Step("Проверяем наличие основных элементов на странице авторизации")
    public void checkAuthPageMainElements() {
        assertThat(authPage.locator("xpath=//h1"))
                .hasText("Вход");
        assertThat(authPage.locator("xpath=//*[@id = 'headingSubtext']"))
                .hasText("Используйте аккаунт Google");
        assertThat(authPage.locator("xpath=(//section//button)[1]"))
                .hasText("Забыли адрес электронной почты?");
        assertThat(authPage.locator("xpath=//button[@aria-haspopup = 'menu']/span"))
                .hasText("Создать аккаунт");
    }

}
