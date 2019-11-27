<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java EE – Servlety

### Przygotowanie do zadań.

1. Stwórz projekt `servletjee`. Rozwiązania zadań powinny znajdować się w tym projekcie.
2. Utwórz pakiet `pl.coderslab` – servlety umieszczaj w tym pakiecie lub pakietach podrzędnych.

### Zadania rozwiązywane z wykładowcą:

#### Zadanie 1

1. W projekcie utwórz servlet `Servlet11`, dostępny pod adresem **/servlet11**,
który wyświetli na konsoli **"Hello First Servlet"**, a jednocześnie wyświetli w przeglądarce tekst: **`Content11`**.
3. Adres strony powinien być określony za pomocą adnotacji.
2. Skonfiguruj kontener servletów Tomcat w IntelliJ.
3. Uruchom projekt.

#### Zadanie 2

1. W projekcie stwórz servlet `Servlet12`, dostępny pod adresem **/servlet12**,.
2. Wyświetl na stronie tekst: **Content12**. 
3. Adres strony powinien być określony za pomocą odpowiedniego wpisu w deskryptorze wdrożenia (podpowiedź znajdziesz w Snippetach).


-------------------------------------------------------------------------------

### Zadania rozwiązywane samodzielnie:

#### Zadanie 3

1. W projekcie stwórz servlet `Servlet13` dostępny pod adresem **/servlet13**,
 który wyświetli w przeglądarce lokalny czas.
Wykorzystaj `LocalTime.now()`.


#### Zadanie 4
1. W projekcie stwórz servlet `Servlet14` dostępny pod adresem **/servlet14**,
2. Wyświetl w przeglądarce poniższe informacje (wykorzystaj metodę **getHeader** obiektu typu **HttpServletRequest**):
    * adres IP,
    * przeglądarkę.
