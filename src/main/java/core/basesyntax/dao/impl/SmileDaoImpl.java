package core.basesyntax.dao.impl;

import core.basesyntax.HibernateUtil;
import core.basesyntax.dao.SmileDao;
import core.basesyntax.model.Smile;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SmileDaoImpl extends AbstractDao<Smile> implements SmileDao {
    public SmileDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Smile create(Smile entity) {
        create(entity);
    }

    @Override
    public Smile get(Long id) {
        return null;
    }

    @Override
    public List<Smile> getAll() {
        return null;
    }
}
