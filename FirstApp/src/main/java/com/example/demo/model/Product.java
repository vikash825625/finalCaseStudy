package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Arrays;

 
@Entity
@Table(name= "PRODUCT", schema = "mobileapplication")
public class Product {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
	private int id;
	
	@Column(name="productId")
		private int productId;
	
	@Column(name="categoryId")
	    private int categoryId;
	
	@Column(name="brand")
	    private String brand;
//	@Column(name="brandImage")
//	   	private byte[] brandImage;
public Product() {
	
}
			public Product(int productId, int categoryId, String brand) {
			super();
			this.productId = productId;
			this.categoryId = categoryId;
			this.brand = brand;
//			this.brandImage = brandImage;
		}

			public int getProductId() {
				return productId;
			}

			public void setProductId(int productId) {
				this.productId = productId;
			}

			public int getCategoryId() {
				return categoryId;
			}

			public void setCategoryId(int categoryId) {
				this.categoryId = categoryId;
			}

			public String getBrand() {
				return brand;
			}

			public void setBrand(String brand) {
				this.brand = brand;
			}

//			public byte[] getBrandImage() {
//				return brandImage;
//			}
//
//			public void setBrandImage(byte[] brandImage) {
//				this.brandImage = brandImage;
//			}

//			@Override
//			public String toString() {
//				return "Product [productId=" + productId + ", categoryId=" + categoryId + ", brand=" + brand
//						+ ", brandImage=" + Arrays.toString(brandImage) + "]";
//			}
	     
	   
	 	 
	
}
