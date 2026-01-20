package de.thws.KlausurUebungen.ThreadWatcher;

import java.util.function.Consumer;

public class WebsiteChangeWatcher {
    private String target;
    private String path;

    private boolean running = true;
    private Consumer<String> callback;

    public WebsiteChangeWatcher(String target, String path, Consumer<String> callback) {
        this.target =target;
        this.path =path;
        this.callback = callback;
    }

    public void cancel(){
        this.running = false;
    }

    public void hasChanged() {

        Thread t1 =new Thread(){
            @Override
                    public void run() {
                try {
                    String content = retrieveWebsiteContent();
                    while (running) {
                        Thread.sleep(30000);
                        String newContent = retrieveWebsiteContent();

                        if(!content.equals(newContent)){
                            callback.accept(newContent);
                            content = newContent;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
    }

    /**
     *
     *
     * Reads the content of a website and returns its content as html.
     *
     * @return The content of a website as String.
     */

    private String retrieveWebsiteContent() {
        return "<html>website</html>";
    }
}

