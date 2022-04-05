package com.finalproject.Food4u.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.Food4u.model.Category;
import com.finalproject.Food4u.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	public CategoryRepository categoryRepository;

	public List<Category> getAllCategory() {
		return categoryRepository.findAll();
	}

	public void addCategory(Category category) {
		categoryRepository.save(category);
	}

	public void removeCategoryById(int id) {
		categoryRepository.deleteById(id);
	}

	public Optional<Category> getCategoryById(int id) {
		return categoryRepository.findById(id);
	}

}
