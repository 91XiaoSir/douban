package service;

import pojo.UserBook;

import java.util.List;

public interface UserBookService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserBook record);

    UserBook selectByPrimaryKey(Integer id);

    List<UserBook> selectAll();

    int updateByPrimaryKey(UserBook record);


    List<UserBook> selectByUserId(String uid);
}
