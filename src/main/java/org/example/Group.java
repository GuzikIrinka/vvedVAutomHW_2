package org.example;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{
    private String nameGroup;
    private List<Component> listComponents;

    public Group(String nameGroup) {
        this.nameGroup = nameGroup;
        this.listComponents = new ArrayList<>();
    }
    public void addComponent(Component component) {
        listComponents.add(component);
    }

    public void removeComponent(Component component) {
        listComponents.remove(component);
    }

    public String getNameGroup() {
        return nameGroup;
    }

    @Override
    public void print() {
        System.out.println(this.getNameGroup());
        for (Component component : listComponents) {
            component.print();
        }
    }

    @Override
    public int getCountPeople() {
        int count = 0;
        for (Component component : listComponents) {
            count = count + component.getCountPeople();

        }
        return count;
    }
}
