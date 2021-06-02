package util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: book-java-for-demo
 * @description: 蜀海token测试类
 * @author: kmmshmily--cuiyong
 * @date: 2020-11-13 15:55
 **/
public class ShscTokenTest {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void main(String[] args) throws Exception{
//        List<String> roleList = new ArrayList<>();
//        String str = "[{\"businessCityName\":\"中国\",\"emplid\":\"10029796\",\"businessOrgName\":\"产品运营部\",\"businessPosName\":\"蜀海产品运营\",\"businessOrgId\":\"CPYYB\",\"businessPosId\":\"8888\",\"topic\":\"SHXXB\",\"businessCityId\":\"ZB01\"},{\"businessCityName\":\"郑州\",\"emplid\":\"10029796\",\"businessOrgName\":\"郑州采购部\",\"businessPosName\":\"SAP刷价\",\"businessOrgId\":\"ZZCG\",\"businessPosId\":\"GAIACGSJSH\",\"topic\":\"SC\",\"businessCityId\":\"400001\"},{\"businessCityName\":\"中国\",\"emplid\":\"10029796\",\"businessOrgName\":\"产品运营部\",\"businessPosName\":\"点检管理员\",\"businessOrgId\":\"CPYYB\",\"businessPosId\":\"DJGLY\",\"topic\":\"SHXXB\",\"businessCityId\":\"ZB01\"},{\"businessCityName\":\"郑州\",\"emplid\":\"10029796\",\"businessOrgName\":\"郑州采购部\",\"businessPosName\":\"采购专员\",\"businessOrgId\":\"ZZCG\",\"businessPosId\":\"CGZY\",\"topic\":\"SC\",\"businessCityId\":\"400001\"},{\"businessCityName\":\"西安\",\"emplid\":\"10029796\",\"businessOrgName\":\"信息产品研发中心（西安）\",\"businessPosName\":\"GAIA采购刷价\",\"businessOrgId\":\"107408\",\"businessPosId\":\"GAIACGSJ\",\"topic\":\"100001\",\"businessCityId\":\"400002\"},{\"businessCityName\":\"西安\",\"emplid\":\"10029796\",\"businessOrgName\":\"西安采购部\",\"businessPosName\":\"采购专员\",\"businessOrgId\":\"XACG\",\"businessPosId\":\"CGZY\",\"topic\":\"SC\",\"businessCityId\":\"400002\"},{\"businessCityName\":\"青岛\",\"emplid\":\"10029796\",\"businessOrgName\":\"青岛采购部\",\"businessPosName\":\"采购专员\",\"businessOrgId\":\"QDCG\",\"businessPosId\":\"CGZY\",\"topic\":\"SC\",\"businessCityId\":\"100003\"}]";
//        JSONArray jsonArray = JSONArray.parseArray(str);
//        if (jsonArray != null) {
//            for (Object obj : jsonArray) {
//                JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(obj));
//                roleList.add(jsonObject.getString("businessPosId"));
//            }
//        }
//        if (roleList.contains("8888")) {
//            System.out.println("*************");
//        }

//        Date date = new Date();
//        date.setYear(122);
//        System.out.println(date);
//        System.out.println(date.getTime());

        List<String> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(i+"");
        }
        List<String> list2 = list.stream().filter(e -> !"5".equals(e)).map(t->t+1).collect(Collectors.toList());
        System.out.println(list2);
//        list.forEach(e-> System.out.println(e));
//        List<String> list2 = new ArrayList<>();
//        list.stream().filter(e -> !"5".equals(e)).forEach(e->list2.add(e));
//        System.out.println( list2);
//        list.stream().forEach(e ->{
//            System.out.println(e);
//        });
//        try {
//            list.stream().forEach(e ->{
//                if("2".equals(e)){
//                    throw new RuntimeException("发生业务异常");
//                }
//            });
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

    }
}   
