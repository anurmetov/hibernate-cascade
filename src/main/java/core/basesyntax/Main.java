package core.basesyntax;

import core.basesyntax.dao.CommentDao;
import core.basesyntax.dao.MessageDao;
import core.basesyntax.dao.SmileDao;
import core.basesyntax.dao.impl.CommentDaoImpl;
import core.basesyntax.dao.impl.MessageDaoImpl;
import core.basesyntax.dao.impl.SmileDaoImpl;
import core.basesyntax.model.Comment;
import core.basesyntax.model.Message;
import core.basesyntax.model.MessageDetails;
import core.basesyntax.model.Smile;
import org.hibernate.SessionFactory;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        MessageDetails messageDetails = new MessageDetails();
        messageDetails.setSender("Artem");
        messageDetails.setSentTime(LocalDateTime.now());

        Message message = new Message();
        message.setContent("Comment1");
        message.setMessageDetails(messageDetails);



        MessageDao messageDao = new MessageDaoImpl(sessionFactory);
        messageDao.create(message);
        messageDao.remove(message);






    }
}
