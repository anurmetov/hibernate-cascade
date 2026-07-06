package core.basesyntax;

import core.basesyntax.dao.CommentDao;
import core.basesyntax.dao.SmileDao;
import core.basesyntax.dao.impl.CommentDaoImpl;
import core.basesyntax.dao.impl.SmileDaoImpl;
import core.basesyntax.model.Comment;
import core.basesyntax.model.Smile;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Smile smile = new Smile();
        smile.setValue("HAHA");
        SmileDao smileDao = new SmileDaoImpl(sessionFactory);
        smileDao.create(smile);

        Comment comment = new Comment();
        comment.setContent("Hello");

        CommentDao commentDao = new CommentDaoImpl(sessionFactory);
        commentDao.create(comment);
        commentDao.remove(comment);




    }
}
