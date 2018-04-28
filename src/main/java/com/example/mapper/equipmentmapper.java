/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.mapper;

import com.example.domain.Equipment;
import com.example.domain.Ship;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author root
 */
@Mapper
public interface equipmentmapper {

    Equipment selectequipmentbyname(String ename);
    
    ArrayList<Equipment> selectequipmentbyship(String sname);

    void insertequipment(String etype, String ename, int owner);
}
