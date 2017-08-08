package model.concreteBusiness;

import model.factories.Ebook;

public class EbookTopSecrect extends Ebook {


    public EbookTopSecrect(String name, int pagesNumbers, Long value, Long sizeArchive) {
        super(name, pagesNumbers, value, sizeArchive);
    }

    @Override
    public void seeCharacteristics() {
        System.out.println("Ebook Digital Top Secret "+name+"with" + pagesNumbers+"With price:" +value +"and Size:" +sizeArchive);
    }
}
