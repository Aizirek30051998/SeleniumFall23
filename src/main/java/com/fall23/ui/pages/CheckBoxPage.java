package com.fall23.ui.pages;

import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {

    public CheckBoxPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//button[@aria-label='Toggle'])[1]")
    public WebElement HomeBoxBtn;

    @FindBy(xpath = "//span[text()='Home']")
    public WebElement HomeBtn;

    @FindBy(xpath = "(//button[@aria-label='Toggle'])[2]")
    public WebElement DesktopBoxBtn;

    @FindBy(xpath = "//span[text()='Desktop']")
    public WebElement DesktopBtn;

    @FindBy(xpath = "//span[text()='Notes']")
    public WebElement NotesBtn;

    @FindBy(xpath = "//span[text()='Commands']")
    public WebElement CommandsBtn;

    @FindBy(xpath = "(//button[@aria-label='Toggle'])[3]")
    public WebElement CommandsBoxBtn;

    @FindBy(xpath = "//span[text()='Documents']")
    public WebElement DocumentsBtn;

    @FindBy(xpath = "(//button[@aria-label='Toggle'])[4]")
    public WebElement DocumentsBoxBtn;

    @FindBy(xpath = "//span[text()='WorkSpace']")
    public WebElement WorkSpaceBtn;

    @FindBy(xpath = "//span[text()='React']")
    public WebElement ReactBtn;

    @FindBy(xpath = "//span[text()='Angular']")
    public WebElement AngularBtn;

    @FindBy(xpath = "//span[text()='Veu']")
    public WebElement VeuBtn;

    @FindBy(xpath = "(//button[@aria-label='Toggle'])[5]")
    public WebElement OfficeBoxBtn;

    @FindBy(xpath = "//span[text()='Office']")
    public WebElement OfficeBtn;

    @FindBy(xpath = "//span[text()='Public']")
    public WebElement PublicBtn;

    @FindBy(xpath = "//span[text()='Private']")
    public WebElement PrivateBtn;

    @FindBy(xpath = "//span[text()='Classified']")
    public WebElement ClassifiedBtn;

    @FindBy(xpath = "//span[text()='General']")
    public WebElement GeneralBtn;

    @FindBy(xpath = "(//button[@aria-label='Toggle'])[6]")
    public WebElement DownloadsBoxBtn;

    @FindBy(xpath = "//span[text()='Downloads']")
    public WebElement DownloadsBtn;

    @FindBy(xpath = "//span[text()='Word File.doc']")
    public WebElement WordFileBtn;

    @FindBy(xpath = "//span[text()='Excel File.doc']")
    public WebElement ExcelFileBtn;

    @FindBy(xpath = "(//button[@aria-label='Toggle'])[6]")
    public WebElement getbackBtn;

    @FindBy(xpath = "(//button[@aria-label='Toggle'])[3]")
    public WebElement getBackBtn2;

    @FindBy(xpath = "(//button[@aria-label='Toggle'])[2]")
    public WebElement getBackBtn3;

    @FindBy(xpath = "(//button[@aria-label='Toggle'])[1]")
    public WebElement getbackBtn4;

    WebElementHelper helper=new WebElementHelper();

    public CheckBoxPage clickAllElements() throws InterruptedException {
        helper.click(HomeBoxBtn);
        Thread.sleep(1000);
        helper.click(HomeBtn);
        Thread.sleep(1000);
        helper.click(DesktopBoxBtn);
        helper.click(DesktopBtn);
        Thread.sleep(1000);
        helper.click(NotesBtn);
        Thread.sleep(1000);
        helper.click(CommandsBtn);
        helper.click(CommandsBoxBtn);
        Thread.sleep(1000);
        helper.click(DocumentsBtn);
        helper.click(DocumentsBoxBtn);
        Thread.sleep(1000);
        helper.click(WorkSpaceBtn);
        Thread.sleep(1000);
        helper.click(ReactBtn);
        Thread.sleep(1000);
        helper.click(AngularBtn);
        Thread.sleep(1000);
        helper.click(VeuBtn);
        Thread.sleep(1000);
        helper.click(OfficeBoxBtn);
        helper.click(OfficeBtn);
        helper.scrollToDown();
        Thread.sleep(1000);
        helper.click(PublicBtn);
        Thread.sleep(1000);
        helper.click(PrivateBtn);
        Thread.sleep(1000);
        helper.click(ClassifiedBtn);
        Thread.sleep(1000);
        helper.click(GeneralBtn);
        Thread.sleep(1000);
        helper.click(DownloadsBtn);
        helper.click(DownloadsBoxBtn);
        Thread.sleep(1000);
        helper.click(WordFileBtn);
        helper.click(ExcelFileBtn);
        Thread.sleep(1000);
        helper.click(getbackBtn);
        helper.click(getBackBtn2);
        Thread.sleep(1000);
        helper.click(getBackBtn3);
        helper.click(getbackBtn4);
        return this;
    }

}