package testcases;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObject.LoginModal;
import pageObject.MainPage;
import session.Sesion;

public class TodoLyTest {

    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();

    @Before
    public void before(){
        Sesion.getInstance().getDriver().get("https://todoist.com/");
    }


    @DisplayName("Verificar la ejecucion de el login")
    @Description("Este test cases es para verifcar ......")
    @Link("jira.copm/345345")
    @Issue("Bug000052")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void verifyTheProjectIsLogged(){
        mainPage.loginButton.click();
        loginModal.emailTextBox.setValue("noexiste@noexiste.com");
        loginModal.passwordTextBox.setValue("123456789");
        loginModal.loginButton.click();

        // verificaciones....

    }

    @After
    public void after(){
        Sesion.getInstance().closeSesion();
    }


}
