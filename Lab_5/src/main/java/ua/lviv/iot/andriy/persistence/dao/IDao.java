package ua.lviv.iot.andriy.persistence.dao;

public interface IDao<T> {

    T findById(Integer id);

    T persist(T object);
}
