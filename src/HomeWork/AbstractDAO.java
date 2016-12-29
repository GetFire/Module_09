package HomeWork;

import java.util.List;

public interface AbstractDAO<T> {

    T save(T aSave);

    void delete(T aDelete);

    void deleteAll(List<T> list);

    void saveAll(List<T> list);

    List<T> getDataBase();

    void deleteById(long id);

    T getByID(long id);


}
