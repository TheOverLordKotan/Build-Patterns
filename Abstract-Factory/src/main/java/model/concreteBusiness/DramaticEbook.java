package model.concreteBusiness;

import model.factories.Ebook;

public class DramaticEbook extends Ebook {

    public DramaticEbook(String name, int pagesNumbers, Long value, Long sizeArchive) {
        super(name, pagesNumbers, value, sizeArchive);
    }

    @Override
    public void seeCharacteristics() {
        System.out.println("Ebook Digital Dramatic  "+name+"with" + pagesNumbers+"With price:" +value +"and Size:" +sizeArchive);
    }
}
