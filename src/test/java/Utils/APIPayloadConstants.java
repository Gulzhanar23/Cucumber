package Utils;

import org.json.JSONObject;

public class APIPayloadConstants {
    //we will pass the body in multiple formats, for this we have created thos class

    public static String createEmployeePayload(){
        String createEmployeePayload = "{\n" +
                "  \"emp_firstname\": \"Maria\",\n" +
                "  \"emp_lastname\": \"Mario\",\n" +
                "  \"emp_middle_name\": \"Ms\",\n" +
                "  \"emp_gender\": \"F\",\n" +
                "  \"emp_birthday\": \"1994-02-20\",\n" +
                "  \"emp_status\": \"Confirmed\",\n" +
                "  \"emp_job_title\": \"QA Engineer\"\n" +
                "}";

                return createEmployeePayload;
    }

    public static String createEmployeePayloadJson(){

        JSONObject obj= new JSONObject();
        obj.put("emp_firstname", "Maria");
        obj.put("emp_lastname", "Mario");
        obj.put("emp_middle_name", "Ms");
        obj.put("emp_gender", "F");
        obj.put("emp_birthday", "1994-02-20");
        obj.put("emp_firstname", "Maria");
        obj.put("emp_status", "Confirmed");
        obj.put("emp_job_title", "QA Engineer");

        return obj.toString();


    }

    public static String createEmployeePayloadDynamic
            (String emp_firstname, String emp_lastname,
             String emp_middle_name, String emp_gender, String emp_birthday,
             String emp_status, String emp_job_title){

        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", emp_firstname);
        obj.put("emp_lastname", emp_lastname);
        obj.put("emp_middle_name", emp_middle_name);
        obj.put("emp_gender", emp_gender);
        obj.put("emp_birthday", emp_birthday);
        obj.put("emp_status", emp_status);
        obj.put("emp_job_title", emp_job_title);

        return obj.toString();
    }

    public static String updateEmployeePayloadJson(){
        JSONObject obj = new JSONObject();
        obj.put("employee_id","53139A");
        obj.put("emp_firstname","Mila");
        obj.put("emp_lastname","Mario");
        obj.put("emp_middle_name","ll");
        obj.put("emp_gender","F");
        obj.put("emp_birthday","2023-05-20");
        obj.put("emp_status","confirmed");
        obj.put("emp_job_title","CEO");
        return obj.toString();
    }

}
