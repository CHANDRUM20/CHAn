package com.online.picture.management.client.repository;

import org.springframework.data.repository.CrudRepository;

import com.online.picture.management.client.models.UserModel;

public interface UserModelRepo extends CrudRepository<UserModel, String> {

}
