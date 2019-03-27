package com.applePlate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity(name = "MENU")
@Data
public class Menu {

	//아이디
		@Id
		@GeneratedValue
		@Column(name = "MENU_ID")
		private int menuId;

		//이름
		@Column(name = "MENU_NAME")
		private String menuName;
		
		//전화번호
		@ManyToOne
		@JoinColumn(name = "SHOP_ID")
		private String shopId;

		
		
		
}
