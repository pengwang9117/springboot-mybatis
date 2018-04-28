/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author root
 */
@Entity
public class Ship implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;
    
    private String stype;
    private String sname;
    private ArrayList<Equipment> sequipment = new ArrayList<Equipment>();
    

    public int getId() {
        return sid;
    }

    public void setId(int sid) {
        this.sid = sid;
    }

    public String getType() {
        return stype;
    }

    public void setType(String stype) {
        this.stype = stype;
    }

    public String getName() {
        return sname;
    }

    public void setName(String sname) {
        this.sname = sname;
    }

    public ArrayList<Equipment> getEquipment() {
        return sequipment;
    }

    public void setEquipment(ArrayList<Equipment> sequipment) {
        this.sequipment = sequipment;
    }
    
    
}
