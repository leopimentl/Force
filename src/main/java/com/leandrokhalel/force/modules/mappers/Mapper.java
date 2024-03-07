package com.leandrokhalel.force.modules.mappers;

public interface Mapper<T, U> {

    U map(T t);
}
