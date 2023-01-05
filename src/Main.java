import org.w3c.dom.events.Event;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors.*;

public class Main {

    static VendingMachine machine = new VendingMachine();

    static Scanner sc = new Scanner(System.in);

    static List<String, Event> eventMap = new HashMap<>();

    static {
        eventMap.add("F", Event.ADD_COIN)
    }
    public static void main(String[]args){
    while (machine.isWork()){
        if(machine.g)
    }
}
