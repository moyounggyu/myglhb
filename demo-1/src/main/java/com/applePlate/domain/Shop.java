package com.applePlate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "SHOP")
@Data
public class Shop {
	
	//아이디
	@Id
	@GeneratedValue
	@Column(name = "SHOP_ID")
	private int shopId;

	//이름
	@Column(name = "SHOP_NAME")
	private String shopName;
	
	//전화번호
	@Column(name = "SHOP_TEL_NO")
	private String shopTelNo;

	//주소
	@Column(name = "SHOP_ADR")
	private String shopAdr;

	//홈페이지
	@Column(name = "SHOP_HOME_PAGE")
	private String shopHomePage;

	//영업 오픈 시간
	@Column(name = "SHOP_OPEN_TIME")
	private String shopOpenTime;

	//영업종료 시간
	@Column(name = "SHOP_CLOSE_TIME")
	private String shopCloseTime;

	//주차가능여부
	@Column(name = "SHOP_PARKING_AVAILABILITY")
	private String shopParkingAvailability;
	
	//음식 종류
	@Column(name = "SHOP_FOOD_TYPE")
	private String shopFoodType;

	//지역
	@Column(name = "SHOP_AREA")
	private String shopArea;
	
	
	
	
	

	
	
}
