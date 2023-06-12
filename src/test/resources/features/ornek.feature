Feature: tosiye ornek
  Scenario: ornek stepler

    Given Kullanici "https://masatenisi.com" sitesine gider
    Then Kullanici arama kutusuna "lastik" yazip aratir
    And Kullanici filtreler bolumunden "yeni urunler" filtresini secer
    And Kullanici yeni urunler sayfasinda goruntulenen ilk urune tiklar
    And Sayfayi kapatir

