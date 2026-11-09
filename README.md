# Android aplikacija z več aktivnostmi

## Opis projekta

Projekt predstavlja Android aplikacijo, izdelano v okolju Android Studio, katere namen je spoznavanje delovanja in povezovanja več aktivnosti znotraj ene aplikacije.

Aplikacija vsebuje tri aktivnosti: MainActivity, HelloActivity in ThirdActivity. Glavni poudarek je na navigaciji med aktivnostmi, prenosu podatkov s pomočjo eksplicitnih namenov (Intent) ter uporabi potezne navigacije.

## Funkcionalnosti

- Števec: povečevanje vrednosti števca s klikom na gumb Count.
- Več aktivnosti: navigacija med tremi različnimi zasloni aplikacije.
- Prenos podatkov: prenos trenutne vrednosti števca med aktivnostmi z uporabo metod putExtra() in getIntExtra().
- Navigacija z gumbi: prehajanje med aktivnostmi s klikom na gumbe.
- Potezna navigacija: prehajanje med aktivnostmi z uporabo potegov prsta po zaslonu.

## Struktura aplikacije

### 1. MainActivity

Glavni zaslon aplikacije vsebuje:

- prikaz trenutne vrednosti števca,
- gumb Count za povečevanje števca,
- gumb za prehod na aktivnost HelloActivity,
- gumb za prehod na aktivnost ThirdActivity.

### 2. HelloActivity

Drugi zaslon aplikacije prikazuje:

- besedilo Hello!,
- trenutno vrednost števca, preneseno iz aktivnosti MainActivity,
- gumb za vrnitev na glavno aktivnost MainActivity.

### 3. ThirdActivity

Tretji zaslon aplikacije prikazuje:

- besedilo Activity 3,
- trenutno vrednost števca, preneseno iz druge aktivnosti,
- gumbe za prehod na MainActivity in HelloActivity,
- potezno navigacijo:
  - poteg v levo omogoča prehod na MainActivity,
  - poteg v desno omogoča prehod na HelloActivity.

## Uporabljene tehnologije

- Java
- Android Studio
- XML (oblikovanje uporabniškega vmesnika)
- Android Intents
- Navigacija med aktivnostmi
- OnSwipeTouchListener

## Znanja, pridobljena pri projektu

Pri izdelavi aplikacije se spoznamo z naslednjimi koncepti razvoja Android aplikacij:

- ustvarjanje in upravljanje več aktivnosti,
- oblikovanje uporabniških vmesnikov z uporabo XML,
- prehajanje med aktivnostmi z eksplicitnimi nameni (Intent),
- prenos podatkov med aktivnostmi z uporabo dodatnih podatkov (Intent Extras),
- pridobivanje prenesenih podatkov z metodo getIntExtra(),
- upravljanje zaporedja aktivnosti z uporabo Intent flags,
- zaznavanje dotikov in izvajanje potezne navigacije.

## Namen projekta

Glavni namen vaje je spoznati povezovanje več aktivnosti v Android aplikaciji, prenos podatkov med posameznimi zasloni ter implementacijo različnih načinov navigacije s pomočjo gumbov in potez prsta po zaslonu.

<img width="405" height="918" alt="image" src="https://github.com/user-attachments/assets/9eb0e05b-c7fa-456c-9f7c-8f53292075f0" />

