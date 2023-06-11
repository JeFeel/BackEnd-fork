package site.connectdots.connectdotsprj.member.exception.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import site.connectdots.connectdotsprj.global.exception.custom.CustomErrorCode;
import site.connectdots.connectdotsprj.global.exception.custom.CustomException;
import site.connectdots.connectdotsprj.global.exception.custom.ExceptionResponse;
import site.connectdots.connectdotsprj.member.exception.custom.LoginFailException;

@Slf4j
@RestControllerAdvice
public class MemberLoginHandler {
    @ExceptionHandler(LoginFailException.class)
    public ExceptionResponse<? extends CustomException, CustomErrorCode> loginFailException(LoginFailException e) {
        log.error("LoginFailException {} --- {}", e, e.getErrorCode());
        return new ExceptionResponse<>(e, e.getErrorCode());
    }
}
