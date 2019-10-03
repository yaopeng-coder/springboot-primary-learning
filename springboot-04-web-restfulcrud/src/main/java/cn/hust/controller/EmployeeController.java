package cn.hust.controller;

import cn.hust.dao.DepartmentDao;
import cn.hust.dao.EmployeeDao;
import cn.hust.entities.Department;
import cn.hust.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;


    //查询所有员工并返回列表
    @GetMapping("/emps")
     public String findAll(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    //来到添加用户界面的界面
    @GetMapping("/emp")
    public String addEmp(Model model){
         //查出所有部门号
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("deps",departments);
        return "emp/add";
    }

    //添加用户
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        System.out.println(employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    //根据用户id来到用户修改页面
    @GetMapping("/emp/{id}")
    public String updatePage(@PathVariable("id") Integer id,Model model ){
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);
        //查出所有部门号
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("deps",departments);
        return "emp/update";
    }

    //修改员工数据
    @PutMapping("/emp")
    public String updateData(Employee employee){
        System.out.println(employee);
        employeeDao.save(employee);
        return "redirect:/emps";

    }

    //删除员工
    @DeleteMapping("/emp/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("删除测试");
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
