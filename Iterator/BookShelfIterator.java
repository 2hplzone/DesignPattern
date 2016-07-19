package Delegate.Iterator;

/**
 * Created by user on 2016-07-19.
 */
public class BookShelfIterator implements  Iterator{
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf){
        this. bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()) return true;
        else return false;
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index ++;
        return book;
    }
}
