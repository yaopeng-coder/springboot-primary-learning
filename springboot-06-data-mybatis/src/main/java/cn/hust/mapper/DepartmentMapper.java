package cn.hust.mapper;


import cn.hust.bean.Department;
import org.apache.ibatis.annotations.*;

//指定这是一个操作数据库的mapper
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true ,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{department_name})")
    public int insertDept(Department department);

    @Update("update department set department_name=#{department_name} where id=#{id}")
    public int updateDept(Department department);
}
