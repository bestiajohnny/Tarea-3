package pageObject;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
    //-1 public Button loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));
    //-1 public TextBox emailTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
    //-1 public TextBox passwordTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
    public Button loginButton = new Button(By.xpath("//track('Login', 'Regular'); showSpinner(); $parent(this, 'form').submit(); return false;"));
    public TextBox emailTextBox = new TextBox(By.id("email"));
    public TextBox passwordTextBox = new TextBox(By.id("password"));
}
