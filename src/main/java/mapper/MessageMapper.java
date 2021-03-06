package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pojo.Message;
import pojo.Message;
@Mapper
public interface MessageMapper {

    int deleteByPrimaryKey(String messageid);


    int insert(Message record);


    Message selectByPrimaryKey(String messageid);


    List<Message> selectAll();


    int updateByPrimaryKey(Message record);

    List<Message> selectByUserId(String userid);
}