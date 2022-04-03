package automationtest;

import java.util.ArrayList;

/**
 * Question:5 - Marks:4
 * 5.1 Create the class with the name "ArrayList_Q5"
 * 5.2	Create the main method
 * 5.3 Declare the string type ArrayList and add the values "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman", “Rest Assured”
 * 5.4 Print the list using a forEach loop.
 * <p>
 * OutPut
 * Scrum
 * Java
 * Jira
 * Selenium
 * Cucumber
 * Postman
 * Rest Assured
 */
public class ArrayList_Q5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Scrum");
        list.add("Java");
        list.add("Jira");
        list.add("Selenium");
        list.add("Postman");
        list.add("Rest Assured");

        for (String data : list) {
            System.out.println(data);

        }
    }
}