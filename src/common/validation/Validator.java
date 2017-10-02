/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.validation;

import java.util.Calendar;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 *
 * @author BitlabSolutions
 */
public class Validator {
    public  static boolean isValidEmailAddress(String email) {
   boolean result = true;
   try {
      InternetAddress emailAddr = new InternetAddress(email);
      emailAddr.validate();
   } catch (AddressException ex) {
      result = false;
   }
   return result;
}
    public boolean isValidNIC(String NIC){
        if(NIC.equals("")){return false;}
        if(NIC.length()==10){
            String[] arr=NIC.split("");
            for(int i=0;i<9;i++){
                try{ Integer.parseInt(arr[i]);}
                catch(NumberFormatException e){return false;}
                
            }
            char[] chars=arr[9].toCharArray();
            if(Character.isLetter(chars[0])){return true;}
            return false;
        }
        return false;
        
    }
    
    
    public boolean isValidTelNO(String telno){
        if(telno.equals("")){return true;}
        if(telno.length()==10){
            try{Integer.parseInt(telno);}
            catch(NumberFormatException e){return false;}
            return true;
        }
        return false;
    }
    
    public boolean isValidDate(java.util.Date date){
        
        if(date!=null){
            if(date.after(Calendar.getInstance().getTime())){
                return false;
            }
        }
        return true;
    }
    
   

    public Validator() {
    }
    public static void main(String[] arg){
        Validator v = new Validator();
        boolean isvalid = v.isValidEmailAddress("malith.13@cse.mrt.ac.lk");
        boolean isvalidd=v.isValidTelNO("07195615df");
        System.out.println(isvalidd);
    }
}
