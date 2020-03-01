package com.example.community.dto;

import com.example.community.model.User;
import lombok.Data;

/**
 * @ClassName QuestionDTO
 * @Description TODO
 * @Author hujingtao
 * @Date 2020/2/27 10:40
 * @Version 1.0
 **/
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", tag='" + tag + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", creator=" + creator +
                ", viewCount=" + viewCount +
                ", commentCount=" + commentCount +
                ", likeCount=" + likeCount +
                ", user=" + user +
                '}';
    }
}
