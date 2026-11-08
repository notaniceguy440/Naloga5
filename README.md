Android aplikacija z več aktivnostmi

Opis projekta

Projekt predstavlja Android aplikacijo, izdelano v okolju Android Studio, katere namen je spoznavanje delovanja in povezovanja več aktivnosti znotraj ene aplikacije.

Aplikacija vsebuje tri aktivnosti: MainActivity, HelloActivity in ThirdActivity. Glavni poudarek je na navigaciji med aktivnostmi, prenosu podatkov s pomočjo eksplicitnih namenov (Intent) ter uporabi potezne navigacije.

Funkcionalnosti

Števec: Povečevanje vrednosti števca s klikom na gumb Count.

Več aktivnosti: Navigacija med tremi različnimi zasloni aplikacije.

Prenos podatkov: Prenos trenutne vrednosti števca med aktivnostmi z uporabo metod putExtra() in getIntExtra().

Navigacija z gumbi: Prehajanje med aktivnostmi s klikom na gumbe.

Potezna navigacija: Prehajanje med aktivnostmi z uporabo potegov prsta po zaslonu.

Struktura aplikacije

1. MainActivity

Glavni zaslon aplikacije vsebuje:

Prikaz trenutne vrednosti števca.

Gumb Count za povečevanje števca.

Gumb za prehod na aktivnost HelloActivity.

Gumb za prehod na aktivnost ThirdActivity.

2. HelloActivity

Drugi zaslon aplikacije prikazuje:

Besedilo Hello!

Trenutno vrednost števca, preneseno iz aktivnosti MainActivity.

Gumb za vrnitev na glavno aktivnost MainActivity.

3. ThirdActivity

Tretji zaslon aplikacije prikazuje:

Besedilo Activity 3.

Trenutno vrednost števca, preneseno iz druge aktivnosti.

Gumbe za prehod na MainActivity in HelloActivity.

Potezno navigacijo:

Poteg v levo omogoča prehod na MainActivity.

Poteg v desno omogoča prehod na HelloActivity.

Uporabljene tehnologije

Java

Android Studio

XML (oblikovanje uporabniškega vmesnika)

Android Intents

Navigacija med aktivnostmi

OnSwipeTouchListener

Znanja, pridobljena pri projektu

Pri izdelavi aplikacije se spoznamo z naslednjimi koncepti razvoja Android aplikacij:

Ustvarjanje in upravljanje več aktivnosti.

Oblikovanje uporabniških vmesnikov z uporabo XML.

Prehajanje med aktivnostmi z eksplicitnimi nameni (Intent).

Prenos podatkov med aktivnostmi z uporabo dodatnih podatkov (Intent Extras).

Pridobivanje prenesenih podatkov z metodo getIntExtra().

Upravljanje zaporedja aktivnosti z uporabo Intent flags.

Zaznavanje dotikov in izvajanje potezne navigacije.

Namen projekta

Glavni namen vaje je spoznati povezovanje več aktivnosti v Android aplikaciji, prenos podatkov med posameznimi zasloni ter implementacijo različnih načinov navigacije s pomočjo gumbov in potez prsta po zaslonu.
