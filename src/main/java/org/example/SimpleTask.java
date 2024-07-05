package org.example;

public class SimpleTask extends Task {

    protected String title;

    public SimpleTask(int id, String title) {
        super(id);
        this.title = title;
    }

    public String GetTitle() {
        return title;
    }

    @Override
    public boolean matches(String query) {
        if (title.contains(query)) {
            return true;
        }
        return false;
    }
}
