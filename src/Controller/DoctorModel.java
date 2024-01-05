/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Doctor;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.function.Predicate;
import javax.swing.JOptionPane;

/**
 *
 * @author hoang
 */
public class DoctorModel {

    public static ArrayList<Doctor> listDoctor;
    private String choice;
    File file = new File("doctor.dat");

    public DoctorModel() {
        this.listDoctor = new ArrayList<>();
        this.readFromFile(file);
    }

    //Setter and Getter
    public static ArrayList<Doctor> getListDoctor() {
        return listDoctor;
    }

    public void setListDoctor(ArrayList<Doctor> listDoctor) {
        this.listDoctor = listDoctor;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    //Methods doing with Doctor
    public void addDoctoModel(Doctor doctor) {
        listDoctor.add(doctor);
//        System.out.println(listDoctor.toString());
        this.exportToFile(file);
        JOptionPane.showMessageDialog(null, "Doctor add successful");

    }

    public void updateDoctorModel(Doctor doctor) {
        listDoctor.add(doctor);
        this.exportToFile(file);
        JOptionPane.showMessageDialog(null, "Doctor update successful");

    }

    public void deleteDoctorModel() {
        this.exportToFile(file);
    }

    public void saveToFile() {
        this.exportToFile(file);
        JOptionPane.showMessageDialog(null, "Save successful");
    }

    //METHODS SUPPORT 
    public void printDoctor() {
        System.out.println(listDoctor.toString());
    }

    //Take out doctor when enter a code 
    public Doctor getDoctorByCode(String code) {
        for (Doctor d : listDoctor) {
            if (d.getCode().equals(code)) {
                return d;
            }
        }
        return null;
    }

    //Check code is exist or not
    public boolean codeExists(String code) {
        for (Doctor d : listDoctor) {
            if (d.getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }

    //Check code is exist with predicate
    public boolean codeExistsPredicate(String code) {
        Predicate<Doctor> checkCode = d -> d.getCode().equalsIgnoreCase(code);
        for (Doctor d : listDoctor) {
            if (checkCode.test(d)) {
                return true;
            }
        }
        return false;
    }

    //DOING WITH FILE
    public void exportToFile(File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            for (Doctor dt : listDoctor) {
                oos.writeObject(dt);
            }

            oos.flush();
            oos.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void readFromFile(File file) {
        try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof Doctor) {
                        Doctor dt = (Doctor) obj;
                        this.listDoctor.add(dt);
                    } else {
                        break;
                    }
                } catch (EOFException eof) {
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
