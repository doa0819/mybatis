package com.ohgiraffers.section01.javaconfig;

import org.apache.ibatis.annotations.Select;

public interface Mapper {

    @Select("SELECT CURDATE() FROM DUAL")
    java.util.Date selectSysdate();    // selectSysdate 라는 것을 사용 하면 위에 있는 것이 나온다.

}
