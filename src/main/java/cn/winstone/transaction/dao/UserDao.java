package cn.winstone.transaction.dao;

import cn.winstone.transaction.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User getUserById(int id);
}
