@SmartView
Feature: GlobalPositionSmart
  #ONEAPP-14173
  @Android

  Scenario: Skórka SMART nawigacja
#  Given Wybrany jest klient spełniający kryteria:
#    | CLIENT_TYPE        | INDIVIDUAL |
#    | CLIENT_DESCRIPTION | general    |
  When Wybrany klient jest zalogowany i widzi pulpit na skórce smart
  Then Na ekranie "Pulpit" wyświetlone są następujące elementy:
#    | Element                      | Widoczność |
    | Pulpit			            | False      |
    | Oferta      			        | False      |
    | Płatności 			        | False      |
    | Więcej                        | False      |
    | Szybki dostęp		    	    | True       |
    | Nowy przelew      		    | True       |
    | Historia 			            | True       |
    | BLIK                          | True       |
#    When Klient na ekranie "Pulpit" klika "Nowy przelew"
##    Then Wyświetlony jest ekran "Nowy przelew"
##    And Na ekranie "Nowy przelew" wyświetlone są następujące elementy:
###      | Element                       | Widoczność |
###      | Strzałka wstecz		       | True       |
##    And Klient na ekranie "Nowy przelew" klika "Strzałka wstecz"
#    Then Wyświetlony jest ekran "Pulpit"
##    When Klient na ekranie "Pulpit" klika "Szybki dostęp"
##    Then Na ekranie "Szybki dostęp" wyświetlone są następujące elementy:
##      | Element                       | Widoczność |
##      | Nowy przelew			       | True       |
##      | BLIK      			           | True       |
##      | Kantor Santander 		       | True       |
##      | Transport, Bilety, Usługi     | True       |
##      | Poradnik cenowy		       | True       |
##      | Alerty24      		           | True       |
##      | Dodaj Bank 			       | True       |
##      | Płatności mobilne             | True       | //tylko android
##      | Moje cele                     | True       |
##      | Nowa lokata                   | True       |
##      | Kredyt gotówkowy              | True       |
##      | Program poleceń               | True       |
##    When Klient na ekranie "Szybki dostęp" klika "przycisk zamknij"
##    Then Wyświetlony jest ekran "Pulpit"
#    When Klient na ekranie "Pulpit" klika przycisk skróty "+"
##    Then Na ekranie "Skróty" wyświetlone są następujące elementy:
##      | Element                      | Widoczność |
##      | Centrum pomocy		          | True       |
##      | Oferta			              | True       |
##      | Zestaw opinię			      | True       |
##      | Bankomaty i oddziały		  | True       |
##      | Ustawienia			          | True       |
##      | Twoje sprawy			      | True       |
##      | eWyciągi			          | True       |
##      | Rabaty			              | True       |
##      | Poradnik cenowy		      | True       |
