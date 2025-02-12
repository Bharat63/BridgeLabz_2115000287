class TextState {
    String text;
    TextState next;
    TextState prev;

    public TextState(String text) {
        this.text = text;
        this.next = null;
        this.prev = null;
    }
}

class TextEditor {
    TextState currentState;
    int maxHistorySize;
    int historySize;

    public TextEditor(int maxHistorySize) {
        this.currentState = null;
        this.maxHistorySize = maxHistorySize;
        this.historySize = 0;
    }

    public void typeText(String newText) {
        TextState newState = new TextState(newText);
        if (currentState != null) {
            if (historySize >= maxHistorySize) {
                // Remove the oldest state to maintain the size of history
                removeOldestState();
            }
            currentState.next = newState;
            newState.prev = currentState;
        }
        currentState = newState;
        historySize++;
    }

    public void undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev;
            System.out.println("Undo: " + currentState.text);
        } else {
            System.out.println("No more states to undo.");
        }
    }

    public void redo() {
        if (currentState != null && currentState.next != null) {
            currentState = currentState.next;
            System.out.println("Redo: " + currentState.text);
        } else {
            System.out.println("No more states to redo.");
        }
    }

    public void displayCurrentState() {
        if (currentState != null) {
            System.out.println("Current state: " + currentState.text);
        } else {
            System.out.println("No text available.");
        }
    }

    private void removeOldestState() {
        if (currentState != null && currentState.prev != null) {
            TextState oldestState = currentState.prev;
            while (oldestState.prev != null) {
                oldestState = oldestState.prev;
            }
            oldestState.next = null;
        }
    }
}

public class TextEditorSystem {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(5);

        editor.typeText("Hello");
        editor.displayCurrentState();
        editor.typeText("Hello, world!");
        editor.displayCurrentState();
        editor.typeText("Hello, world! How are you?");
        editor.displayCurrentState();

        editor.undo();
        editor.undo();
        editor.redo();

        editor.typeText("Hello, world! How are you doing today?");
        editor.displayCurrentState();
        editor.typeText("Hello, world!");
        editor.displayCurrentState();
        editor.typeText("Hello!");
        editor.displayCurrentState();

        editor.undo();
        editor.undo();
        editor.undo();
    }
}
