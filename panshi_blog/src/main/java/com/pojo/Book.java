package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 这个是对应数据库的表建的实体类，通过注解可以省略很多写法，只是给你们大致看一下的，
 * 不一定要这样写
 *
 * */
@Data   //包含get，set，toString，equals方法,在projectlombok依赖下，lombok
@AllArgsConstructor         //全参数构造方法
@NoArgsConstructor          //无参构造方法
@TableName(value = "tbl_book")//设置对应的数据库表名称
public class Book {

    @TableId(value = "id",type = IdType.AUTO)//设置id自增属性
    @TableField(value = "id")//对应表中的字段名称
    private Integer id;

    @TableField(value = "type")//表中的字段名称
    private String type;

    @TableField(value = "description")
    private String description;

    @TableField(value = "name")
    private String name;

}
