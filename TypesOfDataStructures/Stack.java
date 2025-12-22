package TypesOfDataStructures;

class Stack {
    public static void main(String[] args) {
        // Stack = LIFO data structure. Last-In First-Out. Stores objects into a sort of
        // "vertical tower"
        // push() = To add to the top
        // pop() = To remove from the top

        Stack<String> stack = new Stack<String>();

        System.out.println(stack.isEmpty());
        stack.add("GTA V");
        stack.add("Spiderman");
        stack.add("Zelda");
        stack.add("Minecraft");
        stack.pop(); // removes Minecraft
        stack.pop(); // removes Zelda

        String myFavGame = stack.pop(); // removes Spiderman
        System.out.println("My favorite game is: " + myFavGame);

        System.out.println(stack.isEmpty());
        System.out.println(stack);

        System.out.println(stack.peek()); // shows the top item without removing it
        System.out.println(stack.search("GTA V")); // returns the position of the item (1-based index)

        // Use of stacks?
        // 1.- Undo/Redo features in text editors
        // 2.- Moving back/Forward thorugh browser history
        // 3.- Backtracking algorithms (maze, files directions, etc)
        // 4.- Calling functions (call back)

    }
}