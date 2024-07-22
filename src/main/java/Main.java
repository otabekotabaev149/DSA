import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.concurrent.*;

// Required for reflection and output capture. Do not remove.
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.*;

interface Action {
    void execute() throws RuntimeException;
}

class AppController {
    public Map<String, Action> actions;

    public List<CompletableFuture<Void>> futures = Collections.synchronizedList(new ArrayList<>());

    public AppController() {
        this.actions = new HashMap<>();
    }

    public void registerAction(String name, Action action) {
        actions.put(name, action);
    }

    public void executeAction(String name) {
        Action action = actions.get(name);
        if(action == null){
            throw new IllegalArgumentException("Undefined action");
        }

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                action.execute();
            } catch(Exception e) {
                throw new IllegalStateException(e);
            }
        });

        futures.add(future);

    }

    public void waitForCompleteAllActions() {
        CompletableFuture<Void> allOf = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
        try {
            allOf.join();
        } catch (Exception e) {
            throw new IllegalStateException("Waiting for actions to complete!", e);
        }
    }
}

public class Main {

    public static void main(String[] args) {

    }

}