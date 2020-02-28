package com.example.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @ClassName PaginationDTO
 * @Description TODO
 * @Author hujingtao
 * @Date 2020/2/27 16:58
 * @Version 1.0
 **/
@Data
public class PaginationDTO {

    private List<QuestionDTO> questions;
    private boolean hasPrevious;
    private boolean hasFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages;

    public void setPagination(Integer totalCount, Integer page, Integer size) {
        Integer totalPage = 0;
        if(totalCount % size ==0){
            totalPage = totalCount / size;
        }else{
            totalPage = totalCount / size + 1;
        }
    }
}
