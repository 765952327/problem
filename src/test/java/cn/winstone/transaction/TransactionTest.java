package cn.winstone.transaction;


import cn.winstone.transaction.service.BlogService;

import cn.winstone.transaction.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TransactionTest {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private BlogService  blogService;
    
    @Test
    public void rollbackOnly() {
        blogService.createByUserId(1);
        logger.info("rollbackOnly end");
    }
}
