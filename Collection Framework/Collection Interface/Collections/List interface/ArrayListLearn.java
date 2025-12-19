import java.util.ArrayList;
import java.util.Iterator;

//Arraylist are automatical increace and decrease size according the requirement

public class ArrayListLearn{

    public static void main(String[] args) {
        

        ArrayList<String> studentsName = new ArrayList<>(); //Declaration

        studentsName.add("Rakesh");

        //Function 

        studentsName.add("Paras"); //This will add at the end of the list
        studentsName.add("vibhas");
        studentsName.add("Sujal");

        System.out.println(studentsName);

        studentsName.add(2,"Taniksh"); //this will add on specific index


        ArrayList<String> newList = new ArrayList<>();

        newList.add("Sarvesh");
        newList.add("Ramesh");

        studentsName.addAll(newList);//This will add alll element of newlist into studentsname


        System.out.println(studentsName);

        System.out.println(studentsName.get(2));
            

        studentsName.remove(1); // This will remove element at index 1
        System.out.println(studentsName);

        studentsName.remove(String.valueOf("Sarvesh")); //This will remove element "Sarvesh"
        System.out.println(studentsName);

        // //Clear the list
        // studentsName.clear();
        // System.out.println(studentsName);
 
        studentsName.set(2,"Swastik");//To update the value

        System.out.println(studentsName);

        System.out.println(studentsName.contains("Sujal")); //To check element present or  not

        System.out.println(studentsName);

        //Itrate through array

        //for loop
        for (int i = 0; i < studentsName.size(); i++) {

            System.out.println(studentsName.get(i));
            
        }

        //for each loop
        for (String el : newList) {
            System.out.println(el);
        }

        //Iterator
        Iterator<String> it = studentsName.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
            
        }

    }
}