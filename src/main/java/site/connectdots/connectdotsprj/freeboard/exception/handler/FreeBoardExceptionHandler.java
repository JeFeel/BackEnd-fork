package site.connectdots.connectdotsprj.freeboard.exception.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import site.connectdots.connectdotsprj.freeboard.exception.custom.LikeAndHateException;
import site.connectdots.connectdotsprj.global.exception.custom.ExceptionResponse;
import site.connectdots.connectdotsprj.freeboard.exception.custom.NotFoundFreeBoardException;
import site.connectdots.connectdotsprj.freeboard.exception.custom.NotFoundMemberException;
import site.connectdots.connectdotsprj.global.exception.custom.CustomException;

@Slf4j
@RestControllerAdvice
public class FreeBoardExceptionHandler {

    @ExceptionHandler(NotFoundFreeBoardException.class)
    public ResponseEntity<ExceptionResponse<? extends CustomException, Long>> notFoundFreeBoardException(NotFoundFreeBoardException e) {
        log.error("NotFoundFreeBoardException : \terrorCode : {}\tmessage : {}\tfreeBoardIdx : {}", e.getErrorCode(), e.getErrorCode().getMessage(), e.getFreeBoardIdx());
        return ResponseEntity.badRequest().body(new ExceptionResponse<>(e, e.getFreeBoardIdx()));
    }

    @ExceptionHandler(NotFoundMemberException.class)
    public ResponseEntity<ExceptionResponse<? extends CustomException, Long>> notFoundMemberException(NotFoundMemberException e) {
        log.error("NotFoundMemberException : \terrorCode : {}\tmessage : {}\tfreeBoardIdx : {}", e.getErrorCode(), e.getErrorCode().getMessage(), e.getMemberIdx());
        return ResponseEntity.badRequest().body(new ExceptionResponse<>(e, e.getMemberIdx()));
    }

    @ExceptionHandler(LikeAndHateException.class)
    public ResponseEntity<ExceptionResponse<? extends CustomException, String>> likeAndHateException(LikeAndHateException e) {
        log.error("LikeAndHateException : \terrorCode : {}\tmessage : {}", e, e.getMessage());
        return ResponseEntity.badRequest().body(new ExceptionResponse<>(e, e.getMessage()));
    }
}
