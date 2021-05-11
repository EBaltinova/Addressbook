// Generated by Selenium IDE
package ru.stqa.pft.addressbook.tests;// Generated by Selenium IDE

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class ContactTest {
  private WebDriver wd;

  @BeforeMethod
  public void setUp() throws Exception {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook");
    login("admin", "secret");
  }

  @AfterMethod
  public void tearDown() {
    wd.quit();
  }

  @Test
  public void testContact() {
    wd.findElement(By.linkText("add new")).click();
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).sendKeys("TestName");
    wd.findElement(By.name("middlename")).click();
    wd.findElement(By.name("middlename")).sendKeys("TestMiddleName");
    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).sendKeys("TestLastName");
    wd.findElement(By.name("nickname")).click();
    wd.findElement(By.name("nickname")).sendKeys("TestNickname");
    wd.findElement(By.name("photo")).click();
    //wd.findElement(By.name("photo")).sendKeys("C:\\fakepath\\PavelZhdan-38.jpg");
    wd.findElement(By.name("title")).click();
    wd.findElement(By.name("title")).sendKeys("Title");
    wd.findElement(By.name("company")).click();
    wd.findElement(By.name("company")).sendKeys("Company");
    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("address")).sendKeys("Address");
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).sendKeys("111111");
    wd.findElement(By.name("mobile")).click();
    wd.findElement(By.name("mobile")).sendKeys("222222");
    wd.findElement(By.name("work")).click();
    wd.findElement(By.name("work")).sendKeys("333333");
    wd.findElement(By.name("fax")).click();
    wd.findElement(By.name("fax")).sendKeys("444444");
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).sendKeys("email1@test.ru");
    wd.findElement(By.name("email2")).click();
    wd.findElement(By.name("email2")).sendKeys("email2@test.ru");
    wd.findElement(By.name("email3")).click();
    wd.findElement(By.name("email3")).sendKeys("email3@test.ru");
    wd.findElement(By.name("homepage")).click();
    wd.findElement(By.name("homepage")).sendKeys("Homepage");
    wd.findElement(By.name("bday")).click();
    {
      WebElement dropdown = wd.findElement(By.name("bday"));
      dropdown.findElement(By.xpath("//option[. = '26']")).click();
    }
    wd.findElement(By.cssSelector("select:nth-child(61) > option:nth-child(28)")).click();
    wd.findElement(By.name("bmonth")).click();
    {
      WebElement dropdown = wd.findElement(By.name("bmonth"));
      dropdown.findElement(By.xpath("//option[. = 'December']")).click();
    }
    wd.findElement(By.cssSelector("select:nth-child(62) > option:nth-child(13)")).click();
    wd.findElement(By.name("byear")).click();
    wd.findElement(By.name("byear")).sendKeys("1997");
    wd.findElement(By.name("aday")).click();
    {
      WebElement dropdown = wd.findElement(By.name("aday"));
      dropdown.findElement(By.xpath("//option[. = '1']")).click();
    }
    wd.findElement(By.cssSelector("select:nth-child(66) > option:nth-child(3)")).click();
    wd.findElement(By.name("amonth")).click();
    {
      WebElement dropdown = wd.findElement(By.name("amonth"));
      dropdown.findElement(By.xpath("//option[. = 'January']")).click();
    }
    wd.findElement(By.cssSelector("select:nth-child(67) > option:nth-child(2)")).click();
    wd.findElement(By.name("ayear")).click();
    wd.findElement(By.name("ayear")).sendKeys("2000");
    wd.findElement(By.name("new_group")).click();
    {
      WebElement dropdown = wd.findElement(By.name("new_group"));
      dropdown.findElement(By.xpath("//option[. = 'test 0']")).click();
    }
    wd.findElement(By.cssSelector("select:nth-child(71) > option:nth-child(2)")).click();
    wd.findElement(By.name("address2")).click();
    wd.findElement(By.name("address2")).sendKeys("Address");
    wd.findElement(By.name("phone2")).click();
    wd.findElement(By.name("phone2")).sendKeys("Home");
    wd.findElement(By.name("notes")).click();
    wd.findElement(By.name("notes")).sendKeys("Notes");
    wd.findElement(By.cssSelector("input:nth-child(87)")).click();
    wd.findElement(By.linkText("home page")).click();
  }

  private void login(String username, String password) {
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.name("pass")).sendKeys(Keys.ENTER);
  }
}