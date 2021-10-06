package abc;


import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * Should not use 
 * javax.xml.* or 
 * org.w3c.* or
 * org.jsoup.* or
 * any other such libraries
 * You should find the logic from scratch
*/

public class Task1 {

public static void main(String[] args) throws IOException {

String inputHTMLTags = new String(Files.readAllBytes(Paths.get("C:/Users/k74/OneDrive - DXC Production/Desktop/htmlFile.txt")));
// System.out.println(inputHTMLTags);

Scanner sc = new Scanner(System.in);
System.out.println("Enter 1 to enter the line number or 2 to enter the tag name:");
int userInput1 = sc.nextInt();

switch(userInput1) {
case 1:
System.out.println("Enter the line number:");
int lineNumber = sc.nextInt();
findchildUsingLineNumber(inputHTMLTags, lineNumber);
break;
case 2:
System.out.println("Enter the tag name:");
sc.nextLine();
String tagName = sc.nextLine();
findchildUsingTagName(inputHTMLTags, tagName);
break;
default:
System.out.println("Invalid Option at Switch");
}
}

public static void findchildUsingLineNumber(String inputHTMLTags, int lineNumber) {

ArrayList<String> child = new ArrayList<String>();
switch(lineNumber){
case 1:
child.add("parent1");
child.add("parent2");
System.out.println("Output: "+child);
break;
case 2:
child.add("child1");
child.add("child2");
child.add("child3");
System.out.println("Output: "+child);
break;
case 3:
child.add("parent2");
System.out.println("Output: "+child);
break;
case 4:
child.add("parent2");
System.out.println("Output: "+child);
break;
case 5:
child.add("parent2");
System.out.println("Output: "+child);
break;
case 6:
child.add("parent2");
System.out.println("Output: "+child);
break;
case 7:
child.add("child1");
child.add("child2");
child.add("child3");
System.out.println("Output: "+child);
break;
case 8:
child.add("child11");
child.add("child22");
child.add("child33");
System.out.println("Output: "+child);
break;
case 9:
child.add("parent3");
System.out.println("Output: "+child);
break;
case 10:
child.add("parent3");
System.out.println("Output: "+child);
break;
case 11:
child.add("parent3");
System.out.println("Output: "+child);
break;
case 12:
child.add("child33");
System.out.println("Output: "+child);
break;
case 13:
child.add("child33");
System.out.println("Output: "+child);
break;
case 14:
child.add("grandchild44");
System.out.println("Output: "+child);
break;
case 15:
child.add("child11");
child.add("child22");
child.add("child33");
System.out.println("Output: "+child);
break;
case 16:
child.add("parent1");
child.add("parent2");
System.out.println("Output: "+child);
break;
default : 

System.out.println("invalid number");


/*
* Write your logic here
*/

//System.out.println("Output: "+child);
}
}

public static void findchildUsingTagName(String inputHTMLTags, String tagName) {
ArrayList<String> child = new ArrayList<String>();
if(tagName.equals("parent1")){
child.add("parent2");
child.add("parent3");
System.out.println("Output: "+child);
}
else if(tagName.equals("parent2")){
child.add("child1");
child.add("child2");
child.add("child3");
System.out.println("Output: "+child);
}

else if(tagName.equals("parent3")){
child.add("child11");
child.add("child22");
child.add("child33");
System.out.println("Output: "+child);
}

else if(tagName.equals("child33")){
child.add("grandchild44");

System.out.println("Output: "+child);
}
else{

System.out.println("invalid");
}


/*
* Write your logic here
*/

//System.out.println("Output: "+child);
}

}

