package com.app.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="user_product_map")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserProductMap {
	
	
	@Column(name = "user_id")
	private String userId;
	@Id
	@Column(name = "product_id")
	private String productId;

}
