package momo;

import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import momo.task.TaskList;

import java.util.Scanner;

import javafx.scene.layout.VBox;


/**
 * Handles Ui related functionality in the chatbot program, handling some user interactions
 */
public class Ui {
    private VBox dialogContainer;
    private TextField userInput;

    public Ui(VBox dialogContainer, TextField userInput) {
        this.userInput = userInput;
        this.dialogContainer = dialogContainer;
    }

    public static void showHorizontalLine() {
        System.out.println("____________________________________________________________");
    }

    private final static Scanner sc = new Scanner(System.in);

    private final Image userImage = new Image(this.getClass().getResourceAsStream("/images/userIcon.png"));
    private final Image momoImage = new Image(this.getClass().getResourceAsStream("/images/momoIcon.png"));


    public void showGreeting() {
        String input = "Greetings... I'm Momo.\n What can I do for you?";
        dialogContainer.getChildren().addAll(
                DialogBox.getMomoDialog(input, momoImage)
        );

    }

    /**
     * Scans and returns user input string
     *
     * @return Returns a String containing user input
     */
//    public String getUserInput() {
//        String input = userInput.getText();
//        dialogContainer.getChildren().addAll(
//                DialogBox.getUserDialog(input, userImage)
//        );
//        return input;
//    }

    public void printList(TaskList list) {
        showHorizontalLine();

        for (int i = 0; i < list.getCount(); i++) {
            System.out.println(i + 1 + ". " + list.getTask(i));
        }
        showHorizontalLine();
    }

    public void printTaskListCount(TaskList list) {
        System.out.printf("Now there are %d tasks in your list\n", list.getCount());
        showHorizontalLine();

    }


    /**
     * Shows an ominous farewell message and terminates the program
     */
    public void showFarewell() {
        String logo =
                "⣿⣿⣿⡉⢀⣾⣿⡟⣩⣭⣭⡈⠙⢿⣿⣿⣿⣿⣿⡿⣻⣿⣿⣿⣿⣿⣿⣿⡇⠄\n" +
                        "⣿⣿⡗⠄⣼⣿⣿⢸⡿⠉⠉⢻⡆⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢠⠄\n" +
                        "⣿⡻⠁⢠⣿⣿⣿⣦⡛⠢⠴⠛⠁⣸⣿⣿⣿⣿⡿⠛⢉⣉⣉⡙⢻⣿⣿⣗⠄⠄\n" +
                        "⠷⠁⠄⢰⣿⣿⣿⣷⣬⣭⣼⣷⣿⣿⣿⣿⣿⡏⢀⣾⠟⠛⢿⣿⣄⣿⣿⡏⠄⠄\n" +
                        "⠄⠄⠄⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⠳⢀⣀⡼⢟⣼⣿⡟⠄⠄⠄\n" +
                        "⠄⠄⠄⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣮⣒⣲⣶⣾⣿⣿⠏⠄⠄⠄⢠\n" +
                        "⠄⠄⠄⠸⣿⣽⣿⣿⣿⣿⣉⣿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠄⠄⠄⢠⣷\n" +
                        "⠄⠄⠄⠄⢻⣷⢻⣿⣿⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⠏⠄⠄⠄⠄⠄⢀⣾⣿\n" +
                        "⠄⠄⠄⠄⠄⢻⣧⡙⢿⣿⣿⣿⣿⣿⡿⣿⣿⣿⠿⠛⠁⠄⠄⠄⠄⠄⢠⣿⣿⣿\n" +
                        "⠄⠄⠄⡀⠄⠈⣿⣿⣶⣭⣭⣭⣿⣾⡿⠟⠋⠁⠄⠄⠄⠄⠄⠄⠄⢠⣿⣿⣿⣿\n" +
                        "⠄⠄⠎⠄⠄⣨⣿⣿⣿⣿⣿⣿⠋⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⡲⣿⣿⣿⣿";

        showHorizontalLine();
        System.out.println("Farewell... for now. I'll be waiting for your return, taking refuge in your shadows. Rest" +
                " well.... wħɨłɇ ɏøᵾ sŧɨłł ȼȺn\n" + logo);
        showHorizontalLine();
        sc.close();
        System.exit(0);


    }


}











