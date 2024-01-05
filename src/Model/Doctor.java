/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author hoang
 */
public class Doctor implements Serializable{

    private String code;
    private String name;
    private String specialization;
    private int availability;
   
    //Constructor
    public Doctor() {
    }

    public Doctor(String code, String name, String specialization, int availability) {
        this.code = code;
        this.name = name;
        this.specialization = specialization;
        this.availability = availability;
    }

    //Setter and Getter
    public String getCode() {
        if (code == null || code.trim().isEmpty()) {
            return "Invalid";
        }
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
    
        @Override
    public String toString() {
        return "code= " + code + "\n"
                + "name= " + name + "\n"
                + "specialization= " + specialization + "\n"
                + "availability= " + availability + "\n";
    }
    
    //Scanner and List for save the data

    
}
        