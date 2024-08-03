package com.houseoffourleaf.ecommerce.entity;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.Generated;

import java.time.LocalDateTime;

@Data
@Generated
public class Audit {
	
	@Column(name="insert_user")
	private String insertUser;
	
	@Column(name="insert_timestamp")
	private LocalDateTime insertTimestamp;
	
	@Column(name="update_user")
	private String updateUser;
	
	@Column(name="update_timestamp")
	private LocalDateTime updateTimestamp;
}
