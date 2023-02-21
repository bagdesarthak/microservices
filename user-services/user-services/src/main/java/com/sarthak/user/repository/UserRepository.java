 package com.sarthak.user.repository;

 import com.sarthak.user.entity.User;
 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;

 @Repository
public interface UserRepository extends JpaRepository<User,Long> {
  User findByUserId(Long userId);
}
