package org.example;

public class Epic extends Task {

    protected String[] subtasks = new String[0];

    public Epic(int id, String subtasks[]) {
        super(id);
        this.subtasks = subtasks;

    }

    public String[] getSubtasks() {

        return subtasks;

    }


    @Override
    public boolean matches(String query) {
        for (int i = 0; i < subtasks.length; i++) {
            if (subtasks[i].contains(query)) {
                return true;
            }
        }
        return false;
    }
}
