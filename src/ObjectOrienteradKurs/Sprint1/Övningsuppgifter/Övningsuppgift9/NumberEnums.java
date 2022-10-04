package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift9;

public enum NumberEnums {

    romanNum1(1,"I"),
    romanNum5(5,"V"),
    romanNum10(10,"X"),
    romanNum50(50,"L"),
    romanNum100(100,"C"),
    romanNum500(500,"D"),
    romanNum1000(1000,"M");


    final int value;
    final String letter;

    NumberEnums(int value, String letter){
        this.value = value;
        this.letter = letter;
    }

    public int getValue() {
        return value;
    }

    public String getLetter() {
        return letter;
    }




}
