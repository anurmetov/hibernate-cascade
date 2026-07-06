package core.basesyntax.dao.impl;

import core.basesyntax.HibernateUtil;
import core.basesyntax.dao.CommentDao;
import core.basesyntax.dao.GenericDao;
import core.basesyntax.model.Comment;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CommentDaoImpl extends AbstractDao<Comment> implements CommentDao {
    public CommentDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Comment create(Comment entity) {
        return super.create(entity);
    }

    @Override
    public Comment get(Long id) {
        return null;
    }

    @Override
    public List<Comment> getAll() {
        return null;
    }

    @Override
    public void remove(Comment entity) {
        Transaction transaction;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.getTransaction();
            transaction.begin();
            session.remove(entity);
            transaction.commit();
        } catch (Exception e) {
            throw new RuntimeException("Can not remove a entity from a DB.", e);
        }
    }
}
