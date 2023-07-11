package com.bookstore.bookStoreCrud.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.bookStoreCrud.ebean.Subject;
import com.bookstore.bookStoreCrud.service.SubjectService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class SubjectController {

	@Autowired
	private SubjectService subjectService;
	


	

	@RequestMapping("/subjects")
	public List<Subject> getSubjects(@RequestParam(value = "id", required = false) String id) {
	    if (id != null) {
	        return Collections.singletonList(subjectService.getSubject(id));
	    }
	    
	    return subjectService.getAllSubjects();
	}
	
	
	@RequestMapping("/subjects/form")
	public List<Subject> getSubjectsForm(@RequestParam(value = "id", required = false) String id) {
	    if (id != null) {
	        return Collections.singletonList(subjectService.getSubject(id));
	    }
	    
	    return subjectService.getAllSubjects();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/subjects")
	public void addSubject(@RequestBody Subject subject) {
		subjectService.addSubject(subject);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/subjects/form")
	public void addSubjectForm(@RequestParam("title") String title,
	                       @RequestParam("author") String author,
	                       @RequestParam("isbn") String isbn,
	                       @RequestParam("price") double price,
	                       @RequestParam("year") int year) {
	    // Create a new Subject object using the received data
	    Subject subject = new Subject(title, author, isbn, price, year);
	    
	    // Add the subject using the service or repository
	    subjectService.addSubject(subject);
	    
	}

	
	



	
	@RequestMapping(method = RequestMethod.PUT, value = "/subjects/{id}")
	public void updateSubject(@PathVariable String id, @RequestBody Subject updatedSubject) {
	    Subject existingSubject = subjectService.getSubject(id);

	    if (existingSubject != null) {
	        if (updatedSubject.getTitle() != null) {
	            existingSubject.setTitle(updatedSubject.getTitle());
	        }
	        
	        if (updatedSubject.getAuthor() != null) {
	            existingSubject.setAuthor(updatedSubject.getAuthor());
	        }
	        
	        if (updatedSubject.getIsbn() != null) {
	            existingSubject.setIsbn(updatedSubject.getIsbn());
	        }
	        
	        if (updatedSubject.getPrice() != 0.0) {
	            existingSubject.setPrice(updatedSubject.getPrice());
	        }
	        
	        if (updatedSubject.getYear() != 0) {
	            existingSubject.setYear(updatedSubject.getYear());
	        }

	        subjectService.updateSubject(id, existingSubject);
	    }
	}

	@RequestMapping(method = RequestMethod.POST, value = "/subjects/form/update")
	public void updateSubjectForm(@RequestParam("id") Long id,
	                          @RequestParam("title") String title,
	                          @RequestParam("author") String author,
	                          @RequestParam("isbn") String isbn,
	                          @RequestParam("price") double price,
	                          @RequestParam("year") int year) {
		Subject existingSubject = subjectService.getSubject(String.valueOf(id));


	    if (existingSubject != null) {
	        if (title != null) {
	            existingSubject.setTitle(title);
	        }

	        if (author != null) {
	            existingSubject.setAuthor(author);
	        }

	        if (isbn != null) {
	            existingSubject.setIsbn(isbn);
	        }

	        if (price != 0.0) {
	            existingSubject.setPrice(price);
	        }

	        if (year != 0) {
	            existingSubject.setYear(year);
	        }

	        subjectService.updateSubject(String.valueOf(id), existingSubject);
	    }
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/subjects/{id}")
	public void DeleteSubject(@PathVariable Long id) {
		subjectService.deleteSubject(String.valueOf(id));
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/subjects/form/delete")
	public void DeleteSubjectForm(@RequestParam("id") Long id) {
		subjectService.deleteSubject(String.valueOf(id));}
	
	
}
