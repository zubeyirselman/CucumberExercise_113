package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.MasatenisiPage;
import utilities.Driver;

public class MasatenisiStepDefinitions {

    MasatenisiPage masatenisiPage = new MasatenisiPage();

    @Then("Kullanici arama kutusuna {string} yazip aratir")
    public void kullanici_arama_kutusuna_yazip_aratir(String aranacakUrun) {
        masatenisiPage.mtAramaKutusuElementi.sendKeys("lastik" + Keys.ENTER);
    }

    @And("Kullanici filtreler bolumunden {string} filtresini secer")
    public void kullaniciFiltrelerBolumundenFiltresiniSecer(String yeniUrunler) {
        masatenisiPage.mtYeniUrunFiltreElementi.click();
    }

    @Then("Kullanici yeni urunler sayfasinda goruntulenen ilk urune tiklar")
    public void kullanici_yeni_urunler_sayfasinda_goruntulenen_ilk_urune_tiklar() {
        masatenisiPage.mtIlkUrun.click();

    }


    @Given("Kullanici {string} sitesine gider")
    public void kullaniciSitesineGider(String istenenUrl) {
        Driver.getDriver().get("https://masatenisi.com");
    }
}
