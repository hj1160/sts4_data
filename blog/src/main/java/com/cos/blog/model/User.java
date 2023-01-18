package com.cos.blog.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder//빌더 패턴
//ORM -> Java(다른언어) Object -> 테이블 맹핑해주는 기술
@Entity // User 클래스가 MySQL 에 테이블이 생성
//@DynamicInsert //insert 할 때 null 필드 제외
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length=30, unique = true)
	private String username;
	
	@Column(nullable = false, length=100)
	private String password;
	
	@Column(nullable = false, length=50) 
	private String email;
	
	//DB는 RoleType이라는 것이 없다.
	@Enumerated(EnumType.STRING)
	private RoleType role; //Enum을 쓰는게 좋다. // ADMIN, USER 로 제한
//	private STring role;
	
	@CreationTimestamp
	private Timestamp createDate;

}
