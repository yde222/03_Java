package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.ArrayList;

public class ResultPrinter {
    public void printAllList(ArrayList<BoardDTO> list) {
        if (list == null || list.isEmpty()) {
            // list에 출력할 내용이 없으면 “게시물이 없습니다” 출력
            System.out.println("게시물이 없습니다");
        } else {
            // list에 출력할 내용이 있으면 출력
            for (BoardDTO boardDTO : list) {
                System.out.println(boardDTO);
            }
        }
    }

    public void printBoard(BoardDTO b) {
        // 전달받은 내용 출력
        System.out.println(b);
    }

    public void errorPage(String msg) {
        switch (msg) {
            case "insertBoard":
                System.out.println("게시물 등록 실패");
                break;
            case "selectOne":
                System.out.println("조회된 글이 없습니다.");
                break;
            case "updateTitle":
                System.out.println("게시물 제목 수정 실패!");
                break;
            case "updateContent":
                System.out.println("게시글 내용 수정 실패!");
                break;
            case "deleteBoard":
                System.out.println("게시글 삭제 실패!");
                break;
            default:
                System.out.println("메세지 없음!");
                break;
        }
    }

    public void successPage(String msg) {
        switch (msg) {
            case "insertBoard":
                System.out.println("게시글 등록 성공 !");
                break;
            case "updateTitle":
                System.out.println("게시글 제목 수정 성공 !");
                break;
            case "updateContent":
                System.out.println("게시글 내용 수정 성공 !");
                break;
            case "deleteBoard":
                System.out.println("게시글 삭제 성공 !");
                break;
            default:
                System.out.println("메세지 없음!");
                break;
        }
    }

    public void noSearchResult() {
        // “검색 결과가 없습니다”출력
        System.out.println("검색 결과가 없습니다");
    }

}
