package cn.winstone.transaction.service;

import cn.winstone.transaction.dao.BlogDao;
import cn.winstone.transaction.domain.Blog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BlogService {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private UserService userService;
    @Autowired
    private BlogDao blogDao;
    @Transactional
    public void createByUserId(int userId){
        try {
            userService.get(userId);
            Blog blog = new Blog();
            blog.setName("初始文章");
            blog.setAuthorId(0);
            blogDao.save(blog);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }
        logger.info("初始文章创建完成");
    }
    
    
}
