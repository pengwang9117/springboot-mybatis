/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.domain.Ship;
import com.example.mapper.shipmapper;
import java.util.ArrayList;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author root
 */
@RestController
public class shipcontroller {

    private final shipmapper sm;

    public shipcontroller(shipmapper sm) {
        this.sm = sm;
    }

    @RequestMapping("/createship")
    public String createship(String stype, String sname) {
        sm.createship(stype, sname);
        return "success";
    }

    @RequestMapping("/searchship")
    public Ship searchship(String sname) {
        return sm.selectshipbyname(sname);
    }
    
    @RequestMapping("/getequipship")
    public ArrayList<Ship> getequipship(String ename) {
        return sm.selectshipbyequipment(ename);
    }
}
