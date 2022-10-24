package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface BookDao extends BaseMapper<Book> {


//    按id查
    @Select("select * from tbl_book where id = #{id}")
    Book getById(Integer id);

//    按id删除
    @Delete("delete from tbl_book where id = #{id}")
    int delete(Integer id);

//    添加单个数据
    @Insert("insert into tbl_book  (type,name,description) values (#{type},#{name},#{description})")
    int insert(Book book);

//    修改单个数据
    @Update("update tbl_book set type = #{type} and name = #{name} and description = #{description} where id = #{id}")
    int update(Book book);

//    查询所有
    @Select("select * from tbl_book")
    List<Book> getAll();

//    简单分页查询
    @Select("select * from tbl_book limit #{pageBegin},#{pageSize}")
    List<Book> getByPage(@Param("pageBegin") int pageBegin, @Param("pageSize") int pageSize);

}
