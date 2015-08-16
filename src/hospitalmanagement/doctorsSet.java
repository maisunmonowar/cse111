/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author RohanZaman
 */
public class doctorsSet extends HumanClass
{

    int patientIndex = 0;
    public String expertise;
    private static int doctorID;
    public double wallet;
    patient []patient = new patient[10];
    int i=0;
    public doctorsSet ()
    {
        name = "name";
        expertise = "expertise";
        doctorID = 1111;
        wallet = 0.0;
    }
public int show_ID()
{
    return doctorID;
}
    public doctorsSet (String name, String expertise, int ID)
    {
                doctorID = ID++;
        this.expertise = expertise;
        this.name = name;
    }
    public void newPatient(patient p)
    {
        patient[i] = p;
    }
    public String printPatientName(Component frame){//take in frame???
        String s = "";
        try{
            for(int c =0; c<patient.length; c++){
                if(s.equals("")){
                    s = patient[c].name+"\n";
                }
                else
                    s+= patient[c].name+"\n";
            }
        } catch(NullPointerException e){
//            JOptionPane.showMessageDialog(frame, "No patients assigned.");
        }
        return s;
    }

//        public void setDoctorID (String x)
//        {
//            doctorID = x;
//        }
//        
//        public void setWallet (double w)
//        {
//            wallet = w;   
//        }
//        
//        public String getDoctorID ()
//        {
//            return doctorID;
//        }
//        
//        public double getWallet()
//        {
//            return wallet;
//        }   

//    public void printInfo(String name, String expertise, String doctorID, double wallet)
//                
//        {
//            System.out.println("Hello. I am " + name);
//            System.out.println (expertise);
//            System.out.println("My ID is " + doctorID);
//        }

// Before releasing any patient, we have to add them.

//    public void addPatient(String id)
//    {
//        patientList[patientIndex]=id;
//        patientIndex++; // adding patient  
//        
//        String [] temp = new String[patientList.length+1];
//        
//        for (int i=0; i<patientList.length;i++)
//        {
//            temp[i]=patientList[i];
//        }
//        
//        patientList = temp;
//        
//        temp = null;
//}

// searching for which patient got released

//    public int search(String id)
//    {
//        boolean flag = false;
//        int i=0;
//        
//        for (i=0; i<patientList.length; i++)
//        {
//            if (patientList[i].equals(id))
//            {
//                flag = true;
//                break;
//            }        
//        }
//        
//        if (flag==true)
//        {
//            return i;
//        }
//        
//        else
//        {
//        return -1;
//        }
//    }

// finally who got released, we have to remove him from patientIndex

//    public void removePatient(String id)
//    {
//        int index = search(id);
//        
//        if (index != -1)
//        {
//            for (int i = index; i<patientList.length; i++)
//            {
//                patientList[i]=patientList[i+1];
//            }
//            
//            patientList[patientList.length-1]=null;
//        }
//        
//        String [] temp = new String[patientList.length-1];
//        
//        for (int i=0; i<temp.length;i++)
//        {
//            temp[i]=patientList[i];
//        }
//        
//        patientList = temp;
//        
//        temp = null;   
//        
//        patientIndex--; // one patient has been removed so we have to remove him/her from the list.  
//    }
}

