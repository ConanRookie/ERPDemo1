package com.cskaoyan.service;

import com.cskaoyan.bean.Employee;
import com.cskaoyan.utils.EUDataGridResult;

/**
 * @author WangGuoming
 * created on 2018/12/8
 */
public interface EmployeeService {
    EUDataGridResult findAllEmployees(String currentPageNum, String perPageNum);

    int insertOneEmployee(Employee employee);

    boolean isEmployeeExistById(Employee employee);

    boolean isEmployeeExistByIdCode(Employee employee);

    boolean deleteEmployeesByIds(String[] ids);

    boolean isOtherEmployeeExistByIdCode(Employee employee);

    int updateOneEmployee(Employee employee);

    EUDataGridResult findOneEmployeeById(String currentPageNum, String perPageNum, String employeeId);

    EUDataGridResult findEmployeesByNames(String currentPageNum, String perPageNum, String employeeName);

    EUDataGridResult findEmployeesByDepartments(String currentPageNum, String perPageNum, String departmentName);
}
