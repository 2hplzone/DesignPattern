package Delegate.Iterator;

/**
 * Created by user on 2016-07-12.
 */
public interface Iterator {
    //다음 요소가 존재하는지 확인
    public abstract boolean hasNext();

    //집합체 요소 중 1개 반환
    public abstract Object next();
}
