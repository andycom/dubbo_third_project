package com.fancv.service;

import com.fancv.api.CarDTO;
import com.fancv.api.MyOutService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.ArrayList;
import java.util.List;

/**
 * third service Car
 */
@DubboService(document = "not servie http://12312.com",version = "1.0.0",weight = 2)
class CarService implements MyOutService {
    public CarDTO getCarInfo(String userName) {

        System.out.println("third service working");
        CarDTO r = new CarDTO("HQ", 51, "100W");
        List<String> users = new ArrayList<String>(6);
        users.add("A");
        users.add("B");
        users.add("china");
        r.setUsers(users);
        System.out.println("end return r");
        return r;
    }
}
