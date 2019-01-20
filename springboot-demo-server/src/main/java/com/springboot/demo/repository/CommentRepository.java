package com.springboot.demo.repository;

import com.springboot.demo.entity.ArticleEntity;
import com.springboot.demo.entity.CommentEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yemingfeng
 */
@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {

  List<CommentEntity> findByArticle(ArticleEntity article);

  List<CommentEntity> findByParent(CommentEntity parent);

}
