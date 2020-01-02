package com.naresh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naresh.model.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Long>{
	
	/*
	 * @Query("SELECT ud FROM UserDetails  ud WHERE ud.name=?l") List<UserDetails>
	 * findUserByName(String name);
	 */

}
