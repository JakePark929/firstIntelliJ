package org.mvc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE}) // 클래스, 인터페이스, 이넘선언 등 클래스에 붙이기 위해 지정
@Retention(RetentionPolicy.RUNTIME) // 유지기간
public @interface Controller {
}
