package com.hibernate.caveatemptor.domain;

import java.util.HashSet;
import java.util.Set;

public class Category {

	private String name;

	private Category parentCategory;
	private Set<Category> childCategories = new HashSet<>();

	public Category() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}

	public Set<Category> getChildCategories() {
		return childCategories;
	}

	public void setChildCategories(Set<Category> childCategories) {
		this.childCategories = childCategories;
	}
	public void addChildCategory(Category childCategory) {
		   if (childCategory == null)
		  throw new IllegalArgumentException("Null child category!");
		   if (childCategory.getParentCategory() != null)
		  childCategory.getParentCategory().getChildCategories()
		               .remove(childCategory);
		  childCategory.setParentCategory(this);
		  childCategories.add(childCategory);
		}
}
