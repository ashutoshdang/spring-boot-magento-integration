package com.github.chen0040.springmegento.repositories;


import com.github.chen0040.springmegento.models.SpringUserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by xschen on 16/10/2016.
 */
@Repository
public interface SpringUserEntityRepository extends CrudRepository<SpringUserEntity, Long> {
   List<SpringUserEntity> findByUsername(String username);
   Page<SpringUserEntity> findAll(Pageable pageable);
   List<SpringUserEntity> findByEmail(String email);
}
