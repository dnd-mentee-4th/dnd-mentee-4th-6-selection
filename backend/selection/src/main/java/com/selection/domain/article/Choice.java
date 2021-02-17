package com.selection.domain.article;

import com.selection.domain.BaseEntity;
import com.selection.domain.article.Article;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "CHOICES")
public class Choice extends BaseEntity {

    @Column(nullable = false, length = 100)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Article article;

    public Choice(String content, Article article) {
        this.content = content;
        this.article = article;
    }

    void modifyContent(String content) {
        this.content = content;
    }
}