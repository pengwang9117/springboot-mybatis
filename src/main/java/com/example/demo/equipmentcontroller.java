/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.domain.Equipment;
import com.example.domain.Ship;
import com.example.mapper.equipmentmapper;
import com.example.mapper.shipmapper;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author root
 */
@RestController
public class equipmentcontroller {

    private final equipmentmapper em;
    private final shipmapper sm;

    public equipmentcontroller(equipmentmapper em, shipmapper sm) {
        this.em = em;
        this.sm = sm;
    }

    @RequestMapping("/insertequipment")
    public String insertequipment(String etype, String ename, String sname) {
        Ship s = sm.selectshipbyname(sname);
        em.insertequipment(etype, ename, s.getId());
        return "success";
    }

    @RequestMapping("/searchequipment")
    public Equipment searchequipment(String ename) {
        return em.selectequipmentbyname(ename);
    }
    
    @RequestMapping("/getshipequip")
    public ArrayList<Equipment> getshipequip(String sname) {
        return em.selectequipmentbyship(sname);
    }
}
