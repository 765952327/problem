package cn.winstone.transaction.service;

import cn.winstone.transaction.dao.UserDao;
import cn.winstone.transaction.domain.Blog;
import cn.winstone.transaction.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class UserService {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private UserDao userDao;
    public User get(int userId) {
        User one = userDao.getUserById(userId);
        if (one == null){
            throw new IllegalArgumentException("用户不存在");
        }
        return one;
    }
}
