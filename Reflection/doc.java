Metody tworzenie obiektu typu class:

1. Metoda
Employee e;
...
Class c1 = e.getClass();
// metoda getClass zwraca egzemplarz klasy

2. Metoda
String someClass = new Date();
Class c1 = Class.forName(someClass);

3 Metoda
Class cl1 = Random.class;
Class cl2 = int.class;

// Class oznaczy typ ktory moze ale nie musi byc klasa, np int nie jest klasa ale int.class jest obiektem
// typu class

e.getClass().newInstance();
// powyzsz instrukcja tworzy instancje obiektu tego samego typu co "e", metoda ta wywołuje
// konstruktor domyslny , hdy takiego nie ma powodowany jest wyjatek
// dlatego w spring dodajemy zawsze pusty konstruktor

String s = "java.util.Date";
Object m = Class.forName(s).newInstance();
// mozna utworzyc obiekt z nazwy klasy przechowywanej w lancuchu, jesli konieczne jest podanie
// parametrow do konstruktora klasy metody newInstance klasy Constructor

