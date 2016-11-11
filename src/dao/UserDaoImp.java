package dao;

import domain.User;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by yupeng on 2016/11/11.
 */
public class UserDaoImp extends HibernateDaoSupport implements UserDao{


    @Override
    public void save(User user) {
        this.getHibernateTemplate().save(user);
    }
}
