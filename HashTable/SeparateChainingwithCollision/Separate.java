package LogicHashkey.SeparateChainingLogic;

import java.util.LinkedList;

public class Separate {
    private static String[] theArray = new String[13];

    public static void main(String[] args) {
        LinkedList<String> separate = new LinkedList<>();
        String[] elementToAdd = {"3", "27", "41", "13", "6", "51", "9", "45", "21", "14", "8"};

        for (String newElementValue : elementToAdd) {
            int arrayIndex = (Integer.parseInt(newElementValue) * 3) % 13;
            if (theArray[arrayIndex] != null)
                separate.add(theArray[arrayIndex]);

            separate.add(newElementValue);
            String element = separate.toString();
            element = element.replaceAll("\\[","").replaceAll("]", "").replaceAll(",", " ->");

            theArray[arrayIndex] = element;
            separate.clear();
        }

        int index = 0;
        for (String result : theArray) {
            System.out.println("Index " + index + " for value " + result);
            index++;
        }
    }
}
