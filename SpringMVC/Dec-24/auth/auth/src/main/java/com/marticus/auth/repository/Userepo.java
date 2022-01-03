package com.marticus.auth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticus.auth.entity.User;


@Repository
public interface Userepo extends JpaRepository<User,Long>  {

	public List<org.springframework.boot.autoconfigure.security.SecurityProperties.User> findByUsernameAndPassword(String username, String password);

}
