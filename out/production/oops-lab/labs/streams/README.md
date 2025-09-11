### Java Streams

**För de här uppgifterna kommer du att behöva en List<> (generisk lista) med objekt. Skapa objekt som innehåller följande information om länder.**

**Namn, huvudstad, folkmängd (miljoner), area (km2)**

1. [ ] Sverige, Stockholm, 10.07, 450295
2. [ ] Norge, Oslo, 5.27, 323802
3. [ ] Island, Reykjavik, 0.33, 102775
4. [ ] Danmark, Köpenhamn, 5.75, 42931
5. [ ] Finland, Helsinki, 5.51, 338424
6. [ ] Belgien, Bryssel, 11.30, 30528
7. [ ] Tyskland, Berlin, 82.18, 357168
8. [ ] Frankrike, Paris, 66.99, 640679
9. [ ] Storbritannien, London, 60.80, 209331
10. [ ] Niue, Alofi, 0.0016, 261
11. [ ] Mongoliet, Ulan Batar, 3.08, 1566000
12. [ ] Polen, Warszawa, 38.63, 312679
13. [ ] Spanien, Madrid, 46.5, 505990
14. [ ] Portugal, Lissabon, 10.31, 92212
15. [ ] Italien, Rom, 60.59, 301338
16. [ ] Grekland, Aten, 11.18, 131957
17. [ ] Luxemburg, Luxemburg, 0.58, 2586
18. [ ] Liechtenstein, Vaduz, 0.038, 160

---

2. Skriv ut namnet på det första och det sista landet i listan på konsolen.
3. Skriv ut namnen på alla länder i listan, sorterade i bokstavsordning.
4. Skriv ut namnen på alla länder i listan, sorterade efter befolkning, med den högsta befolkningen först.
5. Skriv ut vilken den största befolkningsmängden är.
6. Skriv ut genomsnittsarean och hur många länder som har en mindre area än genomsnittet.
7. Skriv ut namnen på alla länder som har en befolkning som är mindre än 5 miljoner.
8. Använd tre queries för att skriva ut hur många länder som har en area över 10 000, över 100 000 och över 1 000 000 respektive.
9. Skriv ut namn och huvudstad för alla länder vars huvudstad börjar på samma bokstav som landets namn.
10. Skriv ut alla land vars namn är längre än namnet på deras huvudstad.
11. Skriv ut de fem första länderna som har minst folkmängd.
12. Skriv ut de tre första länderna som har minst folkmängd och över 7 miljoner. Exempelvis kommer Norge inte med för det har bara 5 miljoner, men Sverige har 10 miljoner så det kommer med.
13. Skriv ut namnen på upp till tre länder som har en area på minst 500 000 km2, sorterade fallande efter namn.
14. Skriv ut hur många länder det finns som börjar på varje bokstav som finns i listan. Exempelvis så finns det tre länder vars namn börjar på S, ett som börjar på D och två som börjar på F.
15. Skriv ut hur många länder det finns som har en befolkning på X miljoner och deras namn. Sortera dem i bokstavsordning på namnet. Befolkningsmängden ska avrundas nedåt till ett heltal. Utskriften ska se ut ungefär så här:
    Länder med 0 miljoner invånare:
    - Island
    - Niue
      Länder med 3 miljoner invånare:
    - Mongoliet
      osv.
16. a) Skriv ut namnet och befolkningsmängden för alla länder, men räkna om befolkningsmängden till faktiska tal. Alltså ska till exempel 1.5 miljoner skrivas ut som 1500000.
    b) Skriv ut namnet på alla länder och hur trångbodda de är. Trångboddheten räknar du ut genom att ta befolkningsmängden delat med arean. Räkna om befolkningsmängden till faktiska tal som i 16a först.
17. Skriv ut namnet på alla länder, sorterat fallande efter deras huvudstäders namn baklänges. Till exempel kommer Tyskland före Niue, eftersom Alofi → ifola kommer före Berlin → nilreB.
18. Skriv ut hur stor befolkning de 6 minsta länderna har tillsammans. Skriv också ut hur stor befolkning de 3 största länderna har tillsammans.
19. Skriv ut hur stor befolkning alla länder vars namn är 7 tecken långt har tillsammans.