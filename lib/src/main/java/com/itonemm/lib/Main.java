package com.itonemm.lib;

public class Main {
    public static void main(String[] args) {

    }

    // 3. What will this print for the following calls?
    void weatherInterpreter(int temperature) {
        if (temperature > 30) {
            System.out.println("It's hot outside!");
        } else if (temperature < 5) {
            System.out.println("Brr, consider wearing a jacket.");
        } else {
            System.out.println("Not too hot, not too cold.");
        }
    }

    // 4. Muliple Parameters
    void printPhoto(int width, int height, boolean isColor) {
        System.out.println("Width = " + width + "cm");
        System.out.println("Height = " + height + "cm");

        if (isColor) {
            System.out.println("Print is full color.");
        } else {
            System.out.println("Print is black and white.");
        }
    }

    // 5. Write function call?
    void likePhoto(int currentLikes, String comment, boolean like) {
        // prints out comment and who is commenting
        System.out.println("Feedback: " + comment);

        if (like) {
            currentLikes = currentLikes + 1;
        }
        System.out.println("Number of likes: " + currentLikes);
    }
}



// 1.
// makeChickenSandwhich
//   - add chicken
//   - boil egg
//   - bake bread
//   - add cheese






// 2.
// Define a method called playMusic() that prints out:
// Music is playing when playButton = true and
// Music is pause when playButton = false

// playButton = ?;





// 6.
// likePhoto(0, "Nice color", true);
// likePhoto(1, "I like this", true);








// 7.
//  This function won't return the String we want.
//  Can you identify what's wrong with this code?
//    void admission(double height) {
//        String passText;
//
//        if (height > 120) {
//            passText = "You pass the height requirements.";
//        } else {
//            passText = "Sorry, you do not pass.";
//        }
//
//        return passText;
//    }