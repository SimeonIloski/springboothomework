package com.springboot.homework.springboothomework.repository;

import com.springboot.homework.springboothomework.model.Tweets;
import com.springboot.homework.springboothomework.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetsRepository extends JpaRepository<Tweets,Long> {
}
