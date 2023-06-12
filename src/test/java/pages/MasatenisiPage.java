package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MasatenisiPage {
    public MasatenisiPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='Arama']")
    public WebElement mtAramaKutusuElementi;

    @FindBy(xpath = "(//*[@data-type='yeni'])[1]")
    public WebElement mtYeniUrunFiltreElementi;

    @FindBy(xpath = "(//*[@data-id='1486'])[1]")
    public WebElement mtIlkUrun;





}
