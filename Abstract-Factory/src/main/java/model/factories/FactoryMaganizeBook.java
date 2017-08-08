package model.factories;


import model.concreteBusiness.EbookTopSecrect;
import model.concreteBusiness.TerrorMagazineBook;

public class FactoryMaganizeBook implements BookFactory {

    @Override
    public Book createBook(String name, int pagesNumbers, Long value) {
        return new TerrorMagazineBook(name,pagesNumbers,value);
    }

    @Override
    public Ebook createEbook(String name, int pagesNumbers, Long value, Long sizeArchive) {
        return new EbookTopSecrect(name,pagesNumbers,value,sizeArchive);
    }
}
