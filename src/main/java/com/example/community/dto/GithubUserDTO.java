package com.example.community.dto;

import lombok.Data;

/**
 * @ClassName GithunUserDTO
 * @Description TODO
 * @Author hujingtao
 * @Date 2020/2/24 12:00
 * @Version 1.0
 **/
@Data
public class GithubUserDTO {

    private String name;
    private Long id;
    private String bio;
    private String avatar_url;

}
