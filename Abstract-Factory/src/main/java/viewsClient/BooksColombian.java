package viewsClient;

import model.factories.*;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BooksColombian
{
    public static int nBooks = 3;
    public static int nEbooks =2;
    public static void main(String [] args )
    {
        Scanner reader = new Scanner(System.in);
        BookFactory factoryBooks;
        Ebook[] ebooksColombian = new Ebook[nEbooks];
        Book[] booksColombian = new Book[nBooks];
        String[] nameBooks = { "The king", " i am a crack", "The most Lord" };

        System.out.println("What do you want to buy 1) books or 2)Ebooks");
        String selected = reader.next();
        if(selected.equals("1"))
        {
         factoryBooks = new FactoryGenderBook();
        }else
        {
        factoryBooks = new FactoryMaganizeBook();
        }
        for (int index = 0; index < nEbooks; index++) {
            ebooksColombian[index] = factoryBooks.createEbook(nameBooks[index],100,new Long(200),new Long(200));
        }
        for (int index = 0; index < nBooks; index++) {
            booksColombian[index]=factoryBooks.createBook(nameBooks[index],100,new Long(200));
        }
        for (Ebook paperBooks:ebooksColombian) {
            paperBooks.seeCharacteristics();
        }
        for (Book paperBooks:booksColombian) {
            paperBooks.seeCharacteristics();
        }

    }
}
