package model.factories;

public abstract class Ebook {

    protected String name;
    protected  int pagesNumbers;
    protected  Long value;
    protected Long sizeArchive;

    public Ebook(String name, int pagesNumbers,Long value,Long sizeArchive){
        this.name = name;
        this.pagesNumbers=pagesNumbers;
        this.value=value;
        this.sizeArchive = sizeArchive;
    }

    public abstract void seeCharacteristics();
}
