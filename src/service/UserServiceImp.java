package service;

import dao.UserDao;
import domain.User;

/**
 * Created by yupeng on 2016/11/11.
 */
public class UserServiceImp implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void regist(User user) {
        userDao.save(user);
    }
}
