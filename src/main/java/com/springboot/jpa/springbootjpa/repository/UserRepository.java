package com.springboot.jpa.springbootjpa.repository;

import com.springboot.jpa.springbootjpa.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author: shihongwei
 * @Created: 21:22 2018/5/20
 * @Modified
 * @Description:
 */
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface UserRepository extends CrudRepository<User,Long> {

}
