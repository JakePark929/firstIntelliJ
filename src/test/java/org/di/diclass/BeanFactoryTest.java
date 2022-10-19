package org.di.diclass;

import org.di.annotation.Controller;
import org.di.annotation.Service;
import org.di.controller.UserController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class BeanFactoryTest {
    private Reflections reflections;
    private BeanFactory beanFactory;

    @BeforeEach // test 메소드가 호출되기 전에 미리 호출됨
    void setUp() {
        reflections = new Reflections("org.di");
        // UserController, UserService
        Set<Class<?>> preInstantiatedClazz = getTypeAnnotatedWith(Controller.class, Service.class);
        beanFactory = new BeanFactory(preInstantiatedClazz);
    }

    private Set<Class<?>> getTypeAnnotatedWith(Class<? extends Annotation>... annotations) {
        Set<Class<?>> beans = new HashSet<>();
        for (Class<? extends Annotation> annotation : annotations) {
            beans.addAll(reflections.getTypesAnnotatedWith(annotation));
        }
        return beans;
    }

    @Test
    void diTest() {
        UserController userController = beanFactory.getBean(UserController.class);

        assertThat(userController).isNotNull();
        assertThat(userController.getUserService()).isNotNull();
    }
}