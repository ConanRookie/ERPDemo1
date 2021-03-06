package com.cskaoyan.service.impl;

import com.cskaoyan.bean.DeviceFault;
import com.cskaoyan.utils.JsonFindRet;
import com.cskaoyan.mapper.DeviceFaultMapper;
import com.cskaoyan.service.DeviceFaultService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;

@Service
public class DeviceFaultServiceImpl implements DeviceFaultService {

    @Autowired
    DeviceFaultMapper mapper;

    HashMap<String,String> result =new HashMap<>();
    public HashMap<String, String> getResult() {
        return result;
    }
    public void setResult(HashMap<String, String> result) {
        this.result = result;
    }

    //获得清单
    @Override
    public JsonFindRet getList(int page, int rows) {
        DeviceFault deviceFault = new DeviceFault();
        //分页处理
        PageHelper.startPage(page, rows);
        //查询列表
        List<DeviceFault> list = mapper.selectAll(deviceFault);
        //创建一个返回值对象
        JsonFindRet result = new JsonFindRet();
        //几条具体信息 放入result
        result.setRows(list);
        //取记录信息总条数 放入result
        PageInfo<DeviceFault> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }

    //查找全部不分页(get_data)
    @Override
    public List<DeviceFault> findAll() {
        DeviceFault deviceFault = new DeviceFault();
        List<DeviceFault> list = mapper.selectAll(deviceFault);
        return list;
    }


    //新增
    @Override
    public HashMap insert(@Valid DeviceFault deviceFault) {
        int i = mapper.insert(deviceFault);
        //如果成功
        if(i==1){
            result.put("status","200");
            result.put("msg","OK");
            result.put("data",null);
        }else{
            result.put("status","0");
            result.put("msg","新增失败,请检查！");
            result.put("data",null);
        }
        return result;
    }

    //根据id查(单查)
    @Override
    public DeviceFault selectById(String deviceFaultId) {
        DeviceFault deviceFault = mapper.selectById(deviceFaultId);
        return deviceFault;
    }

    //编辑
    @Override
    public HashMap update(DeviceFault deviceFault) {
        int i = mapper.update(deviceFault);
        //如果成功
        if(i==1){
            result.put("status","200");
            result.put("msg","OK");
            result.put("data",null);
        }else{
            result.put("status","0");
            result.put("msg","修改失败,请检查！");
            result.put("data",null);
        }
        return result;
    }

    //批量删除(也可以单删)
    @Override
    public HashMap deleteBatch(String[] deviceFaultIds) {
        int i = mapper.deleteBatch(deviceFaultIds);
        //如果成功
        if(i>0){
            result.put("status","200");
            result.put("msg","OK");
            result.put("data",null);
        }else{
            result.put("status","0");
            result.put("msg","删除失败,请检查，或者减少删除对象！");
            result.put("data",null);
        }
        return result;
    }

    //二例查询
    @Override
    public JsonFindRet searchDeviceFaultByDeviceFaultId(int page, int rows, String deviceFaultId) {
        //分页处理
        PageHelper.startPage(page, rows);
        //查询列表
        List<DeviceFault> list = mapper.searchDeviceFaultByDeviceFaultId(deviceFaultId);
        //创建一个返回值对象
        JsonFindRet result = new JsonFindRet();
        //几条具体信息 放入result
        result.setRows(list);
        //取记录信息总条数 放入result
        PageInfo<DeviceFault> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }

    @Override
    public JsonFindRet searchDeviceFaultByDeviceName(int page, int rows, String deviceName) {
        //分页处理
        PageHelper.startPage(page, rows);
        //查询列表
        List<DeviceFault> list = mapper.searchDeviceFaultByDeviceName(deviceName);
        //创建一个返回值对象
        JsonFindRet result = new JsonFindRet();
        //几条具体信息 放入result
        result.setRows(list);
        //取记录信息总条数 放入result
        PageInfo<DeviceFault> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }
    //修改备注
    @Override
    public HashMap updateNote(DeviceFault deviceFault) {
        int i = mapper.updateNote(deviceFault);
        //如果成功
        if(i==1){
            result.put("status","200");
            result.put("msg","OK");
            result.put("data",null);
        }else{
            result.put("status","0");
            result.put("msg","备注修改失败,请检查！");
            result.put("data",null);
        }
        return result;
    }
}
