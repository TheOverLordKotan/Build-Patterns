package model.factories;

public abstract class Book {

    protected String name;
    protected  int pagesNumbers;
    protected  Long value;

    public Book(String name, int pagesNumbers,Long value){
        this.name = name;
        this.pagesNumbers=pagesNumbers;
        this.value=value;
    }

    public abstract void seeCharacteristics();
}
