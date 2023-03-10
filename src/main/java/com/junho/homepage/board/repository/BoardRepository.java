package com.junho.homepage.board.repository;

import com.junho.homepage.board.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
public interface BoardRepository extends JpaRepository<Board, Long> {
    Optional<Board> findByTitle(String name);
}
