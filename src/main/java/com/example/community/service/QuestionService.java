package com.example.community.service;

import com.example.community.dto.PaginationDTO;
import com.example.community.dto.QuestionDTO;
import com.example.community.mapper.QuestionMapper;
import com.example.community.mapper.UserMapper;
import com.example.community.model.Question;
import com.example.community.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName QuestionService
 * @Description TODO
 * @Author hujingtao
 * @Date 2020/2/27 10:43
 * @Version 1.0
 **/
@Service
public class QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;

    public List<QuestionDTO> list() {
        List<Question> questions = questionMapper.list();
        List<QuestionDTO> questionDTOList = new ArrayList<>();
        for (Question question : questions) {
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            // BeanUtils.copyProperties()方法的左右就是快速可将question上的属性拷贝到questionDTO上
            BeanUtils.copyProperties(question,questionDTO);
            questionDTO.setUser(user);
//            System.out.println(questionDTO.toString());
            questionDTOList.add(questionDTO);
        }
        return questionDTOList;
    }

//    public PaginationDTO list(Integer page, Integer size) {
//        // size*(page-1)
//        Integer offset = size*(page-1);
//        List<Question> questions = questionMapper.list(offset,size);
//        return null;
//    }
}
