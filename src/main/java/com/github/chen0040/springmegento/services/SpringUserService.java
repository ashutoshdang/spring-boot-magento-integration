package com.github.chen0040.springmegento.services;


import com.github.chen0040.springmegento.models.SpringUser;
import com.github.chen0040.springmegento.models.SpringUserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;


/**
 * Created by xschen on 16/10/2016.
 */
public interface SpringUserService {
   boolean isUserAuthenticated(String username, String password);

   Optional<SpringUser> findUserByUsername(String name);
   Optional<SpringUser> findUserById(long userId);
   List<SpringUser> findUserByEmail(String email);

   SpringUser save(SpringUser user);


   List<SpringUser> findAll();
   Page<SpringUserEntity> findByPage(int pageIndex, int pageSize);
   Page<SpringUserEntity> findByPage(int pageIndex, int pageSize, Sort sort);

   long countUsers();
   long countPages(int pageSize);

   SpringUser deleteUserById(long userId);


}
