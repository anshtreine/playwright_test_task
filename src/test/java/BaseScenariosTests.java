import com.microsoft.playwright.Page;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.DoodlePage;
import pages.GoogleAuthPage;
import pages.MainPage;

import static io.qameta.allure.SeverityLevel.*;

public class BaseScenariosTests extends BaseTest {

    Page page = getBrowser().newPage();
    MainPage mainPage = new MainPage(page);
    DoodlePage doodlePage = new DoodlePage(page);
    GoogleAuthPage authPage = new GoogleAuthPage(page);

    @DisplayName("Проверка отображения строки поиска")
    @Severity(BLOCKER)
    @Epic("Google Main page actions")
    @Test
    public void checkSearchInput() {
        mainPage
                .openMainPage()
                .checkSearchInputIsDisplayed();
    }

    @DisplayName("Проверка перехода на страницу 'Google Doodles'")
    @Severity(NORMAL)
    @Epic("Google Main page actions")
    @Test
    public void checkDoodlePageIsOpened() {
        mainPage
                .openMainPage()
                .clickOnDoodleOpenButton();
        doodlePage
                .checkDoodlePageIsOpened();

    }

    @DisplayName("Проверка перехода на страницу авторизации")
    @Severity(CRITICAL)
    @Epic("Google Main page actions")
    @Test
    public void checkAuthorizationPageIsOpened() {
        mainPage
                .openMainPage()
                .clickOnAuthorizationButton();
        authPage
                .checkAuthPageMainElements();
    }

}
