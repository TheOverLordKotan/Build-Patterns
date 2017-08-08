package model.concreteBusiness;

import model.factories.Book;

public class TerrorMagazineBook extends Book {


    public TerrorMagazineBook(String name, int pagesNumbers, Long value) {
        super(name, pagesNumbers, value);
    }

    @Override
    public void seeCharacteristics() {
        System.out.println("Magazine paper terrror  "+name+"with" + pagesNumbers+"With price:" +value);
    }
}
