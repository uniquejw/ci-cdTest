//package jw.board.board;
//
//import jw.board.board.dto.board.BoardRequestDto;
//import jw.board.board.dto.board.BoardResponseDto;
//import jw.board.board.entity.board.Board;
//import jw.board.board.service.BoardService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.HashMap;
//import java.util.List;
//
//@SpringBootTest
//class BoardApplicationTests {
//
//    @Autowired
//    private BoardService boardService;
//
//    @Test
//    void save() {
//        BoardRequestDto boardSaveDto = new BoardRequestDto();
//
//        boardSaveDto.setTitle("제목입니다.");
//        boardSaveDto.setContent("내용입니다.");
//        boardSaveDto.setRegisterId("작성자");
//
//        Long result = boardService.save(boardSaveDto);
//
//        if(result > 0) {
//            System.out.println("# Success save() ~");
//            findAll();
//            findById(result);
//        }else{
//            System.out.println("# Fail Save() ~");
//        }
//    }
//
//    void findAll() {
//        HashMap<String, Object> list = boardService.findAll(2, 1);
//
//        if(list != null) {
//            System.out.println("# Success findAll() : " + list.toString());
//        }else{
//            System.out.println("# Fail findAll() ~");
//        }
//
//    }
//
//    void findById(Long id) {
//        BoardResponseDto info = boardService.findById(id);
//
//        if (info != null){
//            System.out.println("# Success findById() : " + info.toString());
//            updateBoard(id);
//        }
//    }
//
//    @Test
//    private void updateBoard(Long id) {
//        BoardRequestDto boardRequestDto = new BoardRequestDto();
//
//        boardRequestDto.setId(id);
//        boardRequestDto.setTitle("업데이트 제목");
//        boardRequestDto.setContent("업데이트 내용");
//        boardRequestDto.setRegisterId("작성자");
//
//        int result = boardService.updateBoard(boardRequestDto);
//
//        if(result > 0) {
//            System.out.println("# Success updateBoard() ~");
//        }else{
//            System.out.println("# Fail updateBoard() ~");
//        }
//
//    }
//}
