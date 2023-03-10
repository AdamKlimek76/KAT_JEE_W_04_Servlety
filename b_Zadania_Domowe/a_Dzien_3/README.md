<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

### Zadania.

Rozwiązania zadań umieszczaj w utworzonym wcześniej projekcie **jee-servlet**.

#### Zadanie 1

1. W projekcie stwórz servlet `Servlet31` oraz stronę HTML `servlet31.html`,
w której zawarty jest formularz, który zawiera jedno pole liczbowe oraz pola typu `radio`. 
Po przesłaniu formularza Servlet przelicza waluty:  
    * `EUR → USD`
    * `USD → EUR`
    * `EUR → PLN`
    * `PLN → EUR`
    * `USD → PLN`
    * `PLN → USD`
  
Przeliczona kwota pokazuje się jako wynik w przeglądarce.  
Hint: Kursy walut możesz przygotować jako tablicę (kursy mogą być przez Ciebie wymyślone lub możesz je na stronie [NBP][nbp]).


#### Zadanie 2

W projekcie stwórz servlet `Servlet32`, oraz stronę HTML `servlet32.html`, w której zawarty jest formularz, zawierający jedno pole liczbowe. Po przesłaniu formularza Servlet przelicza wpisaną do formularza wartość binarną liczby na wartość dziesiętną.  
Servlet musi wykonać następujące kroki:  
  * Sprawdzić czy przekazany ciąg zawiera **tylko** `0` i `1`, jeśli nie, wyświetlić stosowny komunikat
  * Podzielić ciąg na pojedyncze znaki
  * Idąc od końca ciągu mnożyć kolejne liczby przez kolejne potęgi liczby `2`  
    * `Ostatnia liczba` x `2^0`
    * `Przedostatnia liczba` x `2^1`
    * itd.
    * Po dokonaniu obliczeń należy zsumować wszystkie wyniki potęgowania.
  * Po dokonaniu obliczenia wyświetl na stronie komunikat np. `1001 to liczba 9`.


Hint: Jeżeli nie rozumiesz jak przeliczyć liczbę zapisaną w systemie binarnym na system dziesiętny to zajrzyj [tutaj][binary-convertion].


#### Zadanie 3
W projekcie stwórz servlet `Servlet33`. Ma on implementować następujące funkcjonalności:
1. Po wejściu na stronę metodą GET (czyli w metodzie `doGet`), wygeneruj formularz z `5` polami tekstowymi `input`. Formularz ma przesyłać dane z użyciem `POST` do adresu z servletu.
2. Po otrzymaniu danych z formularza, zapisz pobrane dane w sesji.
3. Do metody `doGet` dopisz funkcjonalność sprawdzającą czy w sesji istnieją dane z poprzedniego punktu. Jeżeli dane istnieją  wypełnij nimi pola `input` formularza.

#### Zadanie 4
W projekcie stwórz servlet `Servlet34`. Celem zadania jest wyświetlanie ilości wizyt na stronie. W servlecie:
1. Sprawdź czy użytkownik posiada zapisane ciasteczko o nazwie `visits`:
    * jeśli nie, wyświetl komunikat: `Witaj pierwszy raz na naszej stronie` oraz dodaj ciasteczko o nazwie `visit`s zapisując mu wartość 1 i czas ważności 1 rok.
    * jeśli ciasteczko jest zapisane, pobierz jego aktualną wartość i wypisz na stronie komunikat `Witaj, odwiedziłeś nas już X razy`. Zwiększ też wartość ciasteczka o 1.

#### Zadanie 5
W projekcie stwórz servlet `Servlet351` oraz `Servlet352`. Celem zadania jest przechowywanie koszyka zakupowego.
1. Stwórz formularz z polem tekstowym (nazwa) oraz dwoma numerycznymi (ilość i cena) służącymi do dodawania produktu do koszyka. Formularz powinien być przesłany na tą samą stronę metodą `POST`. 
2. Po przesłaniu danych metodą POST przesłany produkt wraz z ceną i ilością dodaj do sesji pod kluczem `basket`.
 Pamiętaj, iż klucz `basket` w sesji musi przechowywać więcej niż `1` produkt (użyj tablicy). 
 Po dodaniu elementu do koszyka wyświetl komunikat `Produkt dodany` i formularz służący do dodanie następnego produktu (taki sam jak w punkcie 1).
