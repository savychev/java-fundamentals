package be.intecbrussel.Oefening1.Oefening1_2;

//Schrijf een methode om te controleren of elk cijfer van een bepaald geheel getal even is. Is het getal even, retourneer dan true als elk cijfer oneven is retourneer false.
//
//Opmerking: 1, 3, 5, 7, 9 zijn oneven cijfers en 0, 2, 4, 6 en 8 zijn even cijfers
//
//Voorbeeld data: (8642)->true (123)->false (200)->true.

public class  EvenOdd {

    public EvenOdd() {
    }

    public boolean areAllNumsEven(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}