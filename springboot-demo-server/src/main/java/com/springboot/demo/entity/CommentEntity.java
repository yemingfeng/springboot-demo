package com.springboot.demo.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 * @author yemingfeng
 */
@Data
@Entity
@Table(name = "Comment", indexes = {
    @Index(name = "idx_user_id", columnList = "userId"),
    @Index(name = "idx_parent_id", columnList = "parentId"),
    @Index(name = "idx_article_id", columnList = "articleId")
})
public class CommentEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "userId")
  private UserEntity user;
  @ManyToOne
  @JoinColumn(name = "parentId")
  private CommentEntity parent;
  @ManyToOne
  @JoinColumn(name = "articleId")
  private ArticleEntity article;
  private String content;
}
