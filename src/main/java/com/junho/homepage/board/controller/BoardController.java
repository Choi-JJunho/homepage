package com.junho.homepage.board.controller;

import com.junho.annotation.RoleAdmin;
import com.junho.homepage.board.dto.request.CreateBoard;
import com.junho.homepage.board.dto.response.BoardResponse;
import com.junho.homepage.board.service.BoardService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "게시판 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/list")
    public ResponseEntity<List<BoardResponse>> list() {

        return new ResponseEntity<>(boardService.getBoards(), HttpStatus.OK);
    }

    @RoleAdmin
    @PostMapping("/post")
    public ResponseEntity<Boolean> post(@RequestBody CreateBoard request) {

        return new ResponseEntity<>(boardService.createBoard(request), HttpStatus.OK);
    }

    @RoleAdmin
    @PutMapping("/{id}")
    public ResponseEntity<BoardResponse> update(@PathVariable Long id, @RequestBody CreateBoard request) {

        return new ResponseEntity<>(boardService.updateBoard(id, request), HttpStatus.OK);
    }

    @RoleAdmin
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {

        return new ResponseEntity<>(boardService.deleteBoard(id), HttpStatus.OK);
    }
}
