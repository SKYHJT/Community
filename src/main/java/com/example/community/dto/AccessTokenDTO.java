package com.example.community.dto;

import lombok.Data;

/**
 * @ClassName AccessTokenDTO  DTO:(Data Transform Object)数据传输对象
 * @Description TODO
 * @Author hujingtao
 * @Date 2020/2/24 11:24
 * @Version 1.0
 **/
@Data
public class AccessTokenDTO {

    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

}
