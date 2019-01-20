package com.springboot.demo.repository;

import com.springboot.demo.entity.ArticleEntity;
import com.springboot.demo.entity.UserEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yemingfeng
 */
@Repository
public interface ArticleRepository extends JpaRepository<ArticleEntity, Long> {

  List<ArticleEntity> findByUser(UserEntity user);

}
