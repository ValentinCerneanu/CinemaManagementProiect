# Cinema Management

### Descrierea aplicatiei
Aplicatia realizata in cadrul proiectului reprezinta un instrument pentru gestionarea activitatilor din cadrul unui cinema si este divizata in trei componenete: baza de date(MySQL), backend(Spring Boot) si frontend(Angular). Aceasta se imparte in doua senarii reprezentate ca doua roluri: ADMIN si CLIENT.
Un administrator de cinema poate adauga informatii despre angajati, poate vizualiza lista angajatilor, poate modifica salariul acestora sau ii poate sterge in momentul in care acestia nu mai lucreaza in respectiva locatie. De asemenea, administratorul cinematografului este responsabil pentru adaugarea filmelor nou aparute si gestionarea repartizarii pe sali prin operatii de adaugare, editare si vizualizare.
Aplicatia genereaza doua rapoarte pentru a urmarii progresul cinematografului. Primul este sub forma unui piechart si ilustreaza raportul dintre cheltuieli, incasari si profit pe o anumita perioada de timp(in mod implicit aceasta este ultima luna). Cel de al doilea raport este ilustrat sub forma de grafic si desemneaza cele mai urmarite filme, acestea sunt cele care produc cel mai mare venit cinematografului in functie de numarul de bilete vandute.
Rolul de client are o singura actiune asociata, aceea de a vinde bilete clientilor cinematografului.
Pentru realizarea acesteia se efectueaza urmatorii pasi:
Se vizualizeaza lista tuturor filemlor si se alege filmul pentru care se va achizitiona biletul.
Urmatoarea actiune reprezinta cumpararea efectiva a biletului care presupune patru etape:
1. Revizualizarea informatiilor despre film pentru confirmarea alegerii facute si selectarea orei la care se doreste vizualizarea; acestor informatii se adauga pretul unui bilet.
2. Selectarea locului/locurilor in sala de cinema; bineinteles, pretul total este calculat in functie de numarul de locuri selectate(adica numarul de bilete achizitionate)
3. Efectuarea platii 
4. Vizualizarea biletului cumparat.

### Spring Boot
Spring Boot se defineste drept un framework provenit din Java și utilizat pentru a crea micro-servicii.  Conceptul de fundamental al unei aplicații Spring reprezintă injectarea dependențelor. Aceasta este utilizată ca o alternativă a procesului de conectarea a claselor prin intermediul constructorilor. Astfel, injectarea dependințelor externalizeză relația dintre obiecte și simplifică conectarea acestora. Scopul dezvoltării Spring Boot a fost acela de a oferi o abordare distinctă de Java Enterprise Edition folosind în principal dependențe și programare orientată spre aspect. 

Unul dintre conceptele esențiale ale programării Spring este acela de bean, termen care se definește sub forma unui obiect instanțiat de containerul Spring IoC și care gestionează instanțierea dependințelor utilizând clasele. Temernul de Inversion of Control(abreviat IoC), cunoscut și sub numele de injecția dependențelor, denumire care reflectă definiția, ilustrează procesul prin care obiectele își definesc dependențele, respectiv relațiile cu celelalte obiecte, numai prin intermediul constructorului sau a proprietăților care sunt setate pe instanța obiectului post-construcție. În etapa creări unui bean, aceste dependințe îi sunt atribuite.

Versiunea de Spring 2.5 a introdus conceptul de adnotări, annotation-based-component-scanning, ceea ce reprezintă o interpretare a elementelor în scopul de a ușura procesul de scriere efectivă a codului. Totodată, adnotările susțin programarea orientată pe aspect, deoarece orice clasă poate fi interpretată drept aspect prin intermediul acestora. 

### Angular
 
 Angular se definește drept o platformă de dezvoltare a aplicațiilor web fundamentată pe limbajul TypeScript. Termenul de framework face referire la bibliotecile de cod utilizate pentru a contura o aplcație și este potrivit descrierii AngularJS, în timp ce termenul de platformă inglobează intrumentarea necesară dezvoltării unei aplicații, acesta putând fi asociat cu Angular.  
 Angular include un set de biblioteci pentru dezvoltarea interfeței utilizatorului pe care dezvoltatorul aplicației le poate utiliza în codul scris de acesta cu ușurință pentru a simplifica anumite etape care nu sunt incluse în procesul de conturare a logicii aplicației, precum: definirea tabelelor sau filelor. Întrucât Angular dispune de un număr mare de biblioteci pentru intefața utilizatorului acestea acoperă o arie largă de aplicabilitate. Un exemplu relevant de bibliotecă pentru interfața grafică a utilizatorului în lucrarea de licență este Angular Material. 
 Caracteristicile principale ale unei dezvoltări Angular includ concepte precum: clase, decoratori, module și șabloane. Conceptul de clasă a fost introdus ca o nouă opțiune de a defini obiectele. Utilizările frecvente ale claselor constau în crearea componentelor, directivelor, serviciilor și a pipe-urilor. Declarările din cadrul claselor sunt, în fapt, proprietățile atribuite obiectului defint sub o clasă. Principiul de moștenire este adoptat din JavaScript fără a suferi modificări. 
 
### Concluzie
Proiectul reprezinta o aplicatie web optima pentru gestionarea resurselor din cadrul unui cinematograf.