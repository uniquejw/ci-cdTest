package jw.board.board.dto.board;

import jw.board.board.entity.board.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BoardRequestDto {
    private Long id;
    private String title;
    private String content;
    private String registerId;

    public Board toEntity(){
        return Board.builder()
                .title(title)
                .content(content)
                .registerId(registerId)
                .build();
    }
}
