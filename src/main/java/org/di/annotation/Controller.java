package org.di.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE}) // 클래스나 인터페이스, 이넘에 붙을 수 있음
@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
}
