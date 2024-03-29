package com.ohgiraffers.section02.javaconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section02.javaconfig.Template.getSqlSession;

public class MenuService {

    private MenuMapper menuMapper;    // 인터페이스 직접적으로 객체 생성 불가


    public List<MenuDTO> selectAllMenu() {

        SqlSession sqlSession = getSqlSession();

        menuMapper = sqlSession.getMapper(MenuMapper.class);    //xml / java 차이점

        List<MenuDTO>menuList = menuMapper.selectAllMenu();

        sqlSession.close();

        return menuList;

    }

    public MenuDTO selectMenuByCode(int code) {

        SqlSession sqlSession = getSqlSession();

        /* 필기. sqlSession 은 요청 단위로 생성해야 하기 떄문에 getMapper 로 메소드 스코프로 매번 불어와야 한다. */
        menuMapper = sqlSession.getMapper(MenuMapper.class);

        MenuDTO menu = menuMapper.selectMenuByCode(code);

        sqlSession.close();

        return menu;
    }

    public boolean registMenu(MenuDTO menu) {

        SqlSession sqlSession = getSqlSession();

        menuMapper =sqlSession.getMapper(MenuMapper.class);

        int result = menuMapper.insertMenu(menu);

        if (result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean editMenu(MenuDTO menu) {

        SqlSession sqlSession = getSqlSession();

        menuMapper =sqlSession.getMapper(MenuMapper.class);

        int result = menuMapper.updateMenu(menu);

        if (result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;

    }
}