3. Na stronie formularza dodaj odnośnik do strony wyświetlającej zawartość koszyka.
4. W servlecie `Servlet352` wyświetl zawartość koszyka oraz sumę cen produktów, pamiętaj iż każdy produkt ma dodaną ilość.

Przykład - strona koszyka:
```
Produkt 1 - 4 x 5.20zł = 20.80zł
Produkt 2 - 1 x 9.99zł =  9.99zł
Produkt 3 - 1 x 2.20zł =  2.20zł
                   SUMA: 32.99zł
```

#### Zadanie 6

W projekcie stwórz servlet `Servlet36`, oraz stronę HTML `servlet36.html`, 
w której zawarty jest formularz przesyłający (metodą GET) 4 parametry liczbowe o nazwie `num`.
 Po przejściu do servletu oblicz ich średnią, sumę oraz iloczyn i zwróć wynik w przeglądarce:

````
Liczby:
  - x1
  - x2
  - x3
  - x4
Średnia:
  - średnia 
Suma:
  - suma 
Iloczyn:
  - iloczyn 
````

#### Zadanie 7 - dodatkowe

W projekcie stwórz servlet `Cookie37`, dostępny pod adresem `/rememberMe`. Następnie:
1. W servlecie utwórz formularz, zawierający pole `name` oraz checkbox z labelem `Zapamiętaj mnie`.
 Formularz powinien przesyłać dane metodą POST na ten sam adres.
2. Dopisz obsługę metody POST w servlecie. Servlet powinien wyświetlić komunikat `Cześć {imię przesłane w formularzu}`.
 W przypadku zaznaczenia checkboxa, imię użytkownika zapamiętaj w ciasteczku.
3. Dodaj funkcjonalność, która w przypadku wejścia na stronę metodą GET sprawdzi czy istnieje odpowiednie ciasteczko.
 Jeżeli tak, to nie wyświetlaj formularza do logowania tylko wyświetl komunikat `Cześć {imię przesłane w formularzu}. Twoje dane zostały wczytane z ciasteczka`

#### Zadanie 8 - dodatkowe

W projekcie stwórz servlet `Sess38`. Następnie:
1. Wylosuj w nim 2 liczby całkowite z przedziału 20-1000.
2. Wyświetl 3 pola do wpisania wyników działań na wylosowanych liczbach:
    * dodawania, 
    * odejmowania, 
    * mnożenia.
3. Po wysłaniu formularza wygeneruj stronę, która sprawdzi wpisane przez nas wyniki i przedstawi je w postaci:

```
20	+	3	=	23	Correct
20	-	3	=	17	Correct
20	*	3	=	89	Wrong
```
Hint: w sesji zapamiętaj liczby, a nie wyniki - dzięki temu będziesz trzymać jedną zmienną mniej. 

#### Zadanie 9 - dodatkowe

W projekcie stwórz servlet `Sess39`. Następnie:
1. Przygotuj sobie tablicę z nazwami krajów sąsiadujących z Polską i ich stolicami.
2. Po uruchomieniu servletu na serwerze, wyświetl formularz z zapytaniem o stolicę sąsiadującego z Polską państwa. W postaci: `Podaj stolicę dla państwa: Niemcy `
3. Po przesłaniu odpowiedzi, system zweryfikuje poprawność odpowiedzi i wyświetli odpowiedni komunikat oraz ponownie wyświetli pytanie o kolejne państwo.
4. Po wyświetleniu wszystkich pytań wyświetli się wynik naszego quizu z informacją o liczbie poprawnych odpowiedzi:
`Poprawnych odpowiedzi: 4`.

Hint: To zadanie będzie miało podobny algorytm działania co zadanie 6 - wzoruj się na nim.


<!-- Links -->
[degrees-convertion]:https://pl.wikipedia.org/wiki/Skala_Fahrenheita#Spos.C3.B3b_dok.C5.82adny
[submit-btns]:http://stackoverflow.com/a/2680198
[nbp]:http://www.nbp.pl/home.aspx?navid=archa&c=/ascx/tabarch.ascx&n=a008z170112
[binary-convertion]:http://www.wikihow.com/Convert-from-Binary-to-Decimal
[lorempixel]:http://lorempixel.com/