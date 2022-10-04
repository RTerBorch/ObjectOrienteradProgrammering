package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Program;

public enum VäxtEnums {


    vä1(1, "Henrik" , "Kaktus"),
    vä2(5, "Boris" , "Palm");



   final int length;
   final String name;
   final String type;

    VäxtEnums(int length, String name, String type) {

        this.length = length;
        this.name = name;
        this.type = type;
    }


}