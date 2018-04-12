package ua.lviv.iot.andriy.persistence.dao;

import ua.lviv.iot.andriy.model.Fruit;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

    @Named
    @Dependent
    public class FruitDaoImpl extends AbstractDao<Fruit> implements FruitDao, Serializable {

        private static final long serialVersionUID = 1L;

        @PersistenceContext
        private EntityManager entityManager;

        @Override
        protected Class<Fruit> getEntityClass() {
            return Fruit.class;
        }

        //@Resource
        //private UserTransaction userTransaction;

    }


