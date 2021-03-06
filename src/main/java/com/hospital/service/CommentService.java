package com.hospital.service;

import com.hospital.models.Comment;
import com.hospital.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

//    public List<Comment> findByPatientId(Long patientId){
//        return commentRepository.findByPatientId(patientId);
//    }
    public Comment findOne(Long id){
        return commentRepository.findOne(id);
    }
    public void save(Comment comment){
        commentRepository.save(comment);
    }
    public void delete(Long Id){
        commentRepository.delete(Id);
    }

}
