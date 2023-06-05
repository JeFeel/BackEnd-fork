package site.connectdots.connectdotsprj.freeboard.exception.custom;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum FreeBoardErrorCode {
    /**
     * 404 - NOT_FOUND
     */
    FREE_BOARD_NOT_FOUND(HttpStatus.NOT_FOUND, "존재하지 않는 게시물입니다.");
    private final HttpStatus httpStatus;
    private final String message;
}