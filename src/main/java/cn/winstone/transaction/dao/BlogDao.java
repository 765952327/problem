package cn.winstone.transaction.dao;

import cn.winstone.transaction.domain.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogDao extends JpaRepository<Blog,Integer> {
}
