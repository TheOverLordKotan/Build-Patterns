package model.concreteBusiness;

import model.factories.Book;

public class TerrorBookKing extends Book {

    public TerrorBookKing(String name, int pagesNumbers, Long value) {
        super(name, pagesNumbers, value);
    }

    @Override
    public void seeCharacteristics() {
        System.out.println("Book paper terrror  "+name+"with" + pagesNumbers+"With price:" +value);
    }
}
