package model.factories;

public interface BookFactory {

    public Book createBook(String name, int pagesNumbers,Long value);

    public Ebook createEbook(String name, int pagesNumbers,Long value,Long sizeArchive);

}
