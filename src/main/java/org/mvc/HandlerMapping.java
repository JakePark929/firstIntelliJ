package org.mvc;

public interface HandlerMapping {
    Object findHandler(HandlerKey handlerKey);
}
