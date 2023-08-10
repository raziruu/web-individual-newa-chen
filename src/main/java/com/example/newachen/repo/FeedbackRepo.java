package com.example.newachen.repo;

import com.example.newachen.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer> {

    Optional<Feedback> findFeedbackByEmail(String email);
}
