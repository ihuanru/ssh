package test;

import domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

/**
 * Created by yupeng on 2016/11/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class testApp {
    @Autowired
    private UserService userService;


    @Test
    public void test1(){
        User user = new User();
        user.setUsername("zhang");
        user.setPassword("555");
        user.setAge(12);
        userService.regist(user);
    }

}
