/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import model.Doctor;

/**
 *
 * @author Administrator
 */
public class Validation {
    
    //check doctor duplicate
    public boolean checkDuplicate(ArrayList<Doctor> ld, String name, String specialization, int availability) {
        for (Doctor doctor : ld) {
            if (name.equalsIgnoreCase(doctor.getName())
                    && specialization.equalsIgnoreCase(doctor.getSpecialization())
                    && availability == doctor.getAvailability()) {
                return false;
            }
        }
        return true;
    }
    
    public boolean checkCodeExist(ArrayList<Doctor> ld, String code) {
        //check from first to last list doctor
        for (Doctor doctor : ld) {
            if (code.equalsIgnoreCase(doctor.getCode())) {
                return false;
            }
        }
        return true;
    }

    
}
