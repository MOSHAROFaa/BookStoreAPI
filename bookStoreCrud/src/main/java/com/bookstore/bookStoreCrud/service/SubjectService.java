package com.bookstore.bookStoreCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookStoreCrud.ebean.Subject;
import com.bookstore.bookStoreCrud.repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	public SubjectRepository subjectRepo;
	
	public List<Subject> getAllSubjects()
	{
		List<Subject> subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
	}

	public void addSubject(Subject subject) {
		// TODO Auto-generated method stub
		subjectRepo.save(subject);
	}

	public void updateSubject(String id, Subject subject) {
		// TODO Auto-generated method stub
		subjectRepo.save(subject);
	}

	public void deleteSubject(String id) {
		// TODO Auto-generated method stub
		subjectRepo.deleteById(id);
	}

	public Object getId(String id, Subject subject) {
		// TODO Auto-generated method stub
		return subject ;
	}

//	public Subject getSubjects(String id) {
//		// TODO Auto-generated method stub
//		return Subject.findById(id);
//	}
	public Subject getSubject(String id) {
	    return subjectRepo.findById(id).orElse(null);
	}

}
