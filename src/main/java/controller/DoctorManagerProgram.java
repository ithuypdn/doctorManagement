/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Doctor;
import view.Menu;
import repository.DoctorRepository;
/**
 *
 * @author Administrator
 */
public class DoctorManagerProgram extends Menu<String>{
    
    static String[] mc = {"Add Doctor", "Update Doctor", "Delete Doctor","Search Doctor", "Exit"};
    ArrayList<Doctor> ld;
    DoctorRepository program;
    
    public DoctorManagerProgram() {
        super("       Doctor Management", mc);
        ld = new ArrayList<>();
        program = new DoctorRepository();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1:
                program.addDoctor(ld);
                break;
            case 2:
                program.updateDoctor(ld);
                break;
            case 3:
                program.deleteDoctor(ld);
                break;
            case 4:
                program.searchDoctor(ld);
                break;
            case 5:
                System.exit(0);
        }
    }
}
