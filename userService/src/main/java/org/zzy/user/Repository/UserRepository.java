package org.zzy.user.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzy.user.Entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    // 自动支持基本的 CRUD
    // 你甚至可以根据方法名定义查询
    List<User> findByName(String name);
}
