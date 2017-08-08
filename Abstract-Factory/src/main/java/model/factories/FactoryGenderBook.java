package model.factories;

import model.concreteBusiness.DramaticEbook;
import model.concreteBusiness.TerrorBookKing;

public class FactoryGenderBook implements BookFactory {


    @Override
    public Book createBook(String name, int pagesNumbers, Long value) {
        return new TerrorBookKing(name,pagesNumbers,value);
    }

    @Override
    public Ebook createEbook(String name, int pagesNumbers, Long value, Long sizeArchive) {
        return new DramaticEbook(name,pagesNumbers,value,sizeArchive);
    }
}
