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
public interface shipmapper {

    Ship selectshipbyname(String sname);
    
    ArrayList<Ship> selectshipbyequipment(String ename);

    void createship(String stype, String sname);
}
