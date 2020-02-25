package com.example.community.dto;

/**
 * @ClassName GithunUserDTO
 * @Description TODO
 * @Author hujingtao
 * @Date 2020/2/24 12:00
 * @Version 1.0
 **/
public class GithunUserDTO {

    private String name;
    private Long id;
    private String bio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
