package org.example;

public class Gra {
    String runda;

    public Gra(String runda) {
        this.runda = runda;
    }

    public static char[] znaki(){
        return new char[]{'A', 'Y'};
    }
    public char[] zwrocTabliceZnakow(){
        return runda.toCharArray();
    }
    public static char zmienZnaki(char znak){
        switch (znak){
            case 'A':
            case 'x':{
                return 'K';
            }
            case 'B':
            case 'Y':{
                return 'P';
            }
            case 'C':
            case 'Z':{
                return 'N';
            }
        }
        return 0;
    }
    public static char[] zmienZnakiWTablice(char[] znaki){
        for (int i = 0; i < znaki.length ; i++) {
            znaki[i] = zmienZnaki(znaki[i]);
        }
        return znaki;
    }
    public static int obliczWynik(char[] znaki){
        String pryjorytety = "KPZ";
        switch (znaki[0]){
            case 'K':
                return znaki[1] == 'P' ? 0:6;

            case 'P':
                return znaki[1] == 'N' ?6:0;
            case 'N':
                return znaki[1] == 'K' ?6:0;
        }
        return 3;

    }
    public static int obliczWynikDlaZnakow(char[] znaki, int wynik){
        switch (znaki[1]){
            case 'K':
                return wynik+1;
            case 'P':
                return wynik+2;
            case 'N':
                return wynik+3;
        }

        return wynik;

    }
}
