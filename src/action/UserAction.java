package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.User;
import service.UserService;

/**
 * Created by yupeng on 2016/11/11.
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{
    private User user = new User();
    @Override
    public User getModel() {
        return user;
    }
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public String regist(){
        userService.regist(user);
        return SUCCESS;
    }
}
