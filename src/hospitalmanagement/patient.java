/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

/**
 *
 * @author cb3ss
 */
public class patient extends HumanClass {
     private
           
            String disease ;
                  int P_id;  
    public float due;
    public int docIndex;
    public patient()
    {
        
    }
    public patient(String name, int age, String diseaseName, int id)
    {
        this.name = name;
        this.age = age;
        disease = diseaseName;
        this.P_id = id;
    }
    public void patientGet()
    {
        
    }
    
     public
                         
                           
                void set_name(String n){
                    name=n;
                }   
                
                void set_id(int id){
                    P_id=id;
                }
                void set_disease(String n){
                    disease=n;
                }   
                void set_age(int age1){
                    age=age1;
                }
                
            String show_name(){
                    return name;
            }
             int show_id(){
                    return P_id;
            }
            public String show_disease(){
                    return disease;
            }
           int show_age(){
                    return age;
            }
        
           
    
    
}
